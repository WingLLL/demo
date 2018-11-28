package com.zhkj.demo.util.ExcelVS;

/**
 * Created by zhaoyu
 */

public class AnchorVS {


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName_vs() {
        return name_vs;
    }

    public void setName_vs(String name_vs) {
        this.name_vs = name_vs;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getValue_vs() {
        return value_vs;
    }

    public void setValue_vs(Integer value_vs) {
        this.value_vs = value_vs;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl_vs() {
        return url_vs;
    }

    public void setUrl_vs(String url_vs) {
        this.url_vs = url_vs;
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

    public String getImgHost_vs() {
        return imgHost_vs;
    }

    public void setImgHost_vs(String imgHost_vs) {
        this.imgHost_vs = imgHost_vs;
    }

    public String getVs() {
        return vs;
    }

    public void setVs(String vs) {
        this.vs = vs;
    }











    private String name;
    private String name_vs;
    private String url;

    public AnchorVS(String name, String name_vs, String url, String url_vs, Integer value, Integer value_vs, String imgHost, String imgHost_vs, String time, String vs) {
        this.name = name;
        this.name_vs = name_vs;
        this.url = url;
        this.url_vs = url_vs;
        this.value = value;
        this.value_vs = value_vs;
        this.imgHost = imgHost;
        this.imgHost_vs = imgHost_vs;
        this.time = time;
        this.vs = vs;
    }

    private String url_vs;
    private Integer value;
    private Integer value_vs;
    private String imgHost;
    private String imgHost_vs;
    private String time;
    private String vs;
}
