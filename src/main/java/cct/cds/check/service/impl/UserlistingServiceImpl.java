package cct.cds.check.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Service;

import cct.cds.check.bo.AdminDetails;
import cct.cds.check.common.exception.Asserts;
import cct.cds.check.dto.UserInfoParam;
import cct.cds.check.mbg.mapper.OrglistingMapper;
import cct.cds.check.mbg.mapper.UserlistingMapper;
import cct.cds.check.mbg.model.Orglisting;
import cct.cds.check.mbg.model.OrglistingExample;
import cct.cds.check.mbg.model.Userlisting;
import cct.cds.check.mbg.model.UserlistingExample;
import cct.cds.check.service.UserlistingService;
import cct.cds.check.util.JwtTokenUtil;
import cn.hutool.core.bean.BeanUtil;

@Service
public class UserlistingServiceImpl implements UserlistingService{
    
    private static final Logger LOGGER = LoggerFactory.getLogger(UserlistingServiceImpl.class);
    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private PasswordEncoder passwordEncoder;  
      
    @Autowired
    private UserlistingMapper userlistingMapper;

    @Autowired
    private OrglistingMapper orglistingMapper;


    @Override
    public Userlisting getUserlistByUsername(String username){
        UserlistingExample example = new UserlistingExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<Userlisting> userlistList = userlistingMapper.selectByExample(example);
        if(userlistList != null && userlistList.size()>0){
            Userlisting userlisting = userlistList.get(0);
            return userlisting;
        }
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String username){
        Userlisting userlisting = getUserlistByUsername(username);
        if(userlisting != null){
            AdminDetails details = new AdminDetails(userlisting);
            return details;
        }
        throw new UsernameNotFoundException("用户名或密码错误");
    }

    @Override
    public String login(String username, String password){
        String token = null;
        try{
            UserDetails userDetails = loadUserByUsername(username);
            if(!passwordEncoder.matches(password,userDetails.getPassword())){
                Asserts.fail("密码不正确");
            }
            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
            token = jwtTokenUtil.generateToken(userDetails);
        }
        catch (AuthenticationException e){
            LOGGER.warn("登录异常:{}", e.getMessage());
        }
        return token;
    }

    @Override
    public boolean register(Userlisting userlisting){
        //查询是否已被注册
        UserlistingExample example = new UserlistingExample();
        example.createCriteria().andUsernameEqualTo(userlisting.getUsername());
        List<Userlisting> list = userlistingMapper.selectByExample(example);
        if(list.size()>0){
            return false;
        }
        //注册
        userlisting.setUsername(userlisting.getOrgid()+userlisting.getUsername4unit());
        userlisting.setPasswd(passwordEncoder.encode(userlisting.getPasswd()));
        userlistingMapper.insert(userlisting);
        return true;
    }

    
    @Override
    public boolean updateAccountInfo(UserInfoParam userInfoParam){
        UserlistingExample example = new UserlistingExample();
        example.createCriteria().andUsernameEqualTo(userInfoParam.getUsername());
        List<Userlisting> list = userlistingMapper.selectByExample(example);
        userlistingMapper.deleteByExample(example);//
        Userlisting userlist = list.get(0);
        BeanUtil.copyProperties(userInfoParam, list);//copy properties
        userlistingMapper.insert(userlist);
        return true;
    }

    @Override
    public boolean updateAccountPassword(String username,String password){
        UserlistingExample example = new UserlistingExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<Userlisting> list = userlistingMapper.selectByExample(example);
        Userlisting userlisting = list.get(0);
        userlisting.setPasswd(passwordEncoder.encode(password));
        userlistingMapper.updateByExample(userlisting, example);
        return true;
    }

    @Override
    public boolean deleteAccount(String username){
        UserlistingExample example = new UserlistingExample();
        example.createCriteria().andUsernameEqualTo(username);
        userlistingMapper.deleteByExample(example);
        return true;
    }

    @Override
    public String getOrgname(String orgid){
        Orglisting orglist = orglistingMapper.selectByPrimaryKey(orgid);
        if(orglist!=null){
            return orglist.getUnitname();
        }
        return null;

    }
}
