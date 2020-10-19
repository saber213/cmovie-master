package com.jxau.wmy.pojo;


public class BookForm {
    //第一次提交

    private String movieName;
    private String showtime;
    private String showDate;
    private Integer sceneId;
    private Integer price;

    //第二次提交

    private Integer siteNum;
    private Integer totalPrice;
    private String bookedSits;

    public BookForm() {
    }

    public BookForm(String movieName, String showtime, String showDate, Integer sceneId, Integer price, Integer siteNum, Integer totalPrice, String bookedSits) {
        this.movieName = movieName;
        this.showtime = showtime;
        this.showDate = showDate;
        this.sceneId = sceneId;
        this.price = price;
        this.siteNum = siteNum;
        this.totalPrice = totalPrice;
        this.bookedSits = bookedSits;
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

    public String getShowDate() {
        return showDate;
    }

    public void setShowDate(String showDate) {
        this.showDate = showDate;
    }

    public Integer getSceneId() {
        return sceneId;
    }

    public void setSceneId(Integer sceneId) {
        this.sceneId = sceneId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getSiteNum() {
        return siteNum;
    }

    public void setSiteNum(Integer siteNum) {
        this.siteNum = siteNum;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getBookedSits() {
        return bookedSits;
    }

    public void setBookedSits(String bookedSits) {
        this.bookedSits = bookedSits;
    }

    @Override
    public String toString() {
        return "BookForm{" +
                "movieName='" + movieName + '\'' +
                ", showtime='" + showtime + '\'' +
                ", showDate='" + showDate + '\'' +
                ", sceneId=" + sceneId +
                ", price=" + price +
                ", siteNum=" + siteNum +
                ", totalPrice=" + totalPrice +
                ", bookedSits='" + bookedSits + '\'' +
                '}';
    }
}
