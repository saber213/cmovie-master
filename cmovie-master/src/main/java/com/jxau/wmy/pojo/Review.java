package com.jxau.wmy.pojo;

import java.util.Date;


public class Review {
    private Integer id;
    private String content;
    private Integer movieId;
    private Integer userId;
    private Date createTime;

    public Review() {
    }

    public Review(Integer id, String content, Integer movieId, Integer userId, Date createTime) {
        this.id = id;
        this.content = content;
        this.movieId = movieId;
        this.userId = userId;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", movieId=" + movieId +
                ", userId=" + userId +
                ", createTime=" + createTime +
                '}';
    }
}
