package setflag.service;

import java.util.List;

import setflag.pojo.SysFlag;
import setflag.pojo.UserFlag;

public interface FlagService {
	public List<SysFlag> getSysFlags(int currPage,int pageSize) throws Exception;
	
	public SysFlag getSysFlagById(String id) throws Exception;
	
	public UserFlag getUserFlagById(String id) throws Exception;
	
	public void addUserFlag(UserFlag userFlag) throws Exception;

}
