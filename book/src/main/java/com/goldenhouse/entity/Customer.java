package com.goldenhouse.entity;

/**
 *用户实体类
 */

import org.apache.ibatis.type.Alias;

@Alias("customer")
public class Customer {
    private Integer cId;             //用户名ID
    private String cNo;             //用户名
    private String cPwd;           //密码
    private String cSfz;          //身份证号
    private String cName;        //姓名
    private Integer cSex;       //性别  0:男  1:女
    private String cTel;       //电话号码
    private String cAddress;  //收货地址
    private Integer cGrade;  //积分

    public Customer() {
    }

    public Customer(Integer cId, String cNo, String cPwd, String cSfz, String cName, Integer cSex, String cTel, String cAddress, Integer cGrade) {
        this.cId=cId;
        this.cNo = cNo;
        this.cPwd = cPwd;
        this.cSfz = cSfz;
        this.cName = cName;
        this.cSex = cSex;
        this.cTel = cTel;
        this.cAddress = cAddress;
        this.cGrade = cGrade;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcNo() {
        return cNo;
    }

    public void setcNo(String cNo) {
        this.cNo = cNo;
    }

    public String getcPwd() {
        return cPwd;
    }

    public void setcPwd(String cPwd) {
        this.cPwd = cPwd;
    }

    public String getcSfz() {
        return cSfz;
    }

    public void setcSfz(String cSfz) {
        this.cSfz = cSfz;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Integer getcSex() {
        return cSex;
    }

    public void setcSex(Integer cSex) {
        this.cSex = cSex;
    }

    public String getcTel() {
        return cTel;
    }

    public void setcTel(String cTel) {
        this.cTel = cTel;
    }

    public String getcAddress() {
        return cAddress;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    public Integer getcGrade() {
        return cGrade;
    }

    public void setcGrade(Integer cGrade) {
        this.cGrade = cGrade;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cId=" + cId +
                ", cNo='" + cNo + '\'' +
                ", cPwd='" + cPwd + '\'' +
                ", cSfz='" + cSfz + '\'' +
                ", cName='" + cName + '\'' +
                ", cSex=" + cSex +
                ", cTel='" + cTel + '\'' +
                ", cAddress='" + cAddress + '\'' +
                ", cGrade=" + cGrade +
                '}';
    }
}
