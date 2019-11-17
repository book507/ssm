package com.goldenhouse.entity;

import org.apache.ibatis.type.Alias;

//书籍信息实体类
@Alias( "book" )
public class Book {
    //书籍ID
    private  Integer BookId;

    //书籍名称
    private String BookName;

    //书籍价格
    private String BookPrice;

    //书籍介绍
    private String BookWhat;

    //书籍分类ID
    private  Integer BsId;

    public Book() {
    }

    public Book(Integer bookId , String bookName , String bookPrice , String bookWhat , Integer bsId) {
        BookId=bookId;
        BookName=bookName;
        BookPrice=bookPrice;
        BookWhat=bookWhat;
        BsId=bsId;
    }

    public Integer getBookId() {
        return BookId;
    }

    public void setBookId(Integer bookId) {
        BookId=bookId;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName=bookName;
    }

    public String getBookPrice() {
        return BookPrice;
    }

    public void setBookPrice(String bookPrice) {
        BookPrice=bookPrice;
    }

    public String getBookWhat() {
        return BookWhat;
    }

    public void setBookWhat(String bookWhat) {
        BookWhat=bookWhat;
    }

    public Integer getBsId() {
        return BsId;
    }

    public void setBsId(Integer bsId) {
        BsId=bsId;
    }

    @Override
    public String toString() {
        return "Book{" +
                "BookId=" + BookId +
                ", BookName='" + BookName + '\'' +
                ", BookPrice='" + BookPrice + '\'' +
                ", BookWhat='" + BookWhat + '\'' +
                ", BsId=" + BsId +
                '}';
    }
}
