package com.goldenhouse.mapper;

import com.goldenhouse.entity.Customer;

public interface CustomerMapper {
    /**
     * 用户注册的Mapper接口
     * @param customer
     * @return
     */
    int registerCustomer(Customer customer);
}
