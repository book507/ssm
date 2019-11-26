package com.goldenhouse.entity;

import org.apache.ibatis.type.Alias;

/**
 * 订单信息实体类
 */
@Alias("order")
public class Order {

    //订单ID
    private  Integer oId;
    //订单编号
    private String oNo;
    //用户ID
    private Integer cId;
    //书籍ID
    private Integer bId;
    //订单状态
    private Integer oSta;
    //关联用户对象
    private Customer customer;
    //关联书本对象
    private Book book;

    public Order() {
    }

    public Order(Integer oId , String oNo , Integer cId , Integer bId , Integer oSta , Customer customer , Book book) {
        this.oId=oId;
        this.oNo=oNo;
        this.cId=cId;
        this.bId=bId;
        this.oSta=oSta;
        this.customer=customer;
        this.book=book;
    }

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId=oId;
    }

    public String getoNo() {
        return oNo;
    }

    public void setoNo(String oNo) {
        this.oNo=oNo;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId=cId;
    }

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId=bId;
    }

    public Integer getoSta() {
        return oSta;
    }

    public void setoSta(Integer oSta) {
        this.oSta=oSta;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer=customer;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book=book;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oId=" + oId +
                ", oNo='" + oNo + '\'' +
                ", cId=" + cId +
                ", bId=" + bId +
                ", oSta=" + oSta +
                ", customer=" + customer +
                ", book=" + book +
                '}';
    }
}
