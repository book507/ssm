package com.goldenhouse.test;

import com.goldenhouse.entity.Customer;
import com.goldenhouse.service.ICustomerService;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTest {

    AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void registerCustomerTest(){

        ICustomerService customerService=(ICustomerService) context.getBean("customerService");
        Customer customer=new Customer();
        customer.setcNo("123456");
        customer.setcPwd("123456");
        int rows=customerService.registerCustomer(customer);
        System.out.println("检测结果："+rows);

    }
}
