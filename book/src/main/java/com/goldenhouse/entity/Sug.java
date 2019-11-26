package com.goldenhouse.entity;

import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * 意见 实体类
 */
@Alias("sug")
public class Sug {

    //意见ID
    private Integer sugId;

    //用户ID
    private Integer cId;

    //意见内容
    private String sugWhat;

    //意见时间
    private Date sugTime;

    public Sug() {
    }

    public Sug(Integer sugId , Integer cId , String sugWhat , Date sugTime) {
        this.sugId=sugId;
        this.cId=cId;
        this.sugWhat=sugWhat;
        this.sugTime=sugTime;
    }

    public Integer getSugId() {
        return sugId;
    }

    public void setSugId(Integer sugId) {
        this.sugId=sugId;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId=cId;
    }

    public String getSugWhat() {
        return sugWhat;
    }

    public void setSugWhat(String sugWhat) {
        this.sugWhat=sugWhat;
    }

    public Date getSugTime() {
        return sugTime;
    }

    public void setSugTime(Date sugTime) {
        this.sugTime=sugTime;
    }

    @Override
    public String toString() {
        return "Sug{" +
                "sugId=" + sugId +
                ", cId=" + cId +
                ", sugWhat='" + sugWhat + '\'' +
                ", sugTime=" + sugTime +
                '}';
    }
}
