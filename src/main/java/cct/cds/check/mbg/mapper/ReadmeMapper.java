package cct.cds.check.mbg.mapper;

import cct.cds.check.mbg.model.Readme;
import cct.cds.check.mbg.model.ReadmeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReadmeMapper {
    int countByExample(ReadmeExample example);

    int deleteByExample(ReadmeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Readme record);

    int insertSelective(Readme record);

    List<Readme> selectByExampleWithBLOBs(ReadmeExample example);

    List<Readme> selectByExample(ReadmeExample example);

    Readme selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Readme record, @Param("example") ReadmeExample example);

    int updateByExampleWithBLOBs(@Param("record") Readme record, @Param("example") ReadmeExample example);

    int updateByExample(@Param("record") Readme record, @Param("example") ReadmeExample example);

    int updateByPrimaryKeySelective(Readme record);

    int updateByPrimaryKeyWithBLOBs(Readme record);
}