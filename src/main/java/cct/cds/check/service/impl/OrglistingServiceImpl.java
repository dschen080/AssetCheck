package cct.cds.check.service.impl;

import cct.cds.check.mbg.mapper.OrglistingMapper;
import cct.cds.check.mbg.model.Orglisting;
import cct.cds.check.mbg.model.OrglistingExample;
import cct.cds.check.service.OrglistingService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

@Service
public class OrglistingServiceImpl implements OrglistingService{

    @Autowired
    private OrglistingMapper orglistingMapper;
    
    @Override
    public List<Orglisting> list(Integer pageSize, Integer pageNum){
        PageHelper.startPage(pageNum,pageSize);
        OrglistingExample example = new OrglistingExample();
        example.createCriteria();
        return orglistingMapper.selectByExample(example);
    }

    @Override
    public Boolean create(Orglisting orglisting){
        orglistingMapper.insert(orglisting);
        return true;       
    }

    @Override
    public Boolean update(Orglisting orglisting){
        orglistingMapper.updateByPrimaryKey(orglisting);
        return true;
    }

    @Override
    public Boolean delete(String orgId){
        orglistingMapper.deleteByPrimaryKey(orgId);
        return true;
    }
}
