package com.goldenhouse.service.impl;

import com.goldenhouse.dao.ICustomerDao;
import com.goldenhouse.entity.Customer;
import com.goldenhouse.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;


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

    /**
     * 用户登录业务实现
     * @param customer
     * @return
     */
    @Override
    public Customer customerLogIn(Customer customer) {
        return customerDao.customerLogIn(customer);
    }

    /**
     * 用户找回密码业务实现
     * @param customer
     * @return
     */
    @Override
    public int findCustomerPassword(Customer customer) {
        return customerDao.findCustomerPassword(customer);
    }

    /**
     * 用户通过cId查看个人信息的业务实现
     * @param cId 用户Id
     * @return
     */
    @Override
    public Customer customerLookInfo(int cId) {
        return customerDao.customerLookInfo(cId);
    }

    /**
     * 用户更新个人信息业务的实现
     * @param customer
     * @return
     */
    @Override
    public int updateCustomerInfo(Customer customer) {
        return customerDao.updateCustomerInfo(customer);
    }

    /**
     * 用户修改个人密码功能的实现
     * @param customer
     * @return
     */
    @Override
    public int updateCustomerPass(Customer customer) {
        return customerDao.updateCustomerPass(customer);
    }

    /**
     * 根据用户名或身份证号查询是否存在该用户
     * @param customer
     * @return
     */
    @Override
    public List<Customer> queryCustomerByCno(Customer customer) {
        return customerDao.queryCustomerByCno( customer );
    }

    /**
     * 根据用户id和密码，查询是否存在该用户
     * @param
     * @return
     */
    @Override
    public Customer queryCusByCid(Customer customer) {
        return customerDao.queryCusByCid( customer );
    }


}

