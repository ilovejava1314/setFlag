package setflag.pojo;

import java.util.Date;

public class DailyPunch {
    private String dailyPunchId;

    private String dailyPunchTitle;

    private String dailyPunchImage;

    private Date dailyPunchDate;

    private Integer dailyPunchCommentNum;

    private Integer dailyPunchAgree;

    private String userId;

    private String dailyPunchContent;

    public String getDailyPunchId() {
        return dailyPunchId;
    }

    public void setDailyPunchId(String dailyPunchId) {
        this.dailyPunchId = dailyPunchId == null ? null : dailyPunchId.trim();
    }

    public String getDailyPunchTitle() {
        return dailyPunchTitle;
    }

    public void setDailyPunchTitle(String dailyPunchTitle) {
        this.dailyPunchTitle = dailyPunchTitle == null ? null : dailyPunchTitle.trim();
    }

    public String getDailyPunchImage() {
        return dailyPunchImage;
    }

    public void setDailyPunchImage(String dailyPunchImage) {
        this.dailyPunchImage = dailyPunchImage == null ? null : dailyPunchImage.trim();
    }

    public Date getDailyPunchDate() {
        return dailyPunchDate;
    }

    public void setDailyPunchDate(Date dailyPunchDate) {
        this.dailyPunchDate = dailyPunchDate;
    }

    public Integer getDailyPunchCommentNum() {
        return dailyPunchCommentNum;
    }

    public void setDailyPunchCommentNum(Integer dailyPunchCommentNum) {
        this.dailyPunchCommentNum = dailyPunchCommentNum;
    }

    public Integer getDailyPunchAgree() {
        return dailyPunchAgree;
    }

    public void setDailyPunchAgree(Integer dailyPunchAgree) {
        this.dailyPunchAgree = dailyPunchAgree;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getDailyPunchContent() {
        return dailyPunchContent;
    }

    public void setDailyPunchContent(String dailyPunchContent) {
        this.dailyPunchContent = dailyPunchContent == null ? null : dailyPunchContent.trim();
    }

	public DailyPunch() {	}

	public DailyPunch(String dailyPunchId, String dailyPunchTitle, String dailyPunchImage, Date dailyPunchDate,
			Integer dailyPunchCommentNum, Integer dailyPunchAgree, String userId, String dailyPunchContent) {
		this.dailyPunchId = dailyPunchId;
		this.dailyPunchTitle = dailyPunchTitle;
		this.dailyPunchImage = dailyPunchImage;
		this.dailyPunchDate = dailyPunchDate;
		this.dailyPunchCommentNum = dailyPunchCommentNum;
		this.dailyPunchAgree = dailyPunchAgree;
		this.userId = userId;
		this.dailyPunchContent = dailyPunchContent;
	}
    
	
    
}