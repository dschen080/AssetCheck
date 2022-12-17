package cct.cds.check.mbg.mapper;

import cct.cds.check.mbg.model.Assetcheck;
import cct.cds.check.mbg.model.AssetcheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssetcheckMapper {
    int countByExample(AssetcheckExample example);

    int deleteByExample(AssetcheckExample example);

    int deleteByPrimaryKey(Integer assetid);

    int insert(Assetcheck record);

    int insertSelective(Assetcheck record);

    List<Assetcheck> selectByExample(AssetcheckExample example);

    Assetcheck selectByPrimaryKey(Integer assetid);

    int updateByExampleSelective(@Param("record") Assetcheck record, @Param("example") AssetcheckExample example);

    int updateByExample(@Param("record") Assetcheck record, @Param("example") AssetcheckExample example);

    int updateByPrimaryKeySelective(Assetcheck record);

    int updateByPrimaryKey(Assetcheck record);
}