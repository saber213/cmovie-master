package com.jxau.wmy.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jxau.wmy.pojo.Movie;
import com.jxau.wmy.pojo.MovieScore;
import com.jxau.wmy.pojo.ReviewVo;
import com.jxau.wmy.pojo.Scene;
import com.jxau.wmy.service.MovieService;
import com.jxau.wmy.service.ReviewService;
import com.jxau.wmy.service.SceneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MovieController {

    @Autowired
    private MovieService movieService;

    @Autowired
    private SceneService sceneService;

    @Autowired
    private ReviewService reviewService;


    @RequestMapping(value = "/movie-list")
    public String movieList(@RequestParam(value = "page", defaultValue = "1") Integer page,
                            @RequestParam(value = "size", defaultValue = "3") Integer size,
                            Model model) {

        Page<MovieScore> movies = PageHelper.startPage(page, size).doSelectPage(() -> movieService.getAll());
        List<Integer> scenes = new ArrayList<>();
        for (MovieScore movieScore: movies){
            int movieId = movieScore.getId();
            scenes.add(sceneService.getSceneCounts(movieId));
        }
        model.addAttribute("movies", movies.toPageInfo());
        model.addAttribute("scenes", scenes);
        return "movie-list";
    }

    @RequestMapping("/movie/{id}")
    public String getOneMovie(@PathVariable(value = "id") Integer id, Model model) {
        Movie movie = movieService.getById(id);
        List<Scene> scenes = sceneService.getSceneCount(id);
        List<ReviewVo> reviews = reviewService.getMovieReview(id);
        model.addAttribute("reviews", reviews);
        model.addAttribute("movie", movie);
        model.addAttribute("scenes", scenes);
        return "movie";
    }

    @GetMapping("/rate")
    public String getMovieScore(@RequestParam(value = "page", defaultValue = "1") Integer page,
                                @RequestParam(value = "size", defaultValue = "5") Integer size,
                                Model model) {
        Page<MovieScore> movieScores = PageHelper.startPage(page, size).doSelectPage(() -> movieService.getMovieScore());
        model.addAttribute("movies", movieScores.toPageInfo());
        return "rate";
    }
}
