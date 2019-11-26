package com.goldenhouse.entity;

import org.apache.ibatis.type.Alias;

//书籍信息实体类
@Alias( "book" )
public class Book {
    //书籍ID
    private  Integer bookId;

    //书籍名称
    private String bookName;

    //书籍价格
    private String bookPrice;

    //书籍介绍
    private String bookWhat;

    //书籍分类ID
    private  Integer bsId;

    //书籍属性外键关联到书籍分类
    private Booksort booksort;

    public Book() {
    }

    public Book(Integer bookId, String bookName, String bookPrice, String bookWhat, Integer bsId, Booksort booksort) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.bookWhat = bookWhat;
        this.bsId = bsId;
        this.booksort=booksort;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(String bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookWhat() {
        return bookWhat;
    }

    public void setBookWhat(String bookWhat) {
        this.bookWhat = bookWhat;
    }

    public Integer getBsId() {
        return bsId;
    }

    public void setBsId(Integer bsId) {
        this.bsId = bsId;
    }

    public Booksort getBooksort() {
        return booksort;
    }

    public void setBooksort(Booksort booksort) {
        this.booksort=booksort;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookPrice='" + bookPrice + '\'' +
                ", bookWhat='" + bookWhat + '\'' +
                ", bsId=" + bsId +
                ", booksort=" + booksort +
                '}';
    }
}
