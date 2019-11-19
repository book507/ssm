package com.goldenhouse.controller;

import com.goldenhouse.entity.Customer;
import com.goldenhouse.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 用户控制层
 */

@Controller
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    @Qualifier("customerService")
    private ICustomerService customerService;

    /**
     * 用户注册
     *
     * @param customer
     * @return
     */
    @RequestMapping("register")
    public String registerCustomer(Customer customer,Model model) {
        int rows = customerService.registerCustomer(customer);
        model.addAttribute( "rows",rows );
        return "customer_result";
    }

    /**
     * 用户登录
     *
     * @param customer
     * @return
     */

    @RequestMapping("login")
    public String customerLogIn(Customer customer, HttpSession session, HttpServletRequest request, Model model) {
        System.out.println( customer.toString() );
        Customer cus = customerService.customerLogIn(customer);
        session = request.getSession();
        System.out.println( cus );
        if (cus != null) {
            session.setAttribute("userId",cus.getcId());
            session.setAttribute("username", cus.getcNo());
            model.addAttribute("customer", cus);
            return "cus_index";
        } else {
            return "customer_login_failure";
        }
    }

    /**
     * 用户找回密码
     *
     * @param customer
     * @return
     */
    @RequestMapping("findPass")
    public String findCustomerPassword(Customer customer) {
        int rows = customerService.findCustomerPassword(customer);
        if (rows > 0) {
            return "reset_success";
        } else if (rows == 0) {
            return "reset_failure";
        } else {
            return "occur_error";
        }
    }

    /**
     * 用户查看个人信息功能
     * @param cId
     * @param model
     * @return
     */
    @RequestMapping("lookInfo")
    public String customerLookInfo(int cId, Model model) {

        Customer customer = customerService.customerLookInfo(cId);
        if (customer != null) {
            model.addAttribute("customer", customer);
            return "customer_info";
        } else {
            return "occur_error";
        }

    }

    /**
     * 加载用户个人信息功能
     * @param cId
     * @param model
     * @return
     */
    @RequestMapping("loadInfo")
    public String customerloadInfo(int cId, Model model) {
        Customer customer = customerService.customerLookInfo(cId);
        if (customer != null) {
            model.addAttribute("customer", customer);
            return "customer_update_info";
        } else {
            return "occur_error";
        }

    }

    /**
     * 用户更新个人信息功能
     * @param customer
     * @return
     */
    @RequestMapping("updateInfo")
    public String updateCustomerInfo(Customer customer){

        int rows=customerService.updateCustomerInfo(customer);
        if (rows > 0) {
            return "customer_update_info_success";
        } else if (rows == 0) {
            return "customer_update_info_failure";
        } else {
            return "occur_error";
        }
    }

    /**
     * 用户注销功能
     * @param session
     * @return
     * @throws IOException
     */
    @RequestMapping("logout")
    public String logout(HttpSession session) throws IOException {
        session.invalidate();
        return "redirect:customer_logout_success";
    }
}
