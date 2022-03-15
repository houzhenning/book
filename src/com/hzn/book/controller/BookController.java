package com.hzn.book.controller;

import com.hzn.book.pojo.Book;
import com.hzn.book.service.BookService;

import javax.servlet.http.HttpSession;
import java.util.List;

public class BookController {

    private BookService bookService;

    public String index(HttpSession session) {
        List<Book> bookList = bookService.getBookList();
        session.setAttribute("bookList", bookList);
        return "index";
    }

}
