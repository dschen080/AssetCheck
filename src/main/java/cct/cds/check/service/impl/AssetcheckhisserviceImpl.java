package cct.cds.check.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cct.cds.check.common.api.CommonPage;
import cct.cds.check.dto.AssetcheckhisParam;
import cct.cds.check.mbg.mapper.AssetcheckhisMapper;
import cct.cds.check.mbg.mapper.AssetrecMapper;
import cct.cds.check.mbg.mapper.UserlistingMapper;
import cct.cds.check.mbg.model.Assetcheckhis;
import cct.cds.check.mbg.model.AssetcheckhisExample;
import cct.cds.check.mbg.model.Assetrec;
import cct.cds.check.mbg.model.AssetrecExample;
import cct.cds.check.mbg.model.UserlistingExample;
import cct.cds.check.service.AssetcheckhisService;
import cn.hutool.core.bean.BeanUtil;

@Service
public class AssetcheckhisserviceImpl implements AssetcheckhisService{
    
    @Autowired
    private AssetcheckhisMapper assetcheckhisMapper;

    @Autowired
    private AssetrecMapper assetrecMapper;

    @Autowired
    private UserlistingMapper userlistingMapper;

    @Override
    public CommonPage<AssetcheckhisParam> list(Integer taskid,Integer pageSize, Integer pageNum){
        PageHelper.startPage(pageNum,pageSize);
        AssetcheckhisExample example = new AssetcheckhisExample();
        example.createCriteria().andTaskidEqualTo(taskid);
        List<Assetcheckhis> list = assetcheckhisMapper.selectByExample(example);
        //确定分页数量
        int count = assetcheckhisMapper.countByExample(example);
        int pages = 0;
        if(count%pageSize==0){
            pages = count/pageNum;
        }
        else{
            pages = count/pageNum+1;
        }
        List<AssetcheckhisParam> list2 = new ArrayList<>();
        for(int i=0; i<list.size(); i++){
            Assetcheckhis assetcheckhis = list.get(i);
            AssetcheckhisParam assetcheckhisParam = new AssetcheckhisParam();
            BeanUtil.copyProperties(assetcheckhis, assetcheckhisParam);
            int assetid = assetcheckhis.getAssetid();
            Assetrec assetrec = assetrecMapper.selectByPrimaryKey(assetid);
            BeanUtil.copyProperties(assetrec, assetcheckhisParam);
            UserlistingExample userlistingExample = new UserlistingExample();
            userlistingExample.createCriteria().andOrgidEqualTo(assetcheckhisParam.getOrgid()).andUsername4unitEqualTo(assetcheckhisParam.getUsername4unit());
            if(userlistingMapper.countByExample(userlistingExample)>0){
                String name = userlistingMapper.selectByExample(userlistingExample).get(0).getRealname();
                assetcheckhisParam.setUsername4unit(name);
            }
            list2.add(assetcheckhisParam);
        }
        CommonPage<AssetcheckhisParam> result = new CommonPage<AssetcheckhisParam>();
        PageInfo<AssetcheckhisParam> pageInfo = new PageInfo<AssetcheckhisParam>(list2);
        result.setTotalPage(pages);
        result.setPageNum(pageInfo.getPageNum());
        result.setPageSize(pageInfo.getPageSize());
        result.setTotal(Long.parseLong(Integer.toString(count)));
        result.setList(pageInfo.getList());
        return result;
    }

    @Override
    public CommonPage<AssetcheckhisParam> list2(Integer pageSize, Integer pageNum,String orgid){
        PageHelper.startPage(pageNum,pageSize);
        AssetcheckhisExample example = new AssetcheckhisExample();
        example.createCriteria().andOrgidEqualTo(orgid);
        List<Assetcheckhis> list = assetcheckhisMapper.selectByExample(example);
        //确定分页数量
        int count = assetcheckhisMapper.countByExample(example);
        int pages = 0;
        if(count%pageSize==0){
            pages = count/pageNum;
        }
        else{
            pages = count/pageNum+1;
        }
        List<AssetcheckhisParam> list2 = new ArrayList<>();
        for(int i=0; i<list.size(); i++){
            Assetcheckhis assetcheckhis = list.get(i);
            AssetcheckhisParam assetcheckhisParam = new AssetcheckhisParam();
            BeanUtil.copyProperties(assetcheckhis, assetcheckhisParam);
            int assetid = assetcheckhis.getAssetid();
            Assetrec assetrec = assetrecMapper.selectByPrimaryKey(assetid);
            BeanUtil.copyProperties(assetrec, assetcheckhisParam);
            UserlistingExample userlistingExample = new UserlistingExample();
            userlistingExample.createCriteria().andOrgidEqualTo(assetcheckhisParam.getOrgid()).andUsername4unitEqualTo(assetcheckhisParam.getUsername4unit());
            String name = userlistingMapper.selectByExample(userlistingExample).get(0).getRealname();
            if(userlistingMapper.countByExample(userlistingExample)>0){
                String names = userlistingMapper.selectByExample(userlistingExample).get(0).getRealname();
                assetcheckhisParam.setUsername4unit(names);
            }
            list2.add(assetcheckhisParam);
        }
        CommonPage<AssetcheckhisParam> result = new CommonPage<AssetcheckhisParam>();
        PageInfo<AssetcheckhisParam> pageInfo = new PageInfo<AssetcheckhisParam>(list2);
        result.setTotalPage(pages);
        result.setPageNum(pageInfo.getPageNum());
        result.setPageSize(pageInfo.getPageSize());
        result.setTotal(Long.parseLong(Integer.toString(count)));
        result.setList(pageInfo.getList());
        return result;
        
    }
    
    @Override
    public Boolean delete(int assetchkid){
        assetcheckhisMapper.deleteByPrimaryKey(assetchkid);
        return true;
    }

    @Override
    public List<Assetrec> select4android(String orgid,String username4unit,int taskid,byte checkresult){
        AssetcheckhisExample example = new AssetcheckhisExample();
        example.createCriteria().andOrgidEqualTo(orgid).andUsername4unitEqualTo(username4unit).andTaskidEqualTo(taskid).andCheckresultEqualTo(checkresult);
        List<Assetcheckhis> list = assetcheckhisMapper.selectByExample(example);
        List<Assetrec> list2 = new ArrayList<>();
        for(int i=0; i<list.size(); i++){
            int assetid = list.get(i).getAssetid();
            Assetrec assetrec = assetrecMapper.selectByPrimaryKey(assetid);
            list2.add(assetrec);
        }
        return list2;
    }

    @Override
    public void check(String orgid,String code4gs1, byte checkresult,int taskid){
        AssetcheckhisExample example = new AssetcheckhisExample();
        AssetrecExample example2 = new AssetrecExample();
        example2.createCriteria().andCode4gs1EqualTo(code4gs1).andOrgidEqualTo(orgid);
        int assetid = assetrecMapper.selectByExample(example2).get(0).getAssetid();
        example.createCriteria().andAssetidEqualTo(assetid).andTaskidEqualTo(taskid);
        Assetcheckhis assetcheckhis = assetcheckhisMapper.selectByExample(example).get(0);
        assetcheckhis.setCheckresult(checkresult);
        assetcheckhisMapper.updateByPrimaryKey(assetcheckhis);
    }

    @Override
    public int addExtraAsset(String orgid,String username4unit,int taskid,String code4gs1){
        AssetrecExample example = new AssetrecExample();
        example.createCriteria().andCode4gs1EqualTo(code4gs1);
        List<Assetrec> list = assetrecMapper.selectByExample(example);
        if(list.size()==0){
            return 0;
        }
        int assetid = list.get(0).getAssetid();
        Assetcheckhis assetcheckhis = new Assetcheckhis();
        assetcheckhis.setAssetid(assetid);
        assetcheckhis.setCheckmode((byte)5);
        assetcheckhis.setOrgid(orgid);
        assetcheckhis.setTaskid(taskid);
        assetcheckhis.setUsername4unit(username4unit);
        assetcheckhis.setUpdatetime(new Date());
        assetcheckhisMapper.insert(assetcheckhis);
        return 1;
    }
}
