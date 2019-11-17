package com.goldenhouse.dao.impl;

import com.goldenhouse.dao.ICustomerDao;
import com.goldenhouse.entity.Customer;
import com.goldenhouse.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * 用户数据访问对象实现
 */
@Repository("customerDao")

public class CustomerDaoImpl implements ICustomerDao {

    @Autowired
    @Qualifier("customerMapper")
    private CustomerMapper customerMapper;

    //用户注册
    @Override
    public int registerCustomer(Customer customer) {

        return customerMapper.registerCustomer(customer);
    }
    //用户登录
    @Override
    public Customer customerLogIn(Customer customer) {

        return customerMapper.customerLogIn(customer);
    }

    //用户找回密码
    @Override
    public int findCustomerPassword(Customer customer) {

        return customerMapper.findCustomerPassword(customer);
    }

    //用户查看个人信息
    @Override
    public Customer customerLookInfo(int cId) {

        return customerMapper.customerLookInfo(cId);
    }
}
