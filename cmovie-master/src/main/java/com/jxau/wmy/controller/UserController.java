package com.jxau.wmy.controller;

import com.jxau.wmy.constant.Role;
import com.jxau.wmy.exception.MessageException;
import com.jxau.wmy.pojo.User;
import com.jxau.wmy.service.UserService;
import com.jxau.wmy.utils.MD5Utils;
import com.jxau.wmy.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users")
    @ResponseBody
    public Msg getUsers() {
        List<User> users = userService.getUsers();
        return Msg.success().add("first", users);
    }

    @RequestMapping(value = "/doLogin")
    @ResponseBody
    public Msg login(@RequestParam("email") String email,
                     @RequestParam("password") String password,
                     HttpSession session) throws MessageException {
        User user = userService.getUserByEmail(email);
        if (user == null) {
            throw new MessageException("该用户不存在！");
        }
        if (userService.login(email, password)) {
            session.setAttribute("login", user);
            return Msg.success().add("msg", "成功登录！");
        }
        throw new MessageException("密码错误！");
    }

    @RequestMapping(value = "/doLogout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }

    @RequestMapping(value = "/doRegister")
    @ResponseBody
    public Msg register(User user) throws MessageException {
        User user1 = userService.getUserByEmail(user.getEmail());
        if (user1 != null) {
            throw new MessageException("该用户已经被注册");
        }
        user.setRole(Role.USER);
        user.setSalt(MD5Utils.getSalt());
        user.setPassword(MD5Utils.md5(user.getPassword(), user.getSalt()));
        userService.saveUser(user);
        return Msg.success().add("mes", "注册成功！");
    }

}
