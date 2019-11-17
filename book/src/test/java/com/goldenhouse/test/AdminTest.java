package com.goldenhouse.test;

import com.goldenhouse.entity.Admin;
import com.goldenhouse.service.IAdminService;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdminTest {

    AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void loginTest(){
        IAdminService IAdminService=(IAdminService) context.getBean("adminService");
        Admin admin=new Admin();
        admin.setAdminNo("123");
        admin.setAdminPassword("123");
        Admin admin1=IAdminService.loginAdmin( admin );
        System.out.println("检测结果："+admin1);

    }
}
