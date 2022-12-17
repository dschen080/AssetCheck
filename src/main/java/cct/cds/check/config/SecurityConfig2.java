package cct.cds.check.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import cct.cds.check.bo.AdminDetails;
import cct.cds.check.mbg.mapper.UserlistingMapper;
import cct.cds.check.mbg.model.Userlisting;
import cct.cds.check.mbg.model.UserlistingExample;
@Configuration
public class SecurityConfig2 {
    
    @Autowired
    private UserlistingMapper userlistingMapper;

    @Bean
    public UserDetailsService userDetailsService() {
        //获取登录用户信息
        return new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
                UserlistingExample example = new UserlistingExample();
                example.createCriteria().andUsernameEqualTo(username);
                List<Userlisting> userlistingList = userlistingMapper.selectByExample(example);
                if(userlistingList != null && userlistingList.size()>0){
                    return new AdminDetails(userlistingList.get(0));
                }
                throw new UsernameNotFoundException("用户名或密码错误");
            }
        };
    }
}
