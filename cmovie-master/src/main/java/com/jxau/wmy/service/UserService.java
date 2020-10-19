package com.jxau.wmy.service;

import com.jxau.wmy.pojo.User;

import java.util.List;

public interface UserService {

    /**
     * 获取所有用户
     *
     * @return
     */
    List<User> getUsers();

    /**
     * 根据id查询用户
     *
     * @param id
     * @return
     */
    User getUserById(Integer id);

    /**
     * 根据email查询用户
     *
     * @param email
     * @return
     */
    User getUserByEmail(String email);

    /**
     * 保存用户
     *
     * @param user
     */
    void saveUser(User user);

    /**
     * 登录
     *
     * @param email
     * @param password
     * @return
     */
    Boolean login(String email, String password);
}
