package setflag.controller;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import net.sf.json.JSONObject;
import setflag.pojo.FrequencyPunch;
import setflag.pojo.SysFlag;
import setflag.pojo.UserFlag;
import setflag.service.FlagService;
import setflag.service.PunchService;
import setflag.utils.JwtToken;
import setflag.utils.UUIDUtils;

@Controller
public class FlagController {
	public static final Logger log = Logger.getLogger(FlagController.class);
	
	@Autowired
	private FlagService flagService;
	
	@Autowired
	private PunchService punchService;
	
	@RequestMapping("/getFlags")
	public void getFlags(HttpServletRequest request,HttpServletResponse response) throws Exception{
		String page = request.getParameter("page");
		int currPage = Integer.parseInt(page)%2==0?2:1;
		int pageSize = 6;
		List<SysFlag> list = flagService.getSysFlags(currPage,pageSize);
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> map2 = new HashMap<String, Object>();
		List<Map<String, Object>> flags_list = new ArrayList<Map<String,Object>>();
		if(list.isEmpty()) {
			map.put("code", 1);
			map.put("msg", "获取系统flag失败");
			map.put("data", "");
		}else {
			for (SysFlag sysFlag : list) {
				map2.put("flag_id", sysFlag.getSysFlagId());
				map2.put("flag_title", sysFlag.getSysFlagTitle());
				map2.put("flag_content", sysFlag.getSysFlagContent());
				map2.put("flag_image", sysFlag.getSysFlagImage());
				flags_list.add(map2);
				map2 = new HashMap<String, Object>();
			}
			map.put("code", 0);
			map.put("msg", "获取系统flag成功");
			map.put("data", flags_list);
		}
		JSONObject res = JSONObject.fromObject(map);
		response.setCharacterEncoding("utf-8");
		response.getWriter().print(res);
	}
	
	@RequestMapping("/addFlag")
	public void addFlag(HttpServletRequest request,HttpServletResponse response) throws Exception{
		InputStream is= null;
		is = request.getInputStream();
		String bodyInfo = IOUtils.toString(is, "utf-8");
		log.info("入参信息："+bodyInfo);
		JSONObject json = JSONObject.fromObject(bodyInfo);
		String token = json.getString("token");
		//将信息写入map data写入map2中
		Map<String, Object> map = new HashMap<String, Object>();
		if(json.toString().contains("sys_flag")) {
			String flag_id = json.getString("id");
			SysFlag sysFlag = flagService.getSysFlagById(flag_id);
			if(sysFlag!=null) {
				FrequencyPunch f_punch = new FrequencyPunch();
				f_punch.setFrequencyPunchId(UUIDUtils.getId());
				f_punch.setFlagId(flag_id);
				f_punch.setUserId(JwtToken.getAppUID(token));
				f_punch.setIsTure("flase");
				f_punch.setFrequencyPunchDate(new Date());
				punchService.addFrequencyPunch(f_punch);
			}else {
				map.put("code", 1);
				map.put("msg", "添加失败");
				map.put("data", "");
			}
		}else {
			String flag_title = json.getString("title");
			String flag_content = json.getString("content");
			UserFlag user_flag = new UserFlag();
			user_flag.setUserFlagId(UUIDUtils.getId());
			user_flag.setUserFlagTitle(flag_title);
			user_flag.setUserFlagContent(flag_content);
			user_flag.setUserFlagDate(new Date());
			user_flag.setUserFlagImage("flag_images/flag_image.jpg");
			flagService.addUserFlag(user_flag);
			FrequencyPunch f_punch = new FrequencyPunch();
			f_punch.setFrequencyPunchId(UUIDUtils.getId());
			f_punch.setFlagId(user_flag.getUserFlagId());
			f_punch.setUserId(JwtToken.getAppUID(token));
			f_punch.setIsTure("false");
			f_punch.setFrequencyPunchDate(new Date());
			punchService.addFrequencyPunch(f_punch);
		}
		map.put("code", 0);
		map.put("msg", "添加成功");
		map.put("data", "");
		JSONObject res = JSONObject.fromObject(map);
		response.setCharacterEncoding("utf-8");
		response.getWriter().print(res);
	}
}
