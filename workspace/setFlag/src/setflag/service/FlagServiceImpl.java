package setflag.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import setflag.dao.SysFlagMapper;
import setflag.dao.UserFlagMapper;
import setflag.pojo.SysFlag;
import setflag.pojo.SysFlagExample;
import setflag.pojo.UserFlag;

@Service
public class FlagServiceImpl implements FlagService {
	
	@Autowired
	private SysFlagMapper sysFlagMapper;
	
	@Autowired
	private UserFlagMapper userFlagMapper;
	

	@Override
	public List<SysFlag> getSysFlags(int currPage, int pageSize) throws Exception {
		SysFlagExample example = new SysFlagExample();
		example.setOffset((currPage-1)*pageSize);
		example.setLimit(pageSize);
		List<SysFlag> list = sysFlagMapper.selectByExample(example);
		return list;
	}


	@Override
	public SysFlag getSysFlagById(String id) throws Exception {
		return sysFlagMapper.selectByPrimaryKey(id);
	}


	@Override
	public void addUserFlag(UserFlag userFlag) throws Exception {
		userFlagMapper.insert(userFlag);
		
	}


	@Override
	public UserFlag getUserFlagById(String id) throws Exception {
		return userFlagMapper.selectByPrimaryKey(id);
	}

}
