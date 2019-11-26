package com.goldenhouse.entity;

import org.apache.ibatis.type.Alias;

/**
 * 管理员账号实体类
 */
@Alias("admin")
public class Admin {

    //管理员ID
    private Integer adminId;
    //管理员账号名
    private String adminNo;
    //管理员账号密码
    private String adminPassword;

    public Admin() {
    }

    public Admin(Integer adminId , String adminNo , String adminPassword) {
        this.adminId=adminId;
        this.adminNo=adminNo;
        this.adminPassword=adminPassword;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId=adminId;
    }

    public String getAdminNo() {
        return adminNo;
    }

    public void setAdminNo(String adminNo) {
        this.adminNo=adminNo;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword=adminPassword;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +
                ", adminNo='" + adminNo + '\'' +
                ", adminPassword='" + adminPassword + '\'' +
                '}';
    }
}
