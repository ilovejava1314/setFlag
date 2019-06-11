package setflag.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import setflag.pojo.SysFlag;
import setflag.pojo.SysFlagExample;

public interface SysFlagMapper {
    int countByExample(SysFlagExample example);

    int deleteByExample(SysFlagExample example);

    int deleteByPrimaryKey(String sysFlagId);

    int insert(SysFlag record);

    int insertSelective(SysFlag record);

    List<SysFlag> selectByExample(SysFlagExample example);

    SysFlag selectByPrimaryKey(String sysFlagId);

    int updateByExampleSelective(@Param("record") SysFlag record, @Param("example") SysFlagExample example);

    int updateByExample(@Param("record") SysFlag record, @Param("example") SysFlagExample example);

    int updateByPrimaryKeySelective(SysFlag record);

    int updateByPrimaryKey(SysFlag record);
}