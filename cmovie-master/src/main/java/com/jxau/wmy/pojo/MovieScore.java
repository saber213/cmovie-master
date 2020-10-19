package com.jxau.wmy.pojo;

import java.util.Date;
import java.util.List;


public class MovieScore {
    private Integer id;
    private String name;
    private String duration;
    private String directors;
    private String actors;
    private Date releaseDate;
    private Integer status;
    private String plot;
    private String poster;
    private String country;
    private List<Category> categories;

    private Double score = 0.0;
    private Integer count = 0;

    public MovieScore() {
    }

    public MovieScore(Integer id, String name, String duration, String directors, String actors, Date releaseDate, Integer status, String plot, String poster, String country, List<Category> categories, Double score, Integer count) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.directors = directors;
        this.actors = actors;
        this.releaseDate = releaseDate;
        this.status = status;
        this.plot = plot;
        this.poster = poster;
        this.country = country;
        this.categories = categories;
        this.score = score;
        this.count = count;
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

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "MovieScore{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", duration='" + duration + '\'' +
                ", directors='" + directors + '\'' +
                ", actors='" + actors + '\'' +
                ", releaseDate=" + releaseDate +
                ", status=" + status +
                ", plot='" + plot + '\'' +
                ", poster='" + poster + '\'' +
                ", country='" + country + '\'' +
                ", categories=" + categories +
                ", score=" + score +
                ", count=" + count +
                '}';
    }
}
