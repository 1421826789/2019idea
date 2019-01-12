package com.youzhong.entity;

public class Reqimg {
    private Long id;

    private String name;

    private String url;

    private Long reqid;

    private byte[] img;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Long getReqid() {
        return reqid;
    }

    public void setReqid(Long reqid) {
        this.reqid = reqid;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }
}