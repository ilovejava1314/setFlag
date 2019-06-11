package setflag.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import setflag.dao.UserMapper;
import setflag.pojo.User;
import setflag.pojo.UserExample;
import setflag.pojo.UserExample.Criteria;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public String getAvatar(String data) throws Exception {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo("abc");
		List<User> list = userMapper.selectByExample(example);
		if(list==null||list.isEmpty()) {
			return null;
		}else {
			User user = list.get(0);
			return user.getUserAvatar();
		}
	}

	
	@Override
	public User login(String username, String password) throws Exception {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		criteria.andPasswordEqualTo(password);
		List<User> list = userMapper.selectByExample(example);
		if(list==null||list.isEmpty()) {
			return null;
		}else {
			User user = list.get(0);
			return user;
		}
	}

	@Override
	public void regist(User user) throws Exception {
		userMapper.insert(user);
	}

	@Override
	public void addToken(String user_token, String user_id) throws Exception {
		User user = new User();
		user.setUserId(user_id);
		user.setUserToken(user_token);
		userMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public User checkUsername(String username) throws Exception {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		List<User> list = userMapper.selectByExample(example);
		if(list==null||list.isEmpty()) {
			return null;
		}else {
			User user = list.get(0);
			System.out.println(list.get(0).getUserId());
			return user;
		}
	}

	@Override
	public User checkToken(String token) throws Exception {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserTokenEqualTo(token);
		List<User> list = userMapper.selectByExample(example);
		System.out.println(list);
		if(list==null||list.isEmpty()) {
			return null;
		}else {
			User user = list.get(0);
			return user;
		}
	}

	@Override
	public int modifyNickname(String userId, String nickname) throws Exception {
		User user = new User();
		user.setUserId(userId);
		user.setUserNickname(nickname);
		int res = userMapper.updateByPrimaryKeySelective(user);
		if(res!=0) {
			return 0;
		}else {
			return 1;
		}
	}

	@Override
	public User checkPrepass(String userId) throws Exception {
		return userMapper.selectByPrimaryKey(userId);
	}

	@Override
	public int modifyPassword(String userId, String newPass) throws Exception {
		User user = new User();
		user.setUserId(userId);
		user.setPassword(newPass);
		int res = userMapper.updateByPrimaryKeySelective(user);
		if(res!=0) {
			return 0;
		}else {
			return 1;
		}
	}

	@Override
	public int uploadAvatar(String userId , String avatar) throws Exception {
		User user = new User();
		user.setUserId(userId);
		user.setUserAvatar(avatar);
		return userMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public List<User> getStanding() throws Exception {
		UserExample example = new UserExample();
		example.setOrderByClause("user_score");
		return userMapper.selectByExample(example);
	}

}
