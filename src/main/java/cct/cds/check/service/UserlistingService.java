package cct.cds.check.service;

import org.springframework.security.core.userdetails.UserDetails;

import cct.cds.check.dto.UserInfoParam;
import cct.cds.check.mbg.model.Userlisting;

public interface UserlistingService {

    Userlisting getUserlistByUsername(String username);

    String login(String username, String password);

    UserDetails loadUserByUsername(String username);

    boolean register(Userlisting userlisting);

    boolean updateAccountInfo(UserInfoParam userParam);  //修改用户信息

    boolean updateAccountPassword(String username,String password);  //修改用户密码

    boolean deleteAccount(String username);

    String getOrgname(String orgid);
}
