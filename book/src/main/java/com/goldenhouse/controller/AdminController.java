package com.goldenhouse.controller;

import com.goldenhouse.entity.Admin;
import com.goldenhouse.entity.Bcategory;
import com.goldenhouse.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
        public String adminLogin(Admin admin, Model model) {
            Admin admin1=IAdminService.loginAdmin( admin );
            if (admin1 != null) {
                model.addAttribute("admin", admin1.getAdminId());

                return "admin_backstage";
            } else {
                return "customer_login_failure";
            }
        }

    /**
     * 跳转到书籍分类页面
     * @return
     */
    @RequestMapping("/bcategory.action")
    public String bcategoryAction(){
        String forword="booksort";
        return forword;
    }

    /**
     * 跳转到管理员后台主页面
     * @return
     */
    @RequestMapping("/admin_backstage.action")
    public String adminBackstage(){
        String forword="admin_backstage";
        return forword;
    }

    /**
     * 跳转到书籍分类增加页面
     * @return
     */
    @RequestMapping("/bcategory_add.action")
    public String adminBcategoryAdd(){
        String forword="bcategory_add";
        return forword;
    }

    /**
     * 跳转到书籍分类修改页面
     * @return
     */
    @RequestMapping("/bcategory_update.action")
    public String adminBcategoryUpdate(int bs_id,Model model ){
        Bcategory bcategory;
       // model.addAttribute("bcategory",bcategory);
        String forword="changbooksort";
        return forword;
    }


}

