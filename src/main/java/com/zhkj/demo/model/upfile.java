package com.zhkj.demo.model;

public class upfile {
    private Integer fId;

    private String fTime;

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId;
    }

    public String getfTime() {
        return fTime;
    }

    public void setfTime(String fTime) {
        this.fTime = fTime == null ? null : fTime.trim();
    }
}