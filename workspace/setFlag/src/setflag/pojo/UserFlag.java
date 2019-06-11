package setflag.pojo;

import java.util.Date;

public class UserFlag {
    private String userFlagId;

    private String userFlagTitle;

    private String userFlagContent;

    private Date userFlagDate;

    private String userFlagImage;

    public String getUserFlagId() {
        return userFlagId;
    }

    public void setUserFlagId(String userFlagId) {
        this.userFlagId = userFlagId == null ? null : userFlagId.trim();
    }

    public String getUserFlagTitle() {
        return userFlagTitle;
    }

    public void setUserFlagTitle(String userFlagTitle) {
        this.userFlagTitle = userFlagTitle == null ? null : userFlagTitle.trim();
    }

    public String getUserFlagContent() {
        return userFlagContent;
    }

    public void setUserFlagContent(String userFlagContent) {
        this.userFlagContent = userFlagContent == null ? null : userFlagContent.trim();
    }

    public Date getUserFlagDate() {
        return userFlagDate;
    }

    public void setUserFlagDate(Date userFlagDate) {
        this.userFlagDate = userFlagDate;
    }

    public String getUserFlagImage() {
        return userFlagImage;
    }

    public void setUserFlagImage(String userFlagImage) {
        this.userFlagImage = userFlagImage == null ? null : userFlagImage.trim();
    }
}