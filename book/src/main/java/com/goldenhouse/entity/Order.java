package com.goldenhouse.entity;

/**
 * 订单信息实体类
 */
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

    public Order() {
    }

    public Order(Integer oId , String oNo , Integer cId , Integer bId , Integer oSta) {
        this.oId=oId;
        this.oNo=oNo;
        this.cId=cId;
        this.bId=bId;
        this.oSta=oSta;
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

    @Override
    public String toString() {
        return "Order{" +
                "oId=" + oId +
                ", oNo='" + oNo + '\'' +
                ", cId=" + cId +
                ", bId=" + bId +
                ", oSta=" + oSta +
                '}';
    }
}
