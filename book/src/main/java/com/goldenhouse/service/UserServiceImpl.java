package com.goldenhouse.service;

import com.goldenhouse.dao.UserDao;
import com.goldenhouse.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    @Override
    public int registerUser(User user) {
        return userDao.registerUser(user);
    }
}
