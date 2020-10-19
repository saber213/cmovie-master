package com.jxau.wmy.pojo;

public class Score {
    private Integer id;
    private Integer userId;
    private Integer movieId;
    private Integer score;

    public Score() {
    }

    public Score(Integer id, Integer userId, Integer movieId, Integer score) {
        this.id = id;
        this.userId = userId;
        this.movieId = movieId;
        this.score = score;
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

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Score{" +
                "id=" + id +
                ", userId=" + userId +
                ", movieId=" + movieId +
                ", score=" + score +
                '}';
    }
}
