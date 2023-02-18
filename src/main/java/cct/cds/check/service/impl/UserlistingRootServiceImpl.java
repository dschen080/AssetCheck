package cct.cds.check.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import cct.cds.check.dto.UserInfoParam2;
import cct.cds.check.mbg.mapper.UserlistingMapper;
import cct.cds.check.mbg.model.Userlisting;
import cct.cds.check.mbg.model.UserlistingExample;
import cct.cds.check.service.UserlistingRootService;
import cn.hutool.core.bean.BeanUtil;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

@Service
public class UserlistingRootServiceImpl implements UserlistingRootService{

    @Autowired
    private UserlistingMapper userlistingMapper;

    @Autowired
    private PasswordEncoder passwordEncoder; 

    @Override
    public List<Userlisting> list(String orgId,Integer pageSize, Integer pageNum){
        PageHelper.startPage(pageNum,pageSize);
        UserlistingExample example = new UserlistingExample();
        example.createCriteria().andOrgidEqualTo(orgId).andUsertypeEqualTo((byte)3);
        List<Userlisting> userlistings = userlistingMapper.selectByExample(example);
        return userlistings;
    }

    @Override
    public List<Userlisting> listroot(String orgId,Integer pageSize, Integer pageNum){
        PageHelper.startPage(pageNum,pageSize);
        UserlistingExample example = new UserlistingExample();
        example.createCriteria().andOrgidEqualTo(orgId).andUsertypeEqualTo((byte)1);
        List<Userlisting> userlistings = userlistingMapper.selectByExample(example);
        return userlistings;
    }

    @Override
    public List<Userlisting> list2(String orgid,String sectname, Integer pageSize, Integer pageNum){
        PageHelper.startPage(pageNum,pageSize);
        UserlistingExample example = new UserlistingExample();
        example.createCriteria().andOrgidEqualTo(orgid).andSectnameEqualTo(sectname).andUsertypeEqualTo((byte)5);
        List<Userlisting> userlistings = userlistingMapper.selectByExample(example);
        return userlistings;
    }

    @Override
    public Boolean create(UserInfoParam2 userInfoParam){
        Userlisting userlisting = new Userlisting();
        BeanUtil.copyProperties(userInfoParam,userlisting);
        userlisting.setUsername(userlisting.getOrgid()+userlisting.getUsername4unit());
        userlisting.setPasswd(passwordEncoder.encode(userlisting.getPasswd()));
        userlisting.setUsertype((byte)1);
        userlistingMapper.insert(userlisting);
        return true;       
    }

    @Override
    public Boolean update(UserInfoParam2 userInfoParam){
        Userlisting userlisting = new Userlisting();
        BeanUtil.copyProperties(userInfoParam,userlisting);
        userlisting.setUsername(userlisting.getOrgid()+userlisting.getUsername4unit());
        userlisting.setUsertype((byte)1);
        userlistingMapper.updateByPrimaryKey(userlisting);
        return true;
    }

    @Override
    public Boolean create3(UserInfoParam2 userInfoParam){
        Userlisting userlisting = new Userlisting();
        BeanUtil.copyProperties(userInfoParam,userlisting);
        userlisting.setUsername(userlisting.getOrgid()+userlisting.getUsername4unit());
        userlisting.setPasswd(passwordEncoder.encode(userlisting.getPasswd()));
        userlisting.setUsertype((byte)3);
        userlistingMapper.insert(userlisting);
        return true;       
    }

    @Override
    public Boolean update3(UserInfoParam2 userInfoParam){
        Userlisting userlisting = new Userlisting();
        BeanUtil.copyProperties(userInfoParam,userlisting);
        userlisting.setUsername(userlisting.getOrgid()+userlisting.getUsername4unit());
        userlisting.setUsertype((byte)3);
        userlistingMapper.updateByPrimaryKey(userlisting);
        return true;
    }

    @Override
    public Boolean create5(UserInfoParam2 userInfoParam){
        Userlisting userlisting = new Userlisting();
        BeanUtil.copyProperties(userInfoParam,userlisting);
        userlisting.setUsername(userlisting.getOrgid()+userlisting.getUsername4unit());
        userlisting.setPasswd(passwordEncoder.encode(userlisting.getPasswd()));
        userlisting.setUsertype((byte)5);
        userlistingMapper.insert(userlisting);
        return true;       
    }

    @Override
    public Boolean update5(UserInfoParam2 userInfoParam){
        Userlisting userlisting = new Userlisting();
        BeanUtil.copyProperties(userInfoParam,userlisting);
        userlisting.setUsername(userlisting.getOrgid()+userlisting.getUsername4unit());
        userlisting.setUsertype((byte)5);
        userlistingMapper.updateByPrimaryKey(userlisting);
        return true;
    }

    @Override
    public Boolean delete(String username){
        userlistingMapper.deleteByPrimaryKey(username);
        return true;
    }

}
