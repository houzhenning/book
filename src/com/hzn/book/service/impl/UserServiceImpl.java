package com.hzn.book.service.impl;

import com.hzn.book.dao.UserDao;
import com.hzn.book.pojo.User;
import com.hzn.book.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Override
    public User login(String uname, String pwd) {
        return userDao.getUser(uname, pwd);
    }
}
