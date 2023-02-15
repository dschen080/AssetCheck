package cct.cds.check.service;

import java.util.List;

import cct.cds.check.dto.AssetcheckhisParam;
import cct.cds.check.mbg.model.Assetrec;

public interface AssetcheckhisService {

    List<AssetcheckhisParam> list(Integer taskid,Integer pageSize, Integer pageNum);

    List<AssetcheckhisParam> list2(Integer pageSize, Integer pageNum);

    Boolean delete(int assetchkid); 

    List<Assetrec> select4android(String orgid,String username4unit,int taskid,byte checkresult);

    void check(String orgid,String code4gs1, byte checkresult, int taskid);

    int addExtraAsset(String orgid,String username4unit,int taskid,String code4gs1);
}
