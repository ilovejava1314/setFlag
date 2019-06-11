package setflag.pojo;

import java.util.Date;

public class Comment {
    private String commentId;

    private String dailyPunchId;

    private String parentId;

    private String userId;

    private Integer commentAgree;

    private Date commentCreateTime;

    private String commentContent;

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId == null ? null : commentId.trim();
    }

    public String getDailyPunchId() {
        return dailyPunchId;
    }

    public void setDailyPunchId(String dailyPunchId) {
        this.dailyPunchId = dailyPunchId == null ? null : dailyPunchId.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getCommentAgree() {
        return commentAgree;
    }

    public void setCommentAgree(Integer commentAgree) {
        this.commentAgree = commentAgree;
    }

    public Date getCommentCreateTime() {
        return commentCreateTime;
    }

    public void setCommentCreateTime(Date commentCreateTime) {
        this.commentCreateTime = commentCreateTime;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }

	public Comment() {	}

	public Comment(String commentId, String dailyPunchId, String parentId, String userId, Integer commentAgree,
			Date commentCreateTime, String commentContent) {
		this.commentId = commentId;
		this.dailyPunchId = dailyPunchId;
		this.parentId = parentId;
		this.userId = userId;
		this.commentAgree = commentAgree;
		this.commentCreateTime = commentCreateTime;
		this.commentContent = commentContent;
	}
    
	
    
}