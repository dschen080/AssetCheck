package cct.cds.check.mbg.mapper;

import cct.cds.check.mbg.model.Orglisting;
import cct.cds.check.mbg.model.OrglistingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrglistingMapper {
    int countByExample(OrglistingExample example);

    int deleteByExample(OrglistingExample example);

    int deleteByPrimaryKey(String orgid);

    int insert(Orglisting record);

    int insertSelective(Orglisting record);

    List<Orglisting> selectByExample(OrglistingExample example);

    Orglisting selectByPrimaryKey(String orgid);

    int updateByExampleSelective(@Param("record") Orglisting record, @Param("example") OrglistingExample example);

    int updateByExample(@Param("record") Orglisting record, @Param("example") OrglistingExample example);

    int updateByPrimaryKeySelective(Orglisting record);

    int updateByPrimaryKey(Orglisting record);
}