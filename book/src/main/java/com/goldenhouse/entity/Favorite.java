package com.goldenhouse.entity;

import org.apache.ibatis.type.Alias;

import java.util.List;

/**
 * 收藏夹属性
 */
@Alias("favorite")
public class Favorite {
    //收藏夹id
    private Integer fId;
    //用户id
    private Integer cId;
    //书籍id
    private Integer bId;

    //收藏夹外键关联到用户属性
    private Customer customer;

    //收藏夹关联到书本属性
    private List<Book> books;
    public Favorite() {
    }

    public Favorite(Integer fId, Integer cId, Integer bId, Customer customer, List<Book> books) {
        this.fId = fId;
        this.cId = cId;
        this.bId = bId;
        this.customer = customer;
        this.books = books;
    }

    public Integer getFId() {
        return fId;
    }

    public void setFId(Integer fId) {
        this.fId = fId;
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
        return "Favorite{" +
                "fId=" + fId +
                ", cId=" + cId +
                ", bId=" + bId +
                ", customer=" + customer +
                ", books=" + books +
                '}';
    }
}
