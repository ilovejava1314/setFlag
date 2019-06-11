package setflag.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import setflag.pojo.FrequencyPunch;
import setflag.pojo.FrequencyPunchExample;

public interface FrequencyPunchMapper {
    int countByExample(FrequencyPunchExample example);

    int deleteByExample(FrequencyPunchExample example);

    int deleteByPrimaryKey(String frequencyPunchId);

    int insert(FrequencyPunch record);

    int insertSelective(FrequencyPunch record);

    List<FrequencyPunch> selectByExample(FrequencyPunchExample example);

    FrequencyPunch selectByPrimaryKey(String frequencyPunchId);

    int updateByExampleSelective(@Param("record") FrequencyPunch record, @Param("example") FrequencyPunchExample example);

    int updateByExample(@Param("record") FrequencyPunch record, @Param("example") FrequencyPunchExample example);

    int updateByPrimaryKeySelective(FrequencyPunch record);

    int updateByPrimaryKey(FrequencyPunch record);
}