package com.goldenhouse.entity;

public class FavoriteMap {
      private String bookName;

      private String bookPrice;

      private String bookWhat;

      private String bsName;

    public FavoriteMap() {
    }

    public FavoriteMap(String bookName, String bookPrice, String bookWhat, String bsName) {
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.bookWhat = bookWhat;
        this.bsName = bsName;
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

    public String getBsName() {
        return bsName;
    }

    public void setBsName(String bsName) {
        this.bsName = bsName;
    }

    @Override
    public String toString() {
        return "FavoriteMap{" +
                "bookName='" + bookName + '\'' +
                ", bookPrice='" + bookPrice + '\'' +
                ", bookWhat='" + bookWhat + '\'' +
                ", bsName='" + bsName + '\'' +
                '}';
    }
}
