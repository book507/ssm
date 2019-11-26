package com.goldenhouse.controller;

import com.goldenhouse.entity.Admin;
import com.goldenhouse.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("admin")
public class AdminController {

        @Autowired
        @Qualifier("adminService")
        private IAdminService IAdminService;

        /**
         * 跳转到管理员登录页面
         * @return
         */
        @RequestMapping("/admin_login.action")
        public String adminLogin(){
            return "admin/admin_login";
        }


        /**
         * 管理员登录
         * @return
         */
        @RequestMapping("login")
        public String adminLogin(Admin admin, Model model) {
            Admin admin1=IAdminService.loginAdmin( admin );
            if (admin1 != null) {
                model.addAttribute("admin", admin1.getAdminId());
                return "admin/admin_index";
            } else {
                return "admin/admin_login_failure";
            }
        }

        /**
         * 跳转到管理员后台主页面
         * @return
         */
        @RequestMapping("/admin_index.action")
        public String adminIndex(){
            String forword="admin/admin_index";
            return forword;
        }

    /**
     * 店铺打烊
     * @param
     * @return
     */
    @RequestMapping("closegdh")
    public String closegdh(ServletRequest servletRequest,Model model){
        int rows=-1;
        HttpServletRequest request=(HttpServletRequest) servletRequest;
        //是否是打烊
        Object sign=  request.getServletContext().getAttribute( "OperatingState" );
        if(sign==null){
            //打烊
            servletRequest.getServletContext().setAttribute( "OperatingState",1 );
            rows=1;
            model.addAttribute( "rows",rows );
            return "/admin/admin_closegdh_result";
        }else{
            servletRequest.getServletContext().removeAttribute( "OperatingState" );
            rows=0;
            model.addAttribute( "rows",rows );
            return "/admin/admin_closegdh_result";
        }
    }

}

