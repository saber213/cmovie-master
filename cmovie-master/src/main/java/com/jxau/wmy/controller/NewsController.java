package com.jxau.wmy.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jxau.wmy.pojo.News;
import com.jxau.wmy.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping(value = "/news-list")
    public String getNews(
            @RequestParam(value = "page", required = false, defaultValue = "1") Integer page,
            @RequestParam(value = "size", required = false, defaultValue = "3") Integer size,
            Model model) {
        Page<News> newsList = PageHelper.startPage(page, size)
                .doSelectPage(() -> newsService.getAll());
        model.addAttribute("newsList", newsList.toPageInfo());
        return "news-list";
    }

    @GetMapping(value = "/news/{id}")
    public String getNewsById(@PathVariable(value = "id") Integer id, Model model) {
        News news = newsService.getById(id);
        model.addAttribute(news);
        return "news";
    }
}
