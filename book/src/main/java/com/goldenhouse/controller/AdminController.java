package com.goldenhouse.controller;

import com.goldenhouse.entity.Admin;
import com.goldenhouse.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin")
public class AdminController {

        @Autowired
        @Qualifier("adminService")
        private IAdminService IAdminService;

        /**
         * 管理员登录
         */
        @RequestMapping("Login")
        public String adminLogin(Admin admin) {
            int rows=IAdminService.queryAdmin( admin );
            if (rows > 0) {
                return "register_success";
            } else {
                return "register_fail";
            }
        }
}

