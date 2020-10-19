package com.jxau.wmy.advice;

import com.jxau.wmy.pojo.User;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class UserInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        User user = (User) request.getSession().getAttribute("login");
        if (user == null) {
            request.getRequestDispatcher("/login").forward(request, response);
            return false;
        }
        return true;
    }
}
