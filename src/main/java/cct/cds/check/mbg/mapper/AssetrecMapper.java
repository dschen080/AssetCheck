package cct.cds.check.mbg.mapper;

import cct.cds.check.mbg.model.Assetrec;
import cct.cds.check.mbg.model.AssetrecExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssetrecMapper {
    int countByExample(AssetrecExample example);

    int deleteByExample(AssetrecExample example);

    int deleteByPrimaryKey(Integer assetid);

    int insert(Assetrec record);

    int insertSelective(Assetrec record);

    List<Assetrec> selectByExample(AssetrecExample example);

    Assetrec selectByPrimaryKey(Integer assetid);

    int updateByExampleSelective(@Param("record") Assetrec record, @Param("example") AssetrecExample example);

    int updateByExample(@Param("record") Assetrec record, @Param("example") AssetrecExample example);

    int updateByPrimaryKeySelective(Assetrec record);

    int updateByPrimaryKey(Assetrec record);
}