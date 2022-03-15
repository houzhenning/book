package com.hzn.book.pojo;

public class OrderDetail {
    private Integer id;
    private Book book;
    private Integer buyCount;
    private OrderBean orderBean;

    public OrderDetail() {};

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Integer getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(Integer buyCount) {
        this.buyCount = buyCount;
    }

    public OrderBean getOrderBean() {
        return orderBean;
    }

    public void setOrderBean(OrderBean orderBean) {
        this.orderBean = orderBean;
    }

    public OrderDetail(Integer id) {
        this.id = id;
    }
}
