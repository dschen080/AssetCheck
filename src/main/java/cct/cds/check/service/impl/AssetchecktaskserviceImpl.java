package cct.cds.check.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

import cct.cds.check.dto.Assetchecktask4android;
import cct.cds.check.dto.AssetchecktaskParam;
import cct.cds.check.dto.AssetchecktaskStatisticsParam;
import cct.cds.check.mbg.mapper.AssetcheckhisMapper;
import cct.cds.check.mbg.mapper.AssetchecktaskMapper;
import cct.cds.check.mbg.mapper.AssetrecMapper;
import cct.cds.check.mbg.mapper.UserlistingMapper;
import cct.cds.check.mbg.model.Assetcheckhis;
import cct.cds.check.mbg.model.AssetcheckhisExample;
import cct.cds.check.mbg.model.Assetchecktask;
import cct.cds.check.mbg.model.AssetchecktaskExample;
import cct.cds.check.mbg.model.Assetrec;
import cct.cds.check.mbg.model.AssetrecExample;
import cct.cds.check.mbg.model.Userlisting;
import cct.cds.check.mbg.model.UserlistingExample;
import cct.cds.check.service.AssetchecktaskService;
import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.StrUtil;

@Service
public class AssetchecktaskserviceImpl implements AssetchecktaskService{

    @Autowired
    private AssetchecktaskMapper assetchecktaskMapper;

    @Autowired
    private AssetcheckhisMapper assetcheckhisMapper;

    @Autowired
    private AssetrecMapper assetrecMapper;

    @Autowired
    private UserlistingMapper userlistingMapper;

    @Override
    public Boolean create(AssetchecktaskParam assetchecktaskParam,String keyword,String assetdept){
        //插入任务
        Assetchecktask assetchecktask = new Assetchecktask();
        BeanUtil.copyProperties(assetchecktaskParam,assetchecktask);
        assetchecktask.setCreatetime(new Date());
        Date date = new Date();
        assetchecktask.setCreatetime(date);
        assetchecktaskMapper.insert(assetchecktask);
        AssetchecktaskExample example = new AssetchecktaskExample();
        example.createCriteria().andTaskabstractEqualTo(assetchecktask.getTaskabstract()).andOrgidEqualTo(assetchecktask.getOrgid());
        int taskid = assetchecktaskMapper.selectByExample(example).get(0).getTaskid();
        String option = assetchecktaskParam.getOption();
        String orgid =  assetchecktaskParam.getOrgid();
        if(option.equals("1")||option.equals("2")){//将任务指派给各使用人
            AssetrecExample assetrecExample = new AssetrecExample();
            AssetrecExample.Criteria criteria = assetrecExample.createCriteria();
            if(option.equals("2")){
            
                if(!keyword.equals("null")){
                    criteria.andAssetnameLike("%"+keyword+"%");
                }
                if(!assetdept.equals("null")){
                    criteria.andAssetdeptLike("%"+assetdept+"%");
                }
            }
            criteria.andOrgidEqualTo(orgid);
            List<Assetrec> assetrecList = assetrecMapper.selectByExample(assetrecExample);
            for(int i=0; i<assetrecList.size(); i++){
                Assetrec assetrec = assetrecList.get(i);
                String assetdept2 = assetrec.getAssetdept();
                String assetUser = assetrec.getAssetuser();
                //检查该姓名和部门对应的用户是否存在，若存在则加入盘点任务
                UserlistingExample userlistingExample = new UserlistingExample();
                userlistingExample.createCriteria().andSectnameEqualTo(assetdept2).andRealnameEqualTo(assetUser).andOrgidEqualTo(orgid);
                List<Userlisting> userlist = userlistingMapper.selectByExample(userlistingExample);
                //用户存在
                if(userlist.size()>0){
                    Userlisting userlisting = userlist.get(0);
                    String username4unit = userlisting.getUsername4unit();
                    Assetcheckhis assetcheckhis = new Assetcheckhis();
                    assetcheckhis.setAssetid(assetrec.getAssetid());
                    assetcheckhis.setOrgid(orgid);
                    assetcheckhis.setTaskid(taskid);
                    assetcheckhis.setCheckresult((byte)0);
                    assetcheckhis.setUsername4unit(username4unit);
                    assetcheckhisMapper.insert(assetcheckhis);
                }
            }
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

    @Override
    public List<Assetchecktask4android> list4android(String orgId,String username4unit){
        AssetchecktaskExample example = new AssetchecktaskExample();
        example.createCriteria().andOrgidEqualTo(orgId);
        List<Assetchecktask> assetchecktasks = assetchecktaskMapper.selectByExample(example);
        List<Assetchecktask4android> list = new ArrayList<>();
        for(int i=0; i<assetchecktasks.size(); i++){
            Assetchecktask assetchecktask = assetchecktasks.get(i);
            int taskid = assetchecktask.getTaskid();
            Assetchecktask4android assetchecktask4android = new Assetchecktask4android();
            //获取任务明细
            AssetcheckhisExample example2 = new AssetcheckhisExample();
            example2.createCriteria().andTaskidEqualTo(taskid).andUsername4unitEqualTo(username4unit).andCheckresultEqualTo((byte)0);
            int unfinished = assetcheckhisMapper.countByExample(example2);
            AssetcheckhisExample example3 = new AssetcheckhisExample();
            example3.createCriteria().andTaskidEqualTo(taskid).andUsername4unitEqualTo(username4unit).andCheckresultEqualTo((byte)1);
            int finished = assetcheckhisMapper.countByExample(example3);
            AssetcheckhisExample example4 = new AssetcheckhisExample();
            example4.createCriteria().andTaskidEqualTo(taskid).andUsername4unitEqualTo(username4unit).andCheckresultEqualTo((byte)3);
            int loss = assetcheckhisMapper.countByExample(example4);
            AssetcheckhisExample example5 = new AssetcheckhisExample();
            example5.createCriteria().andTaskidEqualTo(taskid).andUsername4unitEqualTo(username4unit).andCheckresultEqualTo((byte)5);
            int extra = assetcheckhisMapper.countByExample(example5);
            
            AssetchecktaskExample example6 = new AssetchecktaskExample();
            example6.createCriteria().andTaskbeginLessThan(new Date()).andTaskendGreaterThan(new Date()).andTaskidEqualTo(taskid);
            int timevalued = assetchecktaskMapper.countByExample(example6);
            String valued; 
            if(timevalued==1){
                valued = "有效";
            }
            else{
                valued = "无效";
            }
            assetchecktask4android.setTaskname(assetchecktask.getTaskabstract());
            assetchecktask4android.setExtra(extra);
            assetchecktask4android.setFinished(finished);
            assetchecktask4android.setLoss(loss);
            assetchecktask4android.setUnfinished(unfinished);
            assetchecktask4android.setValued(valued);
            assetchecktask4android.setTaskid(assetchecktask.getTaskid());
            list.add(assetchecktask4android);
        }
        return list;
    }
}
