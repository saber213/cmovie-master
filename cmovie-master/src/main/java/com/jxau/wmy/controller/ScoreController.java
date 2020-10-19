package com.jxau.wmy.controller;

import com.jxau.wmy.pojo.Score;
import com.jxau.wmy.pojo.User;
import com.jxau.wmy.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @PostMapping(value = "/score")
    public ResponseEntity addScore(HttpSession session,Integer movieId,Integer score){
        User user = (User) session.getAttribute("login");
        List<Score> scores = scoreService.getScoreByUserIdAndMovieId(user.getId(),movieId);
        Score score1 = new Score();
        score1.setUserId(user.getId());
        score1.setMovieId(movieId);
        score1.setScore(score);
        if(scores.size()==0){
            int result = scoreService.addScore(score1);
            if(result != 0){
                return  ResponseEntity.ok("评分成功！");
            }
        }else {
            return ResponseEntity.ok("您已对该电影评过分！");
        }

        return ResponseEntity.ok("评分出现异常！");
    }
}
