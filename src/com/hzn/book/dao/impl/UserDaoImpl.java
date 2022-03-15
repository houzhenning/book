package com.hzn.book.dao.impl;

import com.atguigu.myssm.basedao.BaseDAO;
import com.hzn.book.dao.UserDao;
import com.hzn.book.pojo.User;

public class UserDaoImpl extends BaseDAO<User> implements UserDao {

    @Override
    public User getUser(String uname, String pwd) {
        return load("select * from  t_user where uname like ? and pwd like ?", uname, pwd);
    }
}
