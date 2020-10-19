package com.jxau.wmy.service.impl;

import com.jxau.wmy.mapper.ScoreMapper;
import com.jxau.wmy.pojo.Score;
import com.jxau.wmy.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    private ScoreMapper scoreMapper;

    @Override
    public int addScore(Score score) {
        int result = scoreMapper.addScore(score);
        return result;
    }

    @Override
    public List<Score> getScoreByUserIdAndMovieId(Integer userId, Integer movieId) {
        return scoreMapper.getScoreByUserIdAndMovieId(userId,movieId);
    }
}
