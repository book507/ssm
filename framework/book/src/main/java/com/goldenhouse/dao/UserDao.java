package com.goldenhouse.dao;

import com.goldenhouse.entity.User;

public interface UserDao {

    /**
     * 用户注册
     * @param user
     * @return
     */
    int registerUser(User user);
}
