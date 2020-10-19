package com.jxau.wmy.pojo;

import java.util.Date;


public class Watch {

    private Integer id;
    private Integer userId;
    private Integer movieId;
    private Date createTime;

    public Watch() {
    }

    public Watch(Integer id, Integer userId, Integer movieId, Date createTime) {
        this.id = id;
        this.userId = userId;
        this.movieId = movieId;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Watch{" +
                "id=" + id +
                ", userId=" + userId +
                ", movieId=" + movieId +
                ", createTime=" + createTime +
                '}';
    }
}
