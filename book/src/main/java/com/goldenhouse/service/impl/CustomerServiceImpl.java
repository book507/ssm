package com.goldenhouse.service.impl;

import com.goldenhouse.dao.ICustomerDao;
import com.goldenhouse.entity.Customer;
import com.goldenhouse.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service("customerService")

public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    @Qualifier("customerDao")
    private ICustomerDao customerDao;

    /**
     * 用户注册业务实现
     * @param customer
     * @return
     */
    @Override
    public int registerCustomer(Customer customer) {

        return customerDao.registerCustomer(customer);
    }
}

