package com.goldenhouse.controller;

import com.goldenhouse.entity.Customer;
import com.goldenhouse.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
    public String registerCustomer(Customer customer) {
        int rows = customerService.registerCustomer(customer);
        if (rows > 0) {
            return "/WEB-INF/customer_register_success.jsp";
        } else {
            return "/WEB-INF/customer_register_failure.jsp";
        }
    }

    /**
     * 用户登录
     *
     * @param customer
     * @return
     */

    @RequestMapping("login")
    public String customerLogIn(Customer customer, HttpSession session, HttpServletRequest request, Model model) {

        Customer cus = customerService.customerLogIn(customer);
        session = request.getSession();
        if (cus != null) {
            session.setAttribute("user", cus);
            model.addAttribute("customer", cus);
            return "/WEB-INF/customer_main.jsp";
        } else {
            return "/WEB-INF/customer_login_failure.jsp";
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
            return "/WEB-INF/reset_success.jsp";
        } else if (rows == 0) {
            return "/WEB-INF/reset_failure.jsp";
        } else {
            return "/WEB-INF/occur_error.jsp";
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
            return "/WEB-INF/customer_info.jsp";
        } else {
            return "/WEB-INF/occur_error.jsp";
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
        return "redirect:/customer_logout_success.jsp";
    }
}
