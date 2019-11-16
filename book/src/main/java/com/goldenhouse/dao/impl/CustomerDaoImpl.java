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

    @Override
    public int registerCustomer(Customer customer) {

        return customerMapper.registerCustomer(customer);
    }
}
