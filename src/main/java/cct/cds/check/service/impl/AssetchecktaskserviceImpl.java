package cct.cds.check.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

import cct.cds.check.dto.AssetchecktaskParam;
import cct.cds.check.dto.AssetchecktaskStatisticsParam;
import cct.cds.check.mbg.mapper.AssetcheckhisMapper;
import cct.cds.check.mbg.mapper.AssetchecktaskMapper;
import cct.cds.check.mbg.mapper.AssetrecMapper;
import cct.cds.check.mbg.model.Assetcheckhis;
import cct.cds.check.mbg.model.AssetcheckhisExample;
import cct.cds.check.mbg.model.Assetchecktask;
import cct.cds.check.mbg.model.AssetchecktaskExample;
import cct.cds.check.mbg.model.AssetrecExample;
import cct.cds.check.service.AssetchecktaskService;
import cn.hutool.core.bean.BeanUtil;

@Service
public class AssetchecktaskserviceImpl implements AssetchecktaskService{

    @Autowired
    private AssetchecktaskMapper assetchecktaskMapper;

    @Autowired
    private AssetcheckhisMapper assetcheckhisMapper;

    @Autowired
    private AssetrecMapper assetrecMapper;

    @Override
    public Boolean create(AssetchecktaskParam assetchecktaskParam){
        //插入任务
        Assetchecktask assetchecktask = new Assetchecktask();
        BeanUtil.copyProperties(assetchecktaskParam,assetchecktask);
        Date date = new Date();
        assetchecktask.setCreatetime(date);
        assetchecktaskMapper.insert(assetchecktask);
        AssetchecktaskExample example2 = new AssetchecktaskExample();
        example2.createCriteria().andTaskabstractEqualTo(assetchecktask.getTaskabstract()).andOrgidEqualTo(assetchecktask.getOrgid());
        int taskid = assetchecktaskMapper.selectByExample(example2).get(0).getTaskid();
        //插入资产
        List<Integer> assetidlist = assetchecktaskParam.getAssetid();
        for(int i=0; i<assetidlist.size(); i++){
            Assetcheckhis assetcheckhis = new Assetcheckhis();
            AssetcheckhisExample example = new AssetcheckhisExample();
            Integer assetid = assetidlist.get(i);
            AssetrecExample example3 = new AssetrecExample();
            example3.createCriteria().andAssetidEqualTo(assetid);
            String username4unit = assetrecMapper.selectByExample(example3).get(0).getAssetuser();
            example.createCriteria().andAssetidEqualTo(assetid);
            int tasknum = assetcheckhisMapper.countByExample(example);
            assetcheckhis.setTaskid(tasknum+1);
            assetcheckhis.setOrgid(assetchecktaskParam.getOrgid());
            assetcheckhis.setAssetid(assetid);
            assetcheckhis.setCheckresult((byte)0);
            assetcheckhis.setUsername4unit(username4unit);
            assetcheckhis.setUpdatetime(new Date());
            assetcheckhis.setTaskid(taskid);
            assetcheckhisMapper.insert(assetcheckhis);
        }
        return true;
    }

    @Override
    public List<AssetchecktaskStatisticsParam> list(String orgId,Integer pageSize, Integer pageNum){
        PageHelper.startPage(pageNum,pageSize);
        AssetchecktaskExample example = new AssetchecktaskExample();
        example.createCriteria().andOrgidEqualTo(orgId);
        List<Assetchecktask> list = assetchecktaskMapper.selectByExample(example); 
        List<AssetchecktaskStatisticsParam> list2 = new ArrayList<>();
        for(int i=0; i<list.size(); i++){
            Assetchecktask assetchecktask = list.get(i);
            AssetchecktaskStatisticsParam assetchecktaskStatisticsParam = new AssetchecktaskStatisticsParam();
            BeanUtil.copyProperties(assetchecktask,assetchecktaskStatisticsParam);
            //获取盘点任务统计数据
            int taskid = assetchecktask.getTaskid();
            AssetcheckhisExample example2 = new AssetcheckhisExample();
            example2.createCriteria().andTaskidEqualTo(taskid);
            int checksum = assetcheckhisMapper.countByExample(example2);
            example2 = new AssetcheckhisExample();
            example2.createCriteria().andTaskidEqualTo(taskid).andCheckresultEqualTo((byte)1);
            int checked = assetcheckhisMapper.countByExample(example2);
            example2 = new AssetcheckhisExample();
            example2.createCriteria().andTaskidEqualTo(taskid).andCheckresultEqualTo((byte)3);
            int loss = assetcheckhisMapper.countByExample(example2);
            example2 = new AssetcheckhisExample();
            example2.createCriteria().andTaskidEqualTo(taskid).andCheckresultEqualTo((byte)0);
            int tobechecked = assetcheckhisMapper.countByExample(example2);
            example2 = new AssetcheckhisExample();
            
            assetchecktaskStatisticsParam.setChecksum(checksum);
            assetchecktaskStatisticsParam.setChecked(checked);
            assetchecktaskStatisticsParam.setLoss(loss);
            assetchecktaskStatisticsParam.setTobechecked(tobechecked);
            list2.add(assetchecktaskStatisticsParam);
        }
        return list2;
    }
    
    @Override
    public Boolean delete(int taskid){
        assetchecktaskMapper.deleteByPrimaryKey(taskid);
        return true;
    }
}
