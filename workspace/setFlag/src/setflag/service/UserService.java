package setflag.service;

import java.util.List;

import setflag.pojo.User;

public interface UserService {
	public String getAvatar(String data) throws Exception;

	public User login(String username, String password) throws Exception;

	public void regist(User user) throws Exception;

	public void addToken(String user_token, String user_id) throws Exception;

	public User checkUsername(String username) throws Exception;

	public User checkToken(String token) throws Exception;
	
	public int modifyNickname(String userId,String nickname) throws Exception;
	
	public User checkPrepass(String userId) throws Exception;
	
	public int modifyPassword(String userId,String newPass) throws Exception;

	public int uploadAvatar(String userId,String avatar) throws Exception;

	public List<User> getStanding() throws Exception;
}
