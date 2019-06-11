package setflag.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import setflag.dao.DailyPunchMapper;
import setflag.dao.FrequencyPunchMapper;
import setflag.dao.UserMapper;
import setflag.pojo.DailyPunch;
import setflag.pojo.DailyPunchExample;
import setflag.pojo.FrequencyPunch;
import setflag.pojo.FrequencyPunchExample;
import setflag.pojo.FrequencyPunchExample.Criteria;
import setflag.pojo.User;

@Service
public class PunchServiceImpl implements PunchService {
	
	@Autowired
	private FrequencyPunchMapper frequencyPunchMapper;
	
	@Autowired
	private DailyPunchMapper dailyPunchMapper;

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public void addFrequencyPunch(FrequencyPunch f_punch) throws Exception {
		frequencyPunchMapper.insert(f_punch);
	}

	@Override
	public List<FrequencyPunch> findTodayPunchsbyUserId(String userId) {
		FrequencyPunchExample example = new FrequencyPunchExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		criteria.andFrequencyPunchDateEqualTo(new Date());
		List<FrequencyPunch> list = frequencyPunchMapper.selectByExample(example);
		return list;
	}

	@Override
	public int punchFlag(String punch_id , String userId) throws Exception {
		FrequencyPunch frequencyPunch = new FrequencyPunch();
		frequencyPunch.setFrequencyPunchId(punch_id);
		frequencyPunch.setIsTure("true");
		User user = userMapper.selectByPrimaryKey(userId);
		user.setUserScore(user.getUserScore()+10);
		int res1 = userMapper.updateByPrimaryKeySelective(user);
		int res2 = frequencyPunchMapper.updateByPrimaryKeySelective(frequencyPunch);
		return res1+res2;
	}

	@Override
	public List<DailyPunch> getDailyPunch(int currPage, int pageSize) throws Exception {
		DailyPunchExample example = new DailyPunchExample();
		example.setOffset((currPage-1)*pageSize);
		example.setLimit(pageSize);
		setflag.pojo.DailyPunchExample.Criteria criteria = example.createCriteria();
		criteria.andDailyPunchIdNotLike("%sys_article%");
		List<DailyPunch> list = dailyPunchMapper.selectByExampleWithBLOBs(example);
		return list;
	}

	@Override
	public int dailyPunch(DailyPunch dailyPunch) throws Exception {
		User user = userMapper.selectByPrimaryKey(dailyPunch.getUserId());
		user.setUserScore(user.getUserScore()+15);
		int res1 = userMapper.updateByPrimaryKeySelective(user);
		int res2 = dailyPunchMapper.insertSelective(dailyPunch);
		return res1+res2;
	}

	@Override
	public DailyPunch getDetailById(String dailyPunchId) throws Exception {
		return dailyPunchMapper.selectByPrimaryKey(dailyPunchId);
	}

	@Override
	public List<DailyPunch> getSysArticle() throws Exception {
		DailyPunchExample example = new DailyPunchExample();
		setflag.pojo.DailyPunchExample.Criteria criteria = example.createCriteria();
		criteria.andDailyPunchIdLike("%sys_article%");
		List<DailyPunch> list = dailyPunchMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<FrequencyPunch> getUserFlag(String userId) throws Exception {
		FrequencyPunchExample example = new FrequencyPunchExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		List<FrequencyPunch> list = frequencyPunchMapper.selectByExample(example);
		return list;
	}


}
