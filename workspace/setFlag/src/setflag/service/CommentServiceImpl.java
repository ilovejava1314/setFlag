package setflag.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import setflag.dao.CommentMapper;
import setflag.dao.DailyPunchMapper;
import setflag.pojo.Comment;
import setflag.pojo.CommentExample;
import setflag.pojo.CommentExample.Criteria;
import setflag.pojo.DailyPunch;

@Service
public class CommentServiceImpl implements CommentService {
	@Autowired
	private CommentMapper commentMapper;
	
	@Autowired
	private DailyPunchMapper dailyPunchMapper;

	@Override
	public List<Comment> getComments(String daily_punch_id) throws Exception{
		CommentExample example = new CommentExample();
		Criteria criteria = example.createCriteria();
		criteria.andDailyPunchIdEqualTo(daily_punch_id);
		return commentMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public int comment(Comment comment) throws Exception {
		DailyPunch dailyPunch = dailyPunchMapper.selectByPrimaryKey(comment.getDailyPunchId());
		dailyPunch.setDailyPunchCommentNum(dailyPunch.getDailyPunchCommentNum()+1);
		dailyPunchMapper.updateByPrimaryKeyWithBLOBs(dailyPunch);
		return commentMapper.insertSelective(comment);
	}

	@Override
	public int commentAgree(String comment_id) throws Exception {
		Comment comment = commentMapper.selectByPrimaryKey(comment_id);
		comment.setCommentAgree(comment.getCommentAgree()+1);
		return commentMapper.updateByPrimaryKeySelective(comment);
	}

	@Override
	public int dailyPunchAgree(String dailyPunchId) throws Exception {
		DailyPunch dailyPunch = dailyPunchMapper.selectByPrimaryKey(dailyPunchId);
		dailyPunch.setDailyPunchAgree(dailyPunch.getDailyPunchAgree()+1);
		return dailyPunchMapper.updateByPrimaryKeySelective(dailyPunch);
	}
	

}
