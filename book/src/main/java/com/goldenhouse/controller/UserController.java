package com.goldenhouse.controller;

import com.goldenhouse.entity.User;
import com.goldenhouse.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    @Qualifier("userService")
    private UserService userService;

    /**
     * 用户注册
     * @param user
     * @return
     */
    @RequestMapping("register")
    public String registerUser(User user){
        int rows=userService.registerUser(user);
        if (rows>0){
        return "register_success";
        }else {
            return "register_fail";
        }
    }

}
