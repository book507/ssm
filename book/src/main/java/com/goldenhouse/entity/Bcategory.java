package com.goldenhouse.entity;
//书籍分类实体类

import org.apache.ibatis.type.Alias;

@Alias( "bcategory" )
public class Bcategory {
    //书籍分类ID
    private Integer bsId;

    //书籍分类名
    private String bsName;

    //书籍分类说明
    private  String bsWhat;

    public Bcategory() {
    }

    public Bcategory(Integer bsId , String bsName , String bsWhat) {
        this.bsId=bsId;
        this.bsName=bsName;
        this.bsWhat=bsWhat;
    }

    public Integer getBsId() {
        return bsId;
    }

    public void setBsId(Integer bsId) {
        this.bsId=bsId;
    }

    public String getBsName() {
        return bsName;
    }

    public void setBsName(String bsName) {
        this.bsName=bsName;
    }

    public String getBsWhat() {
        return bsWhat;
    }

    public void setBsWhat(String bsWhat) {
        this.bsWhat=bsWhat;
    }

    @Override
    public String toString() {
        return "Bcategory{" +
                "bsId=" + bsId +
                ", bsName='" + bsName + '\'' +
                ", bsWhat='" + bsWhat + '\'' +
                '}';
    }
}
