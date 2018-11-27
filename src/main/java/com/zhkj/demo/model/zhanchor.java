package com.zhkj.demo.model;

public class zhanchor {
    private Integer zid;

    private String zname;

    private Integer zroomid;

    private Integer funsnum;

    private String zpic;

    private String zintro;

    public Integer getZid() {
        return zid;
    }

    public void setZid(Integer zid) {
        this.zid = zid;
    }

    public String getZname() {
        return zname;
    }

    public void setZname(String zname) {
        this.zname = zname == null ? null : zname.trim();
    }

    public Integer getZroomid() {
        return zroomid;
    }

    public void setZroomid(Integer zroomid) {
        this.zroomid = zroomid;
    }

    public Integer getFunsnum() {
        return funsnum;
    }

    public void setFunsnum(Integer funsnum) {
        this.funsnum = funsnum;
    }

    public String getZpic() {
        return zpic;
    }

    public void setZpic(String zpic) {
        this.zpic = zpic == null ? null : zpic.trim();
    }

    public String getZintro() {
        return zintro;
    }

    public void setZintro(String zintro) {
        this.zintro = zintro == null ? null : zintro.trim();
    }
}