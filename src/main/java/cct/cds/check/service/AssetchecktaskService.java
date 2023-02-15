package cct.cds.check.service;

import java.util.List;

import cct.cds.check.dto.Assetchecktask4android;
import cct.cds.check.dto.AssetchecktaskParam;
import cct.cds.check.dto.AssetchecktaskStatisticsParam;
import cct.cds.check.mbg.model.Assetchecktask;

public interface AssetchecktaskService {

    Boolean create(AssetchecktaskParam assetchecktaskParam,String keyword,String assetdept);

    List<AssetchecktaskStatisticsParam> list(String orgId,Integer pageSize, Integer pageNum);

    Boolean delete(int taskid); 

    List<Assetchecktask4android> list4android(String orgId, String username4unit);
}
