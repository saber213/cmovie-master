package com.jxau.wmy.service;

import com.jxau.wmy.pojo.Score;

import java.util.List;

public interface ScoreService {
    /**
     * 添加评分
     * @param score
     * @return
     */
    int addScore(Score score);

    /**
     * 根据用户id和电影id查询分数
     * @param userId
     * @param movieId
     * @return
     */
    List<Score> getScoreByUserIdAndMovieId(Integer userId,Integer movieId);
}
