package com.hzn.book.service.impl;

import com.hzn.book.dao.BookDao;
import com.hzn.book.pojo.Book;
import com.hzn.book.service.BookService;

import java.util.List;

public class BookServiceImpl implements BookService {

    private BookDao bookDao;

    @Override
    public List<Book> getBookList() {
        return bookDao.getBookList();
    }
}
