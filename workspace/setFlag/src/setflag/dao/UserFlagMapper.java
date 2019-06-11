package setflag.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import setflag.pojo.UserFlag;
import setflag.pojo.UserFlagExample;

public interface UserFlagMapper {
    int countByExample(UserFlagExample example);

    int deleteByExample(UserFlagExample example);

    int deleteByPrimaryKey(String userFlagId);

    int insert(UserFlag record);

    int insertSelective(UserFlag record);

    List<UserFlag> selectByExample(UserFlagExample example);

    UserFlag selectByPrimaryKey(String userFlagId);

    int updateByExampleSelective(@Param("record") UserFlag record, @Param("example") UserFlagExample example);

    int updateByExample(@Param("record") UserFlag record, @Param("example") UserFlagExample example);

    int updateByPrimaryKeySelective(UserFlag record);

    int updateByPrimaryKey(UserFlag record);
}