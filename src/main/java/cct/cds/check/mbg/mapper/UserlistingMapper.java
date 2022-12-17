package cct.cds.check.mbg.mapper;

import cct.cds.check.mbg.model.Userlisting;
import cct.cds.check.mbg.model.UserlistingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserlistingMapper {
    int countByExample(UserlistingExample example);

    int deleteByExample(UserlistingExample example);

    int deleteByPrimaryKey(String username);

    int insert(Userlisting record);

    int insertSelective(Userlisting record);

    List<Userlisting> selectByExample(UserlistingExample example);

    Userlisting selectByPrimaryKey(String username);

    int updateByExampleSelective(@Param("record") Userlisting record, @Param("example") UserlistingExample example);

    int updateByExample(@Param("record") Userlisting record, @Param("example") UserlistingExample example);

    int updateByPrimaryKeySelective(Userlisting record);

    int updateByPrimaryKey(Userlisting record);
}