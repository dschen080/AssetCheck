package cct.cds.check.service;

import java.util.List;

import cct.cds.check.dto.AssetcheckhisParam;

public interface AssetcheckhisService {

    List<AssetcheckhisParam> list(Integer taskid,Integer pageSize, Integer pageNum);

    List<AssetcheckhisParam> list2(Integer pageSize, Integer pageNum);

    Boolean delete(int assetchkid); 
}
