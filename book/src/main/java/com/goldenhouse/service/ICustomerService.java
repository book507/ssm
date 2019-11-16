package com.goldenhouse.service;

import com.goldenhouse.entity.Customer;


public interface ICustomerService {
    /**
     * 用户注册业务
     * @param customer
     * @return
     */
    int registerCustomer(Customer customer);
}
