package cct.cds.check.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

import cct.cds.check.dto.AssetcheckhisParam;
import cct.cds.check.mbg.mapper.AssetcheckhisMapper;
import cct.cds.check.mbg.mapper.AssetrecMapper;
import cct.cds.check.mbg.model.Assetcheckhis;
import cct.cds.check.mbg.model.AssetcheckhisExample;
import cct.cds.check.mbg.model.Assetrec;
import cct.cds.check.mbg.model.AssetrecExample;
import cct.cds.check.service.AssetcheckhisService;
import cn.hutool.core.bean.BeanUtil;

@Service
public class AssetcheckhisserviceImpl implements AssetcheckhisService{
    
    @Autowired
    private AssetcheckhisMapper assetcheckhisMapper;

    @Autowired
    private AssetrecMapper assetrecMapper;

    @Override
    public List<AssetcheckhisParam> list(Integer taskid,Integer pageSize, Integer pageNum){
        PageHelper.startPage(pageNum,pageSize);
        AssetcheckhisExample example = new AssetcheckhisExample();
        example.createCriteria().andTaskidEqualTo(taskid);
        List<Assetcheckhis> list = assetcheckhisMapper.selectByExample(example);
        List<AssetcheckhisParam> list2 = new ArrayList<>();
        for(int i=0; i<list.size(); i++){
            Assetcheckhis assetcheckhis = list.get(i);
            AssetcheckhisParam assetcheckhisParam = new AssetcheckhisParam();
            BeanUtil.copyProperties(assetcheckhis, assetcheckhisParam);
            int assetid = assetcheckhis.getAssetid();
            Assetrec assetrec = assetrecMapper.selectByPrimaryKey(assetid);
            BeanUtil.copyProperties(assetrec, assetcheckhisParam);
            list2.add(assetcheckhisParam);
        }
        return list2;
    }

    @Override
    public List<AssetcheckhisParam> list2(Integer pageSize, Integer pageNum){
        PageHelper.startPage(pageNum,pageSize);
        AssetcheckhisExample example = new AssetcheckhisExample();
        example.createCriteria();
        List<Assetcheckhis> list = assetcheckhisMapper.selectByExample(example);
        List<AssetcheckhisParam> list2 = new ArrayList<>();
        for(int i=0; i<list.size(); i++){
            Assetcheckhis assetcheckhis = list.get(i);
            AssetcheckhisParam assetcheckhisParam = new AssetcheckhisParam();
            BeanUtil.copyProperties(assetcheckhis, assetcheckhisParam);
            int assetid = assetcheckhis.getAssetid();
            Assetrec assetrec = assetrecMapper.selectByPrimaryKey(assetid);
            BeanUtil.copyProperties(assetrec, assetcheckhisParam);
            list2.add(assetcheckhisParam);
        }
        return list2;
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
    public void check(String code4gs1, byte checkresult,int taskid){
        AssetcheckhisExample example = new AssetcheckhisExample();
        AssetrecExample example2 = new AssetrecExample();
        example2.createCriteria().andCode4gs1EqualTo(code4gs1);
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
