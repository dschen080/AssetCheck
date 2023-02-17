package cct.cds.check.service;

import java.util.List;

import cct.cds.check.common.api.CommonPage;
import cct.cds.check.dto.AssetcheckhisParam;
import cct.cds.check.mbg.model.Assetrec;

public interface AssetcheckhisService {

    CommonPage<AssetcheckhisParam> list(Integer taskid,Integer pageSize, Integer pageNum);

    CommonPage<AssetcheckhisParam> list2(Integer pageSize, Integer pageNum, String orgid);

    Boolean delete(int assetchkid); 

    List<Assetrec> select4android(String orgid,String username4unit,int taskid,byte checkresult);

    void check(String orgid,String code4gs1, byte checkresult, int taskid);

    int addExtraAsset(String orgid,String username4unit,int taskid,String code4gs1);
}
