package com.hzn.book.dao;


import com.hzn.book.pojo.User;

public interface UserDao {
    User getUser(String uname, String pwd);
}
