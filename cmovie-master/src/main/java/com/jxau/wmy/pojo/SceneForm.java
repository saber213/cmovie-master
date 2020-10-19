package com.jxau.wmy.pojo;

import java.util.Arrays;


public class SceneForm {
    private Integer id;
    private Integer movieId;
    private String movieName;
    private Integer price;
    private Integer seatNum;
    private String showtime;
    private String[] bookedSeat;

    public SceneForm() {
    }

    public SceneForm(Integer id, Integer movieId, String movieName, Integer price, Integer seatNum, String showtime, String[] bookedSeat) {
        this.id = id;
        this.movieId = movieId;
        this.movieName = movieName;
        this.price = price;
        this.seatNum = seatNum;
        this.showtime = showtime;
        this.bookedSeat = bookedSeat;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(Integer seatNum) {
        this.seatNum = seatNum;
    }

    public String getShowtime() {
        return showtime;
    }

    public void setShowtime(String showtime) {
        this.showtime = showtime;
    }

    public String[] getBookedSeat() {
        return bookedSeat;
    }

    public void setBookedSeat(String[] bookedSeat) {
        this.bookedSeat = bookedSeat;
    }

    @Override
    public String toString() {
        return "SceneForm{" +
                "id=" + id +
                ", movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", price=" + price +
                ", seatNum=" + seatNum +
                ", showtime='" + showtime + '\'' +
                ", bookedSeat=" + Arrays.toString(bookedSeat) +
                '}';
    }
}
