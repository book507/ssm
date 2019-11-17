package com.goldenhouse.mapper;

import com.goldenhouse.entity.Customer;

public interface CustomerMapper {
    /**
     * 用户注册的Mapper接口
     * @param customer
     * @return
     */
    int registerCustomer(Customer customer);

    /**
     * 用户登录的Mapper接口
     * @param customer
     * @return
     */
    Customer customerLogIn(Customer customer);

    /**
     * 用户找回密码的Mapper接口
     * @param customer
     * @return
     */
    int findCustomerPassword(Customer customer);

    /**
     * 用户通过cId查看个人信息接口
     * @param cId 用户Id
     * @return
     */
    Customer customerLookInfo(int cId);


    /**
     * 填写用户信息的Mapper接口
     * @param customer
     * @return
     */
    //int fillInCustomerInfo(Customer customer);
}
