package com.goldenhouse.entity;

import org.apache.ibatis.type.Alias;

/**
 * 积分商品类
 */
@Alias("shop")
public class Shop {

    //商品id
    private Integer sId;
    //商品名称
    private String sName;
    //商品价格
    private String sPrice;
    //商品介绍
    private String sWhat;

    public Shop() {
    }

    public Shop(Integer sId, String sName, String sPrice, String sWhat) {
        this.sId = sId;
        this.sName = sName;
        this.sPrice = sPrice;
        this.sWhat = sWhat;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsPrice() {
        return sPrice;
    }

    public void setsPrice(String sPrice) {
        this.sPrice = sPrice;
    }

    public String getsWhat() {
        return sWhat;
    }

    public void setsWhat(String sWhat) {
        this.sWhat = sWhat;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "sId=" + sId +
                ", sName='" + sName + '\'' +
                ", sPrice='" + sPrice + '\'' +
                ", sWhat='" + sWhat + '\'' +
                '}';
    }
}
