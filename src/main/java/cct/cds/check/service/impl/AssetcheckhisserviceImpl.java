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
}
