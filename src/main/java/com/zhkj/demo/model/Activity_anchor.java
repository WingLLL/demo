package com.zhkj.demo.model;

public class Activity_anchor {
    private String anchorname;

    private String value;

    private String url;

    private String time;

    private String imghost;

    public String getAnchorname() {
        return anchorname;
    }

    public void setAnchorname(String anchorname) {
        this.anchorname = anchorname == null ? null : anchorname.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getImghost() {
        return imghost;
    }

    public void setImghost(String imghost) {
        this.imghost = imghost == null ? null : imghost.trim();
    }
}