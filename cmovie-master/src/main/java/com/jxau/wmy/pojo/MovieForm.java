package com.jxau.wmy.pojo;

import java.util.Arrays;
import java.util.Date;


public class MovieForm {
    private Integer id;
    private String name;
    private String duration;
    private String directors;
    private String actors;
    private Date releaseDate;
    private Integer[] categoryIds;
    private Integer status;
    private String plot;
    private String poster;
    private String country;

    public MovieForm() {
    }

    public MovieForm(Integer id, String name, String duration, String directors, String actors, Date releaseDate, Integer[] categoryIds, Integer status, String plot, String poster, String country) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.directors = directors;
        this.actors = actors;
        this.releaseDate = releaseDate;
        this.categoryIds = categoryIds;
        this.status = status;
        this.plot = plot;
        this.poster = poster;
        this.country = country;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDirectors() {
        return directors;
    }

    public void setDirectors(String directors) {
        this.directors = directors;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Integer[] getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryIds(Integer[] categoryIds) {
        this.categoryIds = categoryIds;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "MovieForm{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", duration='" + duration + '\'' +
                ", directors='" + directors + '\'' +
                ", actors='" + actors + '\'' +
                ", releaseDate=" + releaseDate +
                ", categoryIds=" + Arrays.toString(categoryIds) +
                ", status=" + status +
                ", plot='" + plot + '\'' +
                ", poster='" + poster + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
