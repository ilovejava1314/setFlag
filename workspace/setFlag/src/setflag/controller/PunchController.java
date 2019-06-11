package setflag.controller;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
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

import convert.DateToStrConverter;
import net.sf.json.JSONObject;
import setflag.constant.Constant;
import setflag.pojo.DailyPunch;
import setflag.pojo.FrequencyPunch;
import setflag.pojo.SysFlag;
import setflag.pojo.User;
import setflag.pojo.UserFlag;
import setflag.service.FlagService;
import setflag.service.PunchService;
import setflag.service.UserService;
import setflag.utils.JwtToken;
import setflag.utils.UUIDUtils;

@Controller
public class PunchController {
	public static final Logger log = Logger.getLogger(PunchController.class);
	@Autowired
	private FlagService flagService;
	
	@Autowired
	private PunchService punchService;
	
	@Autowired
	private UserService UserService;
	
	/**
	 * 获取当日所有打卡项
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping("/getTasks")
	public void getTasks(HttpServletRequest request,HttpServletResponse response) throws Exception{
		String token = request.getParameter("token");
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> map2 = new HashMap<String, Object>();
		List<Map<String, Object>> flags_list = new ArrayList<Map<String,Object>>();
		String user_id = JwtToken.getAppUID(token);
		List<FrequencyPunch> frequency_punch_list = punchService.findTodayPunchsbyUserId(user_id);
		if(frequency_punch_list.isEmpty()) {
			map.put("code", 1);
			map.put("msg", "获取失败");
			map.put("data", "");
		}else {
			for (FrequencyPunch frequency_punch : frequency_punch_list) {
				if(frequency_punch.getFlagId().contains("sys_flag")) {
					SysFlag sysFlag = flagService.getSysFlagById(frequency_punch.getFlagId());
					map2.put("punch_id", frequency_punch.getFrequencyPunchId());
					map2.put("punch_title", sysFlag.getSysFlagTitle());
					map2.put("punch_content", sysFlag.getSysFlagContent());
					map2.put("is_true", frequency_punch.getIsTure());
					flags_list.add(map2);
					map2=new HashMap<String, Object>();
				}else {
					UserFlag userFlag = flagService.getUserFlagById(frequency_punch.getFlagId());
					map2.put("punch_id", frequency_punch.getFrequencyPunchId());
					map2.put("punch_title", userFlag.getUserFlagTitle());
					map2.put("punch_content", userFlag.getUserFlagContent());
					map2.put("is_true", frequency_punch.getIsTure());
					flags_list.add(map2);
					map2=new HashMap<String, Object>();
				}
			}
			map.put("code", 0);
			map.put("msg", "获取成功");
			map.put("data", flags_list);
		}
		JSONObject res = JSONObject.fromObject(map);
		response.setCharacterEncoding("utf-8");
		response.getWriter().print(res);
		
	}
	
	/**
	 * 获取当前用户所有的打卡记录
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping("/getAllTasks")
	public void getAllTasks(HttpServletRequest request,HttpServletResponse response) throws Exception{
		String token = request.getParameter("token");
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> map2 = new HashMap<String, Object>();
		List<Map<String, Object>> flags_list = new ArrayList<Map<String,Object>>();
		List<FrequencyPunch> frequency_punch_list = punchService.getUserFlag(JwtToken.getAppUID(token));
		if(frequency_punch_list.isEmpty()) {
			map.put("code", 1);
			map.put("msg", "获取失败");
			map.put("data", "");
		}else {
			for (FrequencyPunch frequency_punch : frequency_punch_list) {
				if(frequency_punch.getFlagId().contains("sys_flag")) {
					SysFlag sysFlag = flagService.getSysFlagById(frequency_punch.getFlagId());
					map2.put("punch_id", frequency_punch.getFrequencyPunchId());
					map2.put("punch_title", sysFlag.getSysFlagTitle());
					map2.put("punch_content", sysFlag.getSysFlagContent());
					map2.put("is_true", frequency_punch.getIsTure());
					map2.put("date", new DateToStrConverter().convertStr(frequency_punch.getFrequencyPunchDate()));
					flags_list.add(map2);
					map2=new HashMap<String, Object>();
				}else {
					UserFlag userFlag = flagService.getUserFlagById(frequency_punch.getFlagId());
					map2.put("punch_id", frequency_punch.getFrequencyPunchId());
					map2.put("punch_title", userFlag.getUserFlagTitle());
					map2.put("punch_content", userFlag.getUserFlagContent());
					map2.put("is_true", frequency_punch.getIsTure());
					map2.put("date", new DateToStrConverter().convertStr(frequency_punch.getFrequencyPunchDate()));
					flags_list.add(map2);
					map2=new HashMap<String, Object>();
				}
			}
			map.put("code", 0);
			map.put("msg", "获取成功");
			map.put("data", flags_list);
		}
		JSONObject res = JSONObject.fromObject(map);
		response.setCharacterEncoding("utf-8");
		response.getWriter().print(res);
	}
	
	/**
	 * 单次打卡
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping("/punchFlag")
	public void punchFlag(HttpServletRequest request,HttpServletResponse response) throws Exception{
		InputStream is= null;
		is = request.getInputStream();
		String bodyInfo = IOUtils.toString(is, "utf-8");
		log.info("入参信息："+bodyInfo);
		JSONObject json = JSONObject.fromObject(bodyInfo);
		Map<String, Object> map = new HashMap<String, Object>();
		String punch_id = json.getString("punch_id");
		String token = json.getString("token");
		int res = punchService.punchFlag(punch_id,JwtToken.getAppUID(token));
		if(res==2) {
			map.put("code", 0);
			map.put("msg", "恭喜你打卡成功,并获得10点积分");
			map.put("data", "");
		}else {
			map.put("code", 1);
			map.put("msg", "打卡失败");
			map.put("data", "");
		}
		JSONObject res1 = JSONObject.fromObject(map);
		response.setCharacterEncoding("utf-8");
		response.getWriter().print(res1);
	}
	
	
	/**
	 * 获取所有用户的打卡总结
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping("/getDailyPunch")
	public void getDailyPunch(HttpServletRequest request,HttpServletResponse response) throws Exception{
		String currPage = request.getParameter("page");
		int pageSize = 4;
		List<DailyPunch> list = punchService.getDailyPunch(Integer.parseInt(currPage), pageSize);
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> map2 = new HashMap<String, Object>();
		Map<String, Object> map3 = new HashMap<String, Object>();
		List<Map<String, Object>> punch_list = new ArrayList<Map<String,Object>>();
		if(list.isEmpty()) {
			map.put("code", 0);
			map.put("msg", "");
			map3.put("items", list);
			map.put("data", map3);
		}else {
			for (DailyPunch dailyPunch : list) {
				User user = UserService.checkPrepass(dailyPunch.getUserId());
				map2.put("id", dailyPunch.getDailyPunchId());
				map2.put("nickname", user.getUserNickname());
				map2.put("avatar", Constant.IMAGE_BASE_ADRESS+user.getUserAvatar());
				map2.put("title", dailyPunch.getDailyPunchTitle());
				map2.put("content", dailyPunch.getDailyPunchContent());
				map2.put("image", dailyPunch.getDailyPunchImage());
				map2.put("agree", dailyPunch.getDailyPunchAgree());
				map2.put("comment_num", dailyPunch.getDailyPunchCommentNum());
				map2.put("date", new DateToStrConverter().convertStr(dailyPunch.getDailyPunchDate()));
				map2.put("image",Constant.IMAGE_BASE_ADRESS+"daily_punch_image/sys_article_image/sys_article_00"+(int)(1+Math.random()*(9-1+1))+".jpg");
				punch_list.add(map2);
				map2 = new HashMap<String, Object>();
			}
			map3.put("items", punch_list);
			map3.put("page", currPage);
			map.put("code", 0);
			map.put("msg", "获取打卡总结列表成功");
			map.put("data", map3);
		}
		JSONObject res = JSONObject.fromObject(map);
		response.setCharacterEncoding("utf-8");
		response.getWriter().print(res);
	}
	
	/**
	 * 总结打卡
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping("/dailyPunch")
	public void dailyPunch(HttpServletRequest request,HttpServletResponse response) throws Exception{
		
		InputStream is= null;
		is = request.getInputStream();
		String bodyInfo = IOUtils.toString(is, "utf-8");
		log.info("入参信息："+bodyInfo);
		JSONObject json = JSONObject.fromObject(bodyInfo);
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> map2 = new HashMap<String, Object>();
		String dailyPunchTitle = json.getString("title");
		String dailyPunchContent = json.getString("content");
		String token = json.getString("token");
		DailyPunch dailyPunch = new DailyPunch(UUIDUtils.getId(), dailyPunchTitle, Constant.SYS_ARTICLE_IMAGE, new Date(), 0, 0, JwtToken.getAppUID(token), dailyPunchContent);
		User user = UserService.checkPrepass(JwtToken.getAppUID(token));
		int res1 = punchService.dailyPunch(dailyPunch);
		if(res1==0||res1==1) {
			map.put("code", 1);
			map.put("msg", "发表总结打卡失败");
			map.put("data", "");
		}else {
			map2.put("id",dailyPunch.getDailyPunchId());
			map2.put("userName",user.getUsername());
			map2.put("nickname",user.getUserNickname());
			map2.put("avatar", Constant.IMAGE_BASE_ADRESS+user.getUserAvatar());
			map2.put("title",dailyPunch.getDailyPunchTitle());
			map2.put("content", dailyPunch.getDailyPunchContent());
			map2.put("agree", dailyPunch.getDailyPunchAgree());
			map2.put("comment_num",dailyPunch.getDailyPunchCommentNum());
			map2.put("date", dailyPunch.getDailyPunchDate());
			map2.put("image",Constant.IMAGE_BASE_ADRESS+dailyPunch.getDailyPunchImage());
			map.put("code", 0);
			map.put("msg", "发表总结打卡成功,并获得15点积分");
			map.put("data", map2);
		}
		JSONObject res = JSONObject.fromObject(map);
		response.setCharacterEncoding("utf-8");
		response.getWriter().print(res);
	}
	
	
	@RequestMapping("/getDetailById")
	public void getDetailById(HttpServletRequest request,HttpServletResponse response) throws Exception{
		String dailyPunchId = request.getParameter("id");
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> map2 = new HashMap<String, Object>();
		DailyPunch dailyPunch = punchService.getDetailById(dailyPunchId);
		if(dailyPunch==null) {
			map.put("code", 1);
			map.put("msg", "根据id获取总结打卡内容失败");
			map.put("data", "");
		}else {
			User user = UserService.checkPrepass(dailyPunch.getUserId());
			map2.put("id",dailyPunch.getDailyPunchId());
			map2.put("userName",user.getUsername());
			map2.put("nickname",user.getUserNickname());
			map2.put("avatar", Constant.IMAGE_BASE_ADRESS+user.getUserAvatar());
			map2.put("title",dailyPunch.getDailyPunchTitle());
			map2.put("content", dailyPunch.getDailyPunchContent());
			map2.put("agree", dailyPunch.getDailyPunchAgree());
			map2.put("comment_num",dailyPunch.getDailyPunchCommentNum());
			map2.put("date", new DateToStrConverter().convertStr(dailyPunch.getDailyPunchDate()));
			map2.put("image","");
			map.put("code", 0);
			map.put("msg", "根据id获取总结打卡内容成功");
			map.put("data", map2);
		}
		JSONObject res = JSONObject.fromObject(map);
		response.setCharacterEncoding("utf-8");
		response.getWriter().print(res);
	}
	
	@RequestMapping("/getArticles")
	public void getArticles(HttpServletRequest request,HttpServletResponse response) throws Exception{
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> map2 = new HashMap<String, Object>();
		List<Map<String, Object>> Article_list = new ArrayList<Map<String,Object>>();
		List<DailyPunch> list = punchService.getSysArticle();
		if(list.isEmpty()) {
			map.put("code", 1);
			map.put("msg", "获取文章列表失败");
			map.put("data", "");
		}else {
			for (DailyPunch dailyPunch : list) {
				map2.put("id", dailyPunch.getDailyPunchId());
				map2.put("nickname", "立个Flag");
				map2.put("avatar", Constant.IMAGE_BASE_ADRESS+"user_avatar/uploadAvatar/himg.jpg");
				map2.put("title", dailyPunch.getDailyPunchTitle());
				map2.put("content", dailyPunch.getDailyPunchContent());
				map2.put("agree", dailyPunch.getDailyPunchAgree());
				map2.put("comment_num", dailyPunch.getDailyPunchCommentNum());
				map2.put("date", new DateToStrConverter().convertStr(dailyPunch.getDailyPunchDate()));
				map2.put("image", Constant.IMAGE_BASE_ADRESS+dailyPunch.getDailyPunchImage());
				Article_list.add(map2);
				map2 = new HashMap<String, Object>();
			}
			map.put("code", 0);
			map.put("msg", "获取文章列表成功");
			map.put("data", Article_list);
		}
		JSONObject res = JSONObject.fromObject(map);
		response.setCharacterEncoding("utf-8");
		response.getWriter().print(res);
	}
	
	@RequestMapping("/uploadImg")
	public void uploadImg(HttpServletRequest request,HttpServletResponse response , MultipartFile pictureFile) throws Exception{
		MultipartRequest multipartRequest = (MultipartRequest) request;
		pictureFile = multipartRequest.getFile("file");
		//原始文件名称
		String pictureFile_name =  pictureFile.getOriginalFilename();
		//新文件名称
		String newFileName = UUID.randomUUID().toString()+pictureFile_name.substring(pictureFile_name.lastIndexOf("."));
			
		//上传图片
		File uploadPic = new java.io.File("/root/tomcat/webapps/setFlag/daily_punch_image/user_article_image/"+newFileName);
				
		if(!uploadPic.exists()){
			uploadPic.mkdirs();
		}
		//向磁盘写文件
		pictureFile.transferTo(uploadPic);
		
		String image_adress = "daily_punch_image/user_article_image/"+newFileName;
		
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("image", Constant.IMAGE_BASE_ADRESS+image_adress);
		map.put("code", 0);
		map.put("msg", "图片上传成功");
		map.put("data", map2);
		JSONObject res = JSONObject.fromObject(map);
		response.setCharacterEncoding("utf-8");
		response.getWriter().print(res); 
	}
}
