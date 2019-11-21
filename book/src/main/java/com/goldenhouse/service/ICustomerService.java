package com.goldenhouse.service;

import com.goldenhouse.entity.Customer;

/**
 * 业务层接口
 */

public interface ICustomerService {
    /**
     * 用户注册业务
     * @param customer
     * @return
     */
    int registerCustomer(Customer customer);

    /**
     * 用户登录业务
     * @param customer
     * @return
     */
    Customer customerLogIn(Customer customer);

    /**
     * 用户找回密码的业务
     * @param customer
     * @return
     */
    int findCustomerPassword(Customer customer);

    /**
     * 用户通过cId查看个人信息业务
     * @param cId 用户Id
     * @return
     */
    Customer customerLookInfo(int cId);

    /**
     * 用户更新个人信息业务
     * @param customer
     * @return
     */
    int updateCustomerInfo(Customer customer);

    /**
     * 用户更新个人密码业务
     * @param customer
     * @return
     */
    int updateCustomerPass(Customer customer);
}
