package cct.cds.check.service;

import java.util.List;

import cct.cds.check.mbg.model.Assetrec;

public interface AssetrecService {

    List<Assetrec> list(Integer pageSize, Integer pageNum, String keyword, String orgid);

    List<Assetrec> departlist(Integer pageSize, Integer pageNum, String keyword, String orgid, String depart);

    Boolean create(Assetrec orglisting);

    Boolean update(Assetrec orglisting);

    Boolean delete(int assetid);
}
