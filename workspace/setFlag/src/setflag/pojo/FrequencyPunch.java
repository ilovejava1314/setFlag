package setflag.pojo;

import java.util.Date;

public class FrequencyPunch {
    private String frequencyPunchId;

    private String userId;

    private String flagId;

    private String isTure;

    private Date frequencyPunchDate;

    public String getFrequencyPunchId() {
        return frequencyPunchId;
    }

    public void setFrequencyPunchId(String frequencyPunchId) {
        this.frequencyPunchId = frequencyPunchId == null ? null : frequencyPunchId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getFlagId() {
        return flagId;
    }

    public void setFlagId(String flagId) {
        this.flagId = flagId == null ? null : flagId.trim();
    }

    public String getIsTure() {
        return isTure;
    }

    public void setIsTure(String isTure) {
        this.isTure = isTure == null ? null : isTure.trim();
    }

    public Date getFrequencyPunchDate() {
        return frequencyPunchDate;
    }

    public void setFrequencyPunchDate(Date frequencyPunchDate) {
        this.frequencyPunchDate = frequencyPunchDate;
    }
}