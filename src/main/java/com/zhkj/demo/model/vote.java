package com.zhkj.demo.model;

public class vote {
    private Integer vId;

    private String vName;

    private Integer vNum;

    private String vPic;

    public Integer getvId() {
        return vId;
    }

    public void setvId(Integer vId) {
        this.vId = vId;
    }

    public String getvName() {
        return vName;
    }

    public void setvName(String vName) {
        this.vName = vName == null ? null : vName.trim();
    }

    public Integer getvNum() {
        return vNum;
    }

    public void setvNum(Integer vNum) {
        this.vNum = vNum;
    }

    public String getvPic() {
        return vPic;
    }

    public void setvPic(String vPic) {
        this.vPic = vPic == null ? null : vPic.trim();
    }
}