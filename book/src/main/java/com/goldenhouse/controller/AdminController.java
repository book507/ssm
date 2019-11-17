package com.goldenhouse.controller;

import com.goldenhouse.entity.Admin;
import com.goldenhouse.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
        @ResponseBody
        public String adminLogin(Admin admin, Model model) {
            Admin admin1=IAdminService.loginAdmin( admin );
            if (admin1 != null) {
                model.addAttribute("admin", admin1);
                return "register_success";
            } else {
                return "register_fail";
            }
        }
}

