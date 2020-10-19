package com.jxau.wmy.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jxau.wmy.pojo.MovieScore;
import com.jxau.wmy.pojo.User;
import com.jxau.wmy.pojo.Watch;
import com.jxau.wmy.service.MovieService;
import com.jxau.wmy.service.WatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
public class WatchController {

    @Autowired
    private MovieService movieService;

    @Autowired
    private WatchService watchService;

    @GetMapping(value = "/watch-list")
    public String watchList(@RequestParam(value = "page", defaultValue = "1") Integer page,
                            @RequestParam(value = "size", defaultValue = "3") Integer size,
                            Model model, HttpSession session) {
        User user = (User) session.getAttribute("login");
        Page<MovieScore> movies = PageHelper.startPage(page, size).doSelectPage(() -> movieService.getUserMovie(user.getId()));
        model.addAttribute("movies", movies.toPageInfo());
        return "watch-list";
    }

    @PostMapping(value = "/watch")
    public ResponseEntity addWatch(HttpSession session, Integer movieId) {
        User user = (User) session.getAttribute("login");
        Watch watch1 = watchService.getWatchByIds(user.getId(), movieId);
        if (watch1 != null) {
            return ResponseEntity.ok("已经在列表中，请勿重复添加！");
        }
        Watch watch = new Watch();
        watch.setMovieId(movieId);
        watch.setUserId(user.getId());
        watch.setCreateTime(new Date());
        int result = watchService.addWatch(watch);
        if (result != 0) {
            return ResponseEntity.ok("添加成功！");
        }
        return ResponseEntity.ok("添加异常！");
    }

    @DeleteMapping(value = "/watch/{movieId}")
    public ResponseEntity deleteWatch(@PathVariable(value = "movieId") Integer movieId) {
        int result = watchService.deleteWatch(movieId);
        if (result != 0) {
            return ResponseEntity.ok("删除成功！");
        }
        return ResponseEntity.ok("删除异常！");
    }
}
