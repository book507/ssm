package com.goldenhouse.service;

import com.goldenhouse.entity.User;

public interface UserService {
    /**
     * 用户注册业务
     * @param user
     * @return
     */
    int registerUser(User user);
}
