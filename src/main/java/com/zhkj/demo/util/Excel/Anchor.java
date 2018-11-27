package com.zhkj.demo.util.Excel;

/**
 * Created by zhaoyu
 */
public class Anchor {

    public String getAnchorName() {
        return anchorName;
    }

    public void setAnchorName(String anchorName) {
        this.anchorName = anchorName;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String geturl() {
        return url;
    }

    public void seturl(String geturl) {
        this.url = geturl;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getImgHost() {
        return imgHost;
    }

    public void setImgHost(String imgHost) {
        this.imgHost = imgHost;
    }

    private String  anchorName;

    public Anchor(String anchorName, Integer value, String geturl, String time, String imgHost) {
        this.anchorName = anchorName;
        this.value = value;
        this.url = geturl;
        this.time = time;
        this.imgHost = imgHost;
    }

    private Integer value;
    private String url;
    private String time;
    private String imgHost;
}
