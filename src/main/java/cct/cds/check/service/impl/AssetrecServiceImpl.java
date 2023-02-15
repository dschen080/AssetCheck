package cct.cds.check.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

import cct.cds.check.mbg.mapper.AssetrecMapper;
import cct.cds.check.mbg.model.Assetrec;
import cct.cds.check.mbg.model.AssetrecExample;
import cct.cds.check.service.AssetrecService;
import com.github.pagehelper.PageHelper;

@Service
public class AssetrecServiceImpl implements AssetrecService{
    
    @Autowired
    private AssetrecMapper assetrecMapper;

    @Override
    public List<Assetrec> list(Integer pageSize, Integer pageNum, String keyword, String orgid, String assetdept){
        PageHelper.startPage(pageNum,pageSize);
        AssetrecExample example = new AssetrecExample();
        AssetrecExample.Criteria criteria = example.createCriteria();
        criteria.andOrgidEqualTo(orgid);
        if(!keyword.equals("null")){
            criteria.andAssetnameLike("%"+keyword+"%");
        }
        if(!assetdept.equals("null")){
            criteria.andAssetdeptLike("%"+assetdept+"%");
        }
        return assetrecMapper.selectByExample(example);
    }

    @Override
    public List<Assetrec> departlist(Integer pageSize, Integer pageNum, String keyword, String orgid, String depart){
        PageHelper.startPage(pageNum,pageSize);
        AssetrecExample example = new AssetrecExample();
        example.createCriteria().andAssetnameLike(keyword).andOrgidEqualTo(orgid).andAssetdeptEqualTo(depart);
        return assetrecMapper.selectByExample(example);
    }

    @Override
    public Boolean create(Assetrec assetrec){
        assetrec = new Assetrec();
        assetrecMapper.insert(assetrec);
        return true;       
    }

    @Override
    public Boolean update(Assetrec assetrec){
        assetrecMapper.updateByPrimaryKey(assetrec);
        return true;
    }

    @Override
    public Boolean delete(int assetid){
        assetrecMapper.deleteByPrimaryKey(assetid);
        return true;
    }
}
