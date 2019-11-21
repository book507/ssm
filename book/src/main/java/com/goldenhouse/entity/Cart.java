package com.goldenhouse.entity;

import org.apache.ibatis.type.Alias;

import java.util.List;

/**
 * 购物车属性
 */
@Alias("cart")
public class Cart {
    //购物车id
    private Integer gId;
    //用户id
    private Integer cId;
    //书籍id
    private Integer bId;
    //购物车外键关联到用户属性
    private Customer customer;

    //购物车外键关联到书本属性
    private List<Book> books;

    public Cart() {
    }

    public Cart(Integer gId, Integer cId, Integer bId, Customer customer, List<Book> books) {
        this.gId = gId;
        this.cId = cId;
        this.bId = bId;
        this.customer = customer;
        this.books = books;
    }

    public Integer getGId() {
        return gId;
    }

    public void setGId(Integer gId) {
        this.gId = gId;
    }

    public Integer getCId() {
        return cId;
    }

    public void setCId(Integer cId) {
        this.cId = cId;
    }

    public Integer getBId() {
        return bId;
    }

    public void setBId(Integer bId) {
        this.bId = bId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "gId=" + gId +
                ", cId=" + cId +
                ", bId=" + bId +
                ", customer=" + customer +
                ", books=" + books +
                '}';
    }
}
