package com.goldenhouse.entity;

import org.apache.ibatis.type.Alias;

@Alias("user")
public class User {
    private Integer userId;
    private String username;
    private String password;
    private String repassword;

    public User() {
    }

    public User(Integer userId, String username, String password, String repassword) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.repassword = repassword;
    }

    public User(Integer userId, String username, String password) {
        this.userId = userId;
        this.username = username;
        this.password = password;
    }


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", repassword='" + repassword + '\'' +
                '}';
    }
}
