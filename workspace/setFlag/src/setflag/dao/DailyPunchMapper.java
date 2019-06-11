package setflag.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import setflag.pojo.DailyPunch;
import setflag.pojo.DailyPunchExample;

public interface DailyPunchMapper {
    int countByExample(DailyPunchExample example);

    int deleteByExample(DailyPunchExample example);

    int deleteByPrimaryKey(String dailyPunchId);

    int insert(DailyPunch record);

    int insertSelective(DailyPunch record);

    List<DailyPunch> selectByExampleWithBLOBs(DailyPunchExample example);

    List<DailyPunch> selectByExample(DailyPunchExample example);

    DailyPunch selectByPrimaryKey(String dailyPunchId);

    int updateByExampleSelective(@Param("record") DailyPunch record, @Param("example") DailyPunchExample example);

    int updateByExampleWithBLOBs(@Param("record") DailyPunch record, @Param("example") DailyPunchExample example);

    int updateByExample(@Param("record") DailyPunch record, @Param("example") DailyPunchExample example);

    int updateByPrimaryKeySelective(DailyPunch record);

    int updateByPrimaryKeyWithBLOBs(DailyPunch record);

    int updateByPrimaryKey(DailyPunch record);
}