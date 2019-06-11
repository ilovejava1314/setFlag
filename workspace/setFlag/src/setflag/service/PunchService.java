package setflag.service;

import java.util.List;

import setflag.pojo.DailyPunch;
import setflag.pojo.FrequencyPunch;


public interface PunchService {
	public void addFrequencyPunch(FrequencyPunch f_punch) throws Exception;
	
	public List<FrequencyPunch> findTodayPunchsbyUserId(String userId) throws Exception;
	
	public int punchFlag(String punch_id, String userId) throws Exception;
	
	public List<DailyPunch> getDailyPunch(int currPage,int pageSize) throws Exception;
	
	public int dailyPunch(DailyPunch dailyPunch) throws Exception;

	public DailyPunch getDetailById(String dailyPunchId) throws Exception;

	public List<DailyPunch> getSysArticle() throws Exception;

	public List<FrequencyPunch> getUserFlag(String appUID) throws Exception;

}
