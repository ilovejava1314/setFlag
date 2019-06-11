package setflag.pojo;

public class SysFlag {
    private String sysFlagId;

    private String sysFlagTitle;

    private String sysFlagContent;

    private String sysFlagImage;

    public String getSysFlagId() {
        return sysFlagId;
    }

    public void setSysFlagId(String sysFlagId) {
        this.sysFlagId = sysFlagId == null ? null : sysFlagId.trim();
    }

    public String getSysFlagTitle() {
        return sysFlagTitle;
    }

    public void setSysFlagTitle(String sysFlagTitle) {
        this.sysFlagTitle = sysFlagTitle == null ? null : sysFlagTitle.trim();
    }

    public String getSysFlagContent() {
        return sysFlagContent;
    }

    public void setSysFlagContent(String sysFlagContent) {
        this.sysFlagContent = sysFlagContent == null ? null : sysFlagContent.trim();
    }

    public String getSysFlagImage() {
        return sysFlagImage;
    }

    public void setSysFlagImage(String sysFlagImage) {
        this.sysFlagImage = sysFlagImage == null ? null : sysFlagImage.trim();
    }
}