package com.goldenhouse.test;

import com.goldenhouse.entity.User;
import com.goldenhouse.service.UserService;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void registerUserTest(){

        UserService userService=(UserService) context.getBean("userService");
        User user=new User();
        user.setUsername("wing");
        user.setPassword("123456");
        user.setRepassword("123456");
        int rows=userService.registerUser(user);
        System.out.println("检测结果："+rows);

    }
}
