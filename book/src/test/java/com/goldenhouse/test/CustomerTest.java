package com.goldenhouse.test;

import com.goldenhouse.entity.Customer;
import com.goldenhouse.service.ICustomerService;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTest {

    AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    ICustomerService customerService=(ICustomerService) context.getBean("customerService");
    /**
     * 用户注册功能测试
     */
    @Test
    public void registerCustomerTest(){
        Customer customer=new Customer();
        customer.setcNo("123456");
        customer.setcPwd("123456");
        int rows=customerService.registerCustomer(customer);
        System.out.println("检测结果："+rows);
        context.close();

    }

    /**
     * 用户登录功能测试
     */

    @Test
    public void customerLogInTest(){
        Customer customer=new Customer();
        customer.setcNo("chengfr");
        customer.setcPwd("123456");
        customer=customerService.customerLogIn(customer);
        System.out.println(customer);
        context.close();

    }

    /**
     * 用户找回密码功能测试
     */
    @Test
    public void findCustomerPasswordTest(){
        Customer customer=new Customer();
        customer.setcPwd("2712147");
        customer.setcNo("chengfr97");
        customer.setcSfz("123456");
        context.close();
    }

    /**
     *用户查看个人信息功能测试
     */
    @Test
    public void customerLookInfoTest(){
        Customer customer=new Customer();
        customer=customerService.customerLookInfo(1);
        System.out.println(customer);
        context.close();
        }

    /**
     * 用户更新个人信息测试
     */
    @Test
    public void updateCustomerInfoTest(){
        Customer customer=new Customer();
        customer.setcNo("chengfr97");
        customer.setcSfz("123456");
        customer.setcName("小成");
        customer.setcSex(0);
        customer.setcTel("121123");
        customer.setcAddress("广东中山");
        customer.setcGrade(0);
        customer.setcId(1);
        int rows=customerService.updateCustomerInfo(customer);
        System.out.println("检测："+rows);
    }
    /**
     * 用户修改密码测试
     */
    @Test
    public void updateCustomerPassTest(){
        Customer customer=new Customer();
        customer.setcPwd("123456");
        customer.setcId(1);
        int rows=customerService.updateCustomerInfo(customer);
        System.out.println("检测："+rows);
    }

    }
