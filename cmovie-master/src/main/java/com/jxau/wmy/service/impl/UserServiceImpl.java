package com.jxau.wmy.service.impl;


import com.jxau.wmy.mapper.UserMapper;
import com.jxau.wmy.pojo.User;
import com.jxau.wmy.service.UserService;
import com.jxau.wmy.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUsers() {
        return userMapper.getUsers();
    }

    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    @Override
    public User getUserByEmail(String email) {
        return userMapper.getUserByEmail(email);
    }

    @Override
    public void saveUser(User user) {
        userMapper.saveUser(user);
    }

    @Override
    public Boolean login(String email, String password) {
        User user = getUserByEmail(email);
        String salt = user.getSalt();
        String encryptPassword = MD5Utils.md5(password, salt);
        return encryptPassword.equals(user.getPassword());
    }
}
