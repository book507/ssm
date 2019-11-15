package com.goldenhouse.dao;

import com.goldenhouse.entity.User;
import com.goldenhouse.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository("userDao")

public class UserDaoImpl implements UserDao {

    @Autowired
    @Qualifier("userMapper")
    private UserMapper userMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED ,rollbackFor = Exception.class)
    public int registerUser(User user) {
        return userMapper.registerUser(user);
    }
}
