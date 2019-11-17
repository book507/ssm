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

    /**
     * 用户登录
     * @param customer
     * @return
     */
    Customer customerLogIn(Customer customer);

    /**
     * 用户通过cId查看个人信息
     * @param cId 用户Id
     * @return
     */
    Customer customerLookInfo(int cId);

    /**
     * 用户找回密码
     * @param customer
     * @return
     */
    int findCustomerPassword(Customer customer);


    /**
     * 填写用户信息
     * @param customer
     * @return
     */
    //int fillInCustomerInfo(Customer customer);

}
