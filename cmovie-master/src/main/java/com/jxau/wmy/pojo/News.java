package com.jxau.wmy.pojo;

import java.util.Date;


public class News {
    private Integer id;
    private String title;
    private String content;
    private Date createTime;
    private String picture;

    public News() {
    }

    public News(Integer id, String title, String content, Date createTime, String picture) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.createTime = createTime;
        this.picture = picture;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createTime=" + createTime +
                ", picture='" + picture + '\'' +
                '}';
    }
}
