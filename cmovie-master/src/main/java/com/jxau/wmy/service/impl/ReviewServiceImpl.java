package com.jxau.wmy.service.impl;

import com.jxau.wmy.mapper.ReviewMapper;
import com.jxau.wmy.pojo.Review;
import com.jxau.wmy.pojo.ReviewVo;
import com.jxau.wmy.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewMapper reviewMapper;

    @Override
    public int addReview(Review review) {
        return reviewMapper.addReview(review);
    }

    @Override
    public List<Review> getAll() {
        return reviewMapper.getAll();
    }

    @Override
    public List<ReviewVo> getMovieReview(Integer movieId) {
        return reviewMapper.getMovieReview(movieId);
    }
}
