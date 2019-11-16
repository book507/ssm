package com.goldenhouse.dao;

import com.goldenhouse.entity.Customer;

/**
 * 用户数据访问对象
 */
public interface ICustomerDao {

    /**
     * 用户注册
     * @param customer
     * @return
     */
    int registerCustomer(Customer customer);
}
