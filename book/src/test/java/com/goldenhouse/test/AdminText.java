package com.goldenhouse.test;

import com.goldenhouse.entity.Admin;
import com.goldenhouse.service.AdminService;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdminText {

    AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void loginTest(){

        AdminService adminService=(AdminService) context.getBean("adminService");
        Admin admin=new Admin();
        admin.setAdminNo("123");
        admin.setAdminPassword("123");
        int rows=adminService.queryAdmin( admin );
        System.out.println("检测结果："+rows);

    }
}
