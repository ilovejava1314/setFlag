package setflag.service;

import java.util.List;

import setflag.pojo.Comment;

public interface CommentService {

	List<Comment> getComments(String daily_punch_id) throws Exception;

	int comment(Comment comment) throws Exception;

	int commentAgree(String comment_id) throws Exception;

	int dailyPunchAgree(String dailyPunchId) throws Exception;

}
