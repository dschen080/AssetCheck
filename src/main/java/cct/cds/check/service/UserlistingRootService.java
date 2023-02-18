package cct.cds.check.service;

import java.util.List;

import cct.cds.check.dto.UserInfoParam2;
import cct.cds.check.mbg.model.Userlisting;

public interface UserlistingRootService {

    List<Userlisting> list(String orgId,Integer pageSize, Integer pageNum);

    List<Userlisting> listroot(String orgId,Integer pageSize, Integer pageNum);

    List<Userlisting> list2(String orgid, String sectname,Integer pageSize, Integer pageNum);

    Boolean create(UserInfoParam2 userInfoParam);

    Boolean update(UserInfoParam2 userInfoParam);

    Boolean create3(UserInfoParam2 userInfoParam);

    Boolean update3(UserInfoParam2 userInfoParam);

    Boolean create5(UserInfoParam2 userInfoParam);

    Boolean update5(UserInfoParam2 userInfoParam);

    Boolean delete(String username);
    
}
