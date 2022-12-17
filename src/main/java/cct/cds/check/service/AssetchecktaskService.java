package cct.cds.check.service;

import java.util.List;

import cct.cds.check.dto.AssetchecktaskParam;
import cct.cds.check.dto.AssetchecktaskStatisticsParam;
import cct.cds.check.mbg.model.Assetchecktask;

public interface AssetchecktaskService {

    Boolean create(AssetchecktaskParam assetchecktaskParam);

    List<AssetchecktaskStatisticsParam> list(String orgId,Integer pageSize, Integer pageNum);

    Boolean delete(int taskid); 
}
