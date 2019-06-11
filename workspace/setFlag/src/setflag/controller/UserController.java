package setflag.controller;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

import net.sf.json.JSONObject;
import setflag.constant.Constant;
import setflag.pojo.User;
import setflag.service.UserService;
import setflag.utils.JwtToken;
import setflag.utils.MD5Utils;
import setflag.utils.UUIDUtils;

@Controller
public class UserController {
	
	public static final Logger log = Logger.getLogger(UserController.class);
	@Autowired
	private UserService userService;
	
	/**
	 * 通过用户名获取头像
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping("/login/getAvator")
	public void getAvator(HttpServletRequest request,HttpServletResponse response) throws Exception{
			InputStream is= null;
			is = request.getInputStream();
			String bodyInfo = IOUtils.toString(is, "utf-8");
			log.info("入参信息："+bodyInfo);
			JSONObject json = JSONObject.fromObject(bodyInfo);
			String data = json.getString("username");
			String avatar = userService.getAvatar(data);
			Map<String, Object> map = new HashMap<String, Object>();
			Map<String, Object> map2 = new HashMap<String, Object>();
			if(avatar==null||avatar.length()==0) {
					map.put("code", 1);
					map.put("msg", "获取头像失败");
					map.put("data", "");
			}else {
					map2.put("avatar", Constant.IMAGE_BASE_ADRESS+avatar);
					map.put("code", 0);
					map.put("msg", "获取头像成功");
					map.put("data", map2);
			}
			JSONObject res = JSONObject.fromObject(map);
			response.setCharacterEncoding("utf-8");
			response.getWriter().print(res);
	}
	
	/**
	 * 用户登录
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping("/login")
	public void login(HttpServletRequest request,HttpServletResponse response) throws Exception{
			InputStream is= null;
			is = request.getInputStream();
			String bodyInfo = IOUtils.toString(is, "utf-8");
			log.info("入参信息："+bodyInfo);
			JSONObject json = JSONObject.fromObject(bodyInfo);
			String username = json.getString("userName");
			String password = json.getString("password");
			password = MD5Utils.md5(password);
			User u = userService.login(username,password);
			//将信息写入map data写入map2中
			Map<String, Object> map = new HashMap<String, Object>();
			Map<String, Object> map2 = new HashMap<String, Object>();
			if(u==null) {
				map.put("code", 1);
				map.put("msg", "登录失败，用户名或密码错误");
				map.put("data", "");
			}else {
				u.setUserToken(JwtToken.createToken(u.getUserId()));
				userService.addToken(u.getUserToken(),u.getUserId());
				map2.put("token", u.getUserToken());
				map2.put("username", u.getUsername());
				map2.put("sex", u.getUserSex());
				map2.put("avatar", Constant.IMAGE_BASE_ADRESS+u.getUserAvatar());
				map2.put("email", u.getUserEmail());
				map2.put("score", u.getUserScore());
				map2.put("nickname", u.getUserNickname());
				map.put("code", 0);
				map.put("msg", "登录成功");
				map.put("data", map2);
			}
			JSONObject res = JSONObject.fromObject(map);
			response.setCharacterEncoding("utf-8");
			response.getWriter().print(res);
	}
	
	
	/**
	 * 注册时判断用户名是否存在
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping("/register/validate_username")
	public void validateUsername(HttpServletRequest request,HttpServletResponse response) throws Exception{
			InputStream is= null;
			is = request.getInputStream();
			String bodyInfo = IOUtils.toString(is, "utf-8");
			log.info("入参信息："+bodyInfo);
			JSONObject json = JSONObject.fromObject(bodyInfo);
			String username = json.getString("userName");
			User u = userService.checkUsername(username);
			Map<String, Object> map = new HashMap<String, Object>();
			if(u==null) {
				map.put("code", 0);
				map.put("msg", "用户名可用");
				map.put("data", "");
			}else {
				map.put("code", 1);
				map.put("msg", "用户名已存在");
				map.put("data", "");
			}
			JSONObject res = JSONObject.fromObject(map);
			response.setCharacterEncoding("utf-8");
			response.getWriter().print(res);
	}
	
	/**
	 * 用户注册
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping("/register")
	public void register(HttpServletRequest request,HttpServletResponse response) throws Exception{
			InputStream post_is= null;
			post_is = request.getInputStream();
			String bodyInfo = IOUtils.toString(post_is, "utf-8");
			log.info("入参信息："+bodyInfo);
			JSONObject json = JSONObject.fromObject(bodyInfo);
			String username = json.getString("userName");
			String password = json.getString("password");
			password = MD5Utils.md5(password);
			String user_sex = json.getString("sex");
			String user_email = json.getString("email");
			String user_nickname = json.getString("nickname");
			String user_id =UUIDUtils.getId();
			User u = null;
			
			if(user_sex=="1"||user_sex.equals("1")) {
				u = new User(user_id, username, password, user_sex, Constant.USER_BOY_AVATAR, user_email, 0, user_nickname);
			}else {
				u = new User(user_id, username, password, user_sex, Constant.USER_GILR_AVATAR, user_email, 0, user_nickname);
			}
			u.setUserToken(JwtToken.createToken(user_id));
			userService.regist(u);
			//将信息写入map data写入map2中
			Map<String, Object> map = new HashMap<String, Object>();
			Map<String, Object> map2 = new HashMap<String, Object>();
			u.setUserToken(JwtToken.createToken(u.getUserId()));
			map2.put("token", u.getUserToken());
			map2.put("username", u.getUsername());
			map2.put("sex", u.getUserSex());
			map2.put("avatar", Constant.IMAGE_BASE_ADRESS+u.getUserAvatar());
			map2.put("email", u.getUserEmail());
			map2.put("score", u.getUserScore());
			map2.put("nickname", u.getUserNickname());
			map.put("code", 0);
			map.put("isShow", true);
			map.put("msg", "注册成功");
			map.put("data", map2);
			JSONObject res = JSONObject.fromObject(map);
			response.setCharacterEncoding("utf-8");
			response.getWriter().print(res);
	}
	
	/**
	 * 检验token
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping("/check_token")
	public void checkToken(HttpServletRequest request,HttpServletResponse response) throws Exception{
			InputStream is= null;
			is = request.getInputStream();
			String bodyInfo = IOUtils.toString(is, "utf-8");
			log.info("入参信息："+bodyInfo);
			JSONObject json = JSONObject.fromObject(bodyInfo);
			String token = json.getString("token");
			User u = userService.checkToken(token);
			//将信息写入map data写入map2中
			Map<String, Object> map = new HashMap<String, Object>();
			Map<String, Object> map2 = new HashMap<String, Object>();
			if(u==null) {
				map.put("code", 1);
				map.put("msg", "token无效");
				map.put("data", "");
			}else {
				map2.put("token", u.getUserToken());
				map2.put("username", u.getUsername());
				map2.put("sex", u.getUserSex());
				map2.put("avatar", Constant.IMAGE_BASE_ADRESS+u.getUserAvatar());
				map2.put("email", u.getUserEmail());
				map2.put("score", u.getUserScore());
				map2.put("nickname", u.getUserNickname());
				map.put("code", 0);
				map.put("msg", "token有效");
				map.put("data", map2);
			}
			JSONObject res = JSONObject.fromObject(map);
			response.setCharacterEncoding("utf-8");
			response.getWriter().print(res);
	}
	
	@RequestMapping("/profile/modifyNickname")
	public void modifyNickname(HttpServletRequest request,HttpServletResponse response) throws Exception{
		InputStream is= null;
		is = request.getInputStream();
		String bodyInfo = IOUtils.toString(is, "utf-8");
		log.info("入参信息："+bodyInfo);
		JSONObject json = JSONObject.fromObject(bodyInfo);
		String token = json.getString("token");
		String nickname = json.getString("nickname");
		Map<String, Object> map = new HashMap<String, Object>();
		int res1 = userService.modifyNickname(JwtToken.getAppUID(token), nickname);
		if(res1==0) {
			map.put("code", 0);
			map.put("msg", "修改昵称成功");
			map.put("data", "");
		}else {
			map.put("code", 1);
			map.put("msg", "修改昵称失败");
			map.put("data", "");
		}
		JSONObject res = JSONObject.fromObject(map);
		response.setCharacterEncoding("utf-8");
		response.getWriter().print(res);
	}
	
	/**
	 * 检查原密码是否正确
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping("/profile/checkPrepass")
	public void checkPrepass(HttpServletRequest request,HttpServletResponse response) throws Exception{
		InputStream is= null;
		is = request.getInputStream();
		String bodyInfo = IOUtils.toString(is, "utf-8");
		log.info("入参信息："+bodyInfo);
		JSONObject json = JSONObject.fromObject(bodyInfo);
		Map<String, Object> map = new HashMap<String, Object>();
		String token = json.getString("token");
		String prePass = json.getString("prePass");
		User user = userService.checkPrepass(JwtToken.getAppUID(token));
		if(MD5Utils.md5(prePass).equals(user.getPassword())) {
			map.put("code", 0);
			map.put("msg", "原密码正确");
			map.put("data", "");
		}else {
			map.put("code", 1);
			map.put("msg", "原密码错误");
			map.put("data", "");
		}
		JSONObject res = JSONObject.fromObject(map);
		response.setCharacterEncoding("utf-8");
		response.getWriter().print(res);
	}
	
	
	@RequestMapping("/profile/modifyPassword")
	public void modifyPassword(HttpServletRequest request,HttpServletResponse response) throws Exception{
		InputStream is= null;
		is = request.getInputStream();
		String bodyInfo = IOUtils.toString(is, "utf-8");
		log.info("入参信息："+bodyInfo);
		JSONObject json = JSONObject.fromObject(bodyInfo);
		Map<String, Object> map = new HashMap<String, Object>();
		String token = json.getString("token");
		String newPass = json.getString("newPass");
		String pwd = MD5Utils.md5(newPass);
		int res1 = userService.modifyPassword(JwtToken.getAppUID(token), pwd);
		if(res1==0) {
			map.put("code", 0);
			map.put("msg", "修改密码成功");
			map.put("data", "");
		}else {
			map.put("code", 1);
			map.put("msg", "修改密码失败,token失效,需要重新登录");
			map.put("data", "");
		}
		JSONObject res = JSONObject.fromObject(map);
		response.setCharacterEncoding("utf-8");
		response.getWriter().print(res);
	}
	
	
	@RequestMapping("/uploadAvatar")
	public void uploadAvatar(HttpServletRequest request,HttpServletResponse response , MultipartFile pictureFile) throws Exception{
		String token = request.getParameter("token");
		MultipartRequest multipartRequest = (MultipartRequest) request;
		pictureFile = multipartRequest.getFile("image");
		
		//原始文件名称
		String pictureFile_name =  pictureFile.getOriginalFilename();
		//新文件名称
		String newFileName = UUID.randomUUID().toString()+pictureFile_name.substring(pictureFile_name.lastIndexOf("."));
			
		//上传图片
		File uploadPic = new java.io.File("/root/tomcat/webapps/setFlag/user_avatar/uploadAvatar/"+newFileName);
				
		if(!uploadPic.exists()){
			uploadPic.mkdirs();
		}
		//向磁盘写文件
		pictureFile.transferTo(uploadPic);
		
		Map<String, Object> map = new HashMap<String, Object>();
		String avatar_address = "user_avatar/uploadAvatar/"+newFileName;
		int num = userService.uploadAvatar(JwtToken.getAppUID(token),avatar_address);
		if(num==0) {
			map.put("code", 1);
			map.put("msg", "头像上传失败");
			map.put("data", "");
		}else {
			map.put("code", 0);
			map.put("msg", "头像上传成功");
			map.put("data", "");
		}
		JSONObject res = JSONObject.fromObject(map);
		response.setCharacterEncoding("utf-8");
		response.getWriter().print(res); 
	}
	
	
	@RequestMapping("/getRank")
	public void getRank(HttpServletRequest request,HttpServletResponse response) throws Exception{
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> map2 = new HashMap<String, Object>();
		List<Map<String, Object>> user_list = new ArrayList<Map<String,Object>>();
		List<User> list = userService.getStanding();
		if(list.isEmpty()) {
			map.put("code", 0);
			map.put("msg", "榜单为空");
			map.put("data", list);
		}else {
			for (User user : list) {
				map2.put("nickname", Constant.IMAGE_BASE_ADRESS+user.getUserAvatar()+"||"+user.getUserNickname());
				map2.put("score", user.getUserScore());
				user_list.add(map2);
				map2 = new HashMap<String, Object>();
			}
			map.put("code", 0);
			map.put("msg", "获取榜单");
			map.put("data", user_list);
		}
		JSONObject res = JSONObject.fromObject(map);
		response.setCharacterEncoding("utf-8");
		response.getWriter().print(res); 
	}

}
