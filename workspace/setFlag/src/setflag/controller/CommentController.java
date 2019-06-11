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

import convert.DateToStrConverter;
import net.sf.json.JSONObject;
import setflag.constant.Constant;
import setflag.pojo.Comment;
import setflag.pojo.User;
import setflag.service.CommentService;
import setflag.service.UserService;
import setflag.utils.JwtToken;
import setflag.utils.UUIDUtils;

@Controller
public class CommentController {
	public static final Logger log = Logger.getLogger(CommentController.class);
	
	@Autowired
	private CommentService commentService;
	
	@Autowired
	private UserService UserService;
	
	/**
	 * 根据id获取评论列表
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping("/getComments")
	public void getComments(HttpServletRequest request,HttpServletResponse response) throws Exception{
		String daily_punch_id = request.getParameter("id");
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> map2 = new HashMap<String, Object>();
		List<Map<String, Object>> comments_list = new ArrayList<Map<String,Object>>();
		List<Comment> comment_list = commentService.getComments(daily_punch_id);
		
		if(comment_list.isEmpty()) {
			map.put("code", 0);
			map.put("msg", "");
			map.put("data", comment_list);
		}else {
			for (Comment comment : comment_list) {
				User user = UserService.checkPrepass(comment.getUserId());
				map2.put("comment_id", comment.getCommentId());
				map2.put("daily_punch_id", comment.getDailyPunchId());
				map2.put("parent_id", comment.getParentId());
				map2.put("user_id", comment.getUserId());
				map2.put("nickname", user.getUserNickname());
				map2.put("avatar", Constant.IMAGE_BASE_ADRESS+user.getUserAvatar());
				map2.put("comment_content", comment.getCommentContent());
				map2.put("comment_agree", comment.getCommentAgree());
				map2.put("comment_create_time", new DateToStrConverter().convertStr(comment.getCommentCreateTime()));
				comments_list.add(map2);
				map2 = new HashMap<String, Object>();
			}
			map.put("code", 0);
			map.put("msg", "根据id获取评论列表成功");
			map.put("data", comments_list );
		}
		JSONObject res = JSONObject.fromObject(map);
		response.setCharacterEncoding("utf-8");
		response.getWriter().print(res);
	}
	
	/**
	 * 添加评论
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping("/comment")
	public void comment(HttpServletRequest request,HttpServletResponse response) throws Exception{
		InputStream is= null;
		is = request.getInputStream();
		String bodyInfo = IOUtils.toString(is, "utf-8");
		log.info("入参信息："+bodyInfo);
		JSONObject json = JSONObject.fromObject(bodyInfo);
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> map2 = new HashMap<String, Object>();
		String comment_content = json.getString("comment_content");
		String daily_punch_id = json.getString("id");
		String parent_id = json.getString("parent_id");
		String user_id = JwtToken.getAppUID(json.getString("token"));
		Comment comment = new Comment(UUIDUtils.getId(), daily_punch_id, parent_id, user_id, 0, new Date(), comment_content);
		int num = commentService.comment(comment);
		if(num==0) {
			map.put("code", 1);
			map.put("msg", "添加评论失败");
			map.put("data", "");
		}else {
			User user = UserService.checkPrepass(user_id);
			map2.put("comment_id", comment.getCommentId());
			map2.put("daily_punch_id", comment.getDailyPunchId());
			map2.put("parent_id", comment.getParentId());
			map2.put("user_id", comment.getUserId());
			map2.put("comment_content", comment.getCommentContent());
			map2.put("comment_agree", comment.getCommentAgree());
			map2.put("comment_create_time",  new DateToStrConverter().convertStr(comment.getCommentCreateTime()));
			map2.put("avatar", Constant.IMAGE_BASE_ADRESS+user.getUserAvatar());
			map2.put("nickname", user.getUserNickname());
			map.put("code", 0);
			map.put("msg", "添加评论成功");
			map.put("data", map2);
		}
		JSONObject res = JSONObject.fromObject(map);
		response.setCharacterEncoding("utf-8");
		response.getWriter().print(res);
	}
	
	@RequestMapping("/commentAgree")
	public void commentAgree(HttpServletRequest request,HttpServletResponse response) throws Exception{
		InputStream is= null;
		is = request.getInputStream();
		String bodyInfo = IOUtils.toString(is, "utf-8");
		log.info("入参信息："+bodyInfo);
		JSONObject json = JSONObject.fromObject(bodyInfo);
		Map<String, Object> map = new HashMap<String, Object>();
		String comment_id = json.getString("comment_id");
		int num = commentService.commentAgree(comment_id);
		if(num==0) {
			map.put("code", 1);
			map.put("msg", "评论点赞失败");
			map.put("data", "");
		}else {
			map.put("code", 0);
			map.put("msg", "评论点赞成功");
			map.put("data", "");
		}
		JSONObject res = JSONObject.fromObject(map);
		response.setCharacterEncoding("utf-8");
		response.getWriter().print(res);
	}
	
	@RequestMapping("/dailyPunchAgree")
	public void dailyPunchAgree(HttpServletRequest request,HttpServletResponse response) throws Exception{
		InputStream is= null;
		is = request.getInputStream();
		String bodyInfo = IOUtils.toString(is, "utf-8");
		log.info("入参信息："+bodyInfo);
		JSONObject json = JSONObject.fromObject(bodyInfo);
		Map<String, Object> map = new HashMap<String, Object>();
		String dailyPunchId = json.getString("id");
		int num = commentService.dailyPunchAgree(dailyPunchId);
		if(num==0) {
			map.put("code", 1);
			map.put("msg", "评论点赞失败");
			map.put("data", "");
		}else {
			map.put("code", 0);
			map.put("msg", "评论点赞成功");
			map.put("data", "");
		}
		JSONObject res = JSONObject.fromObject(map);
		response.setCharacterEncoding("utf-8");
		response.getWriter().print(res);
		
	}
}
