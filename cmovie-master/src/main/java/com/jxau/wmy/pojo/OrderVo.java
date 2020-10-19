package com.jxau.wmy.pojo;

import java.util.Date;


public class OrderVo {
    private Integer id;
    private Integer status;
    private Integer userId;
    private Date createTime;
    private Integer sceneId;
    private String ticketNum;
    private Integer totalPrice;
    private String seat;

    private String movieName;
    private String showtime;

    public OrderVo() {
    }

    public OrderVo(Integer id, Integer status, Integer userId, Date createTime, Integer sceneId, String ticketNum, Integer totalPrice, String seat, String movieName, String showtime) {
        this.id = id;
        this.status = status;
        this.userId = userId;
        this.createTime = createTime;
        this.sceneId = sceneId;
        this.ticketNum = ticketNum;
        this.totalPrice = totalPrice;
        this.seat = seat;
        this.movieName = movieName;
        this.showtime = showtime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public Integer getSceneId() {
        return sceneId;
    }

    public void setSceneId(Integer sceneId) {
        this.sceneId = sceneId;
    }

    public String getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(String ticketNum) {
        this.ticketNum = ticketNum;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getShowtime() {
        return showtime;
    }

    public void setShowtime(String showtime) {
        this.showtime = showtime;
    }

    @Override
    public String toString() {
        return "OrderVo{" +
                "id=" + id +
                ", status=" + status +
                ", userId=" + userId +
                ", createTime=" + createTime +
                ", sceneId=" + sceneId +
                ", ticketNum='" + ticketNum + '\'' +
                ", totalPrice=" + totalPrice +
                ", seat='" + seat + '\'' +
                ", movieName='" + movieName + '\'' +
                ", showtime='" + showtime + '\'' +
                '}';
    }
}
