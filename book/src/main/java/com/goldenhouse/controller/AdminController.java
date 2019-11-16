package com.goldenhouse.controller;

import com.goldenhouse.entity.Admin;
import com.goldenhouse.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("admin")
public class AdminController {

        @Autowired
        @Qualifier("adminService")
        private AdminService adminService;

        /**
         * 管理员登录
         */
        @RequestMapping("Login")
        public String adminLogin(Admin admin) {
            int rows=adminService.queryAdmin( admin );
            if (rows > 0) {
                return "register_success";
            } else {
                return "register_fail";
            }
        }
}

