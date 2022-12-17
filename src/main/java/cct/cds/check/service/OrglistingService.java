package cct.cds.check.service;

import java.util.List;

import cct.cds.check.mbg.model.Orglisting;

public interface OrglistingService {

    List<Orglisting> list(Integer pageSize, Integer pageNum);

    Boolean create(Orglisting orglisting);

    Boolean update(Orglisting orglisting);

    Boolean delete(String orgId);
    
}
