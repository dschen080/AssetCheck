package cct.cds.check.mbg.mapper;

import cct.cds.check.mbg.model.Assetcheckhis;
import cct.cds.check.mbg.model.AssetcheckhisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssetcheckhisMapper {
    int countByExample(AssetcheckhisExample example);

    int deleteByExample(AssetcheckhisExample example);

    int deleteByPrimaryKey(Integer assetchkid);

    int insert(Assetcheckhis record);

    int insertSelective(Assetcheckhis record);

    List<Assetcheckhis> selectByExample(AssetcheckhisExample example);

    Assetcheckhis selectByPrimaryKey(Integer assetchkid);

    int updateByExampleSelective(@Param("record") Assetcheckhis record, @Param("example") AssetcheckhisExample example);

    int updateByExample(@Param("record") Assetcheckhis record, @Param("example") AssetcheckhisExample example);

    int updateByPrimaryKeySelective(Assetcheckhis record);

    int updateByPrimaryKey(Assetcheckhis record);
}