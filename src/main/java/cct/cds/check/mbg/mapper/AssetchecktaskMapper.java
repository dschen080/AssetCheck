package cct.cds.check.mbg.mapper;

import cct.cds.check.mbg.model.Assetchecktask;
import cct.cds.check.mbg.model.AssetchecktaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssetchecktaskMapper {
    int countByExample(AssetchecktaskExample example);

    int deleteByExample(AssetchecktaskExample example);

    int deleteByPrimaryKey(Integer taskid);

    int insert(Assetchecktask record);

    int insertSelective(Assetchecktask record);

    List<Assetchecktask> selectByExample(AssetchecktaskExample example);

    Assetchecktask selectByPrimaryKey(Integer taskid);

    int updateByExampleSelective(@Param("record") Assetchecktask record, @Param("example") AssetchecktaskExample example);

    int updateByExample(@Param("record") Assetchecktask record, @Param("example") AssetchecktaskExample example);

    int updateByPrimaryKeySelective(Assetchecktask record);

    int updateByPrimaryKey(Assetchecktask record);
}