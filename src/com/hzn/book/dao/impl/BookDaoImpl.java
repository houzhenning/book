package com.hzn.book.dao.impl;

import com.atguigu.myssm.basedao.BaseDAO;
import com.hzn.book.dao.BookDao;
import com.hzn.book.pojo.Book;

import java.util.List;

public class BookDaoImpl extends BaseDAO<Book> implements BookDao {

    @Override
    public List<Book> getBookList() {
        return executeQuery("select * from t_book");
    }
}
