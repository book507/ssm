package com.goldenhouse.controller;

import com.goldenhouse.entity.Booksort;
import com.goldenhouse.entity.Customer;
import com.goldenhouse.service.IBooksortService;
import com.goldenhouse.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    @Qualifier("customerService")
    private ICustomerService customerService;

    @Autowired
    @Qualifier("booksortService")
    private IBooksortService iBooksortService;

    /**
     * 用户跳转到忘记密码页面
     * @return
     */
    @RequestMapping("/customer_findpwd.action")
    public String customerFindpwd(){
        String forword="customer/account/customer_findpwd";
        return forword;
    }

    /**
     * 用户跳转到注册页面
     * @return
     */
    @RequestMapping("/customer_register.action")
    public String customerRegister(){
        String forword="customer/account/customer_register";
        return forword;
    }

    /**
     * 用户跳转到修改密码页面
     * @return
     */
    @RequestMapping("/customer_updatepwd.action")
    public String customerChangepwd(int cId,Model model){
        model.addAttribute( "cId",cId );
        String forword="customer/account/customer_updatepwd";
        return forword;
    }

    /**
     * 用户跳转到主页面
     * @return
     */
    @RequestMapping("/cus_index.action")
    public String cusIndex(Model model){
        List<Booksort> booksortList=iBooksortService.queryBooksort();//加载书籍分类
        model.addAttribute( "booksortList", booksortList);
        String forword="customer/cus_index";
        return forword;
    }

    /**
     * 用户注册
     * @param customer
     * @return
     */
    @RequestMapping("register")
    public String registerCustomer(Customer customer,Model model) {
        int rows=-1;
        List<Customer> customerList= customerService.queryCustomerByCno( customer );
        if(customerList.isEmpty()){
            rows = customerService.registerCustomer(customer);
            model.addAttribute( "rows",rows );
            return "customer/account/customer_register_result";
        }else if(customerList!=null){
            rows=0;
            model.addAttribute( "rows",rows );
            return "customer/account/customer_register_result";
        }else{
            model.addAttribute( "rows",rows );
            return "customer/account/customer_register_result";
        }

    }

    /**
     * 用户登录
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
            session.setAttribute("password",cus.getcPwd());
            model.addAttribute("customer", cus);

            List<Booksort> booksortList=iBooksortService.queryBooksort();//加载书籍分类
            model.addAttribute( "booksortList", booksortList);

            return "customer/cus_index";
        } else {
            return "customer/account/customer_login_failure";
        }
    }

    /**
     * 用户找回密码
     * @param customer
     * @return
     */
    @RequestMapping("findPass")
    public String findCustomerPassword(Customer customer ,Model model) {
        int rows = customerService.findCustomerPassword(customer);
        model.addAttribute( "rows",rows );
        return "customer/account/customer_findpwd_result";
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
            return "customer/info/cus_info";
        } else {
            return "customer/occur_error";
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
            return "customer/info/cus_editinfo";
        } else {
            return "customer/occur_error";
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
            return "customer/info/customer_update_info_success";
        } else if (rows == 0) {
            return "customer/info/customer_update_info_failure";
        } else {
            return "customer/occur_error";
        }
    }

    /**
     * 用户修改个人密码功能
     * @param customer
     * @return
     */
    @RequestMapping("updatePass")
    public String updateCustomerPass(Customer customer,String cNPwd,Model model){
        int rows=-1;
        System.out.println( "************************************1" );
        System.out.println( customer );
        System.out.println( cNPwd );
        System.out.println( "************************************1" );
        Customer cus=customerService.queryCusByCid(customer);
        System.out.println( cus );
        if( cus!=null){
            customer.setcPwd( cNPwd );
            System.out.println( "************************************2" );
            System.out.println( customer );
            System.out.println( "************************************2" );
            rows=customerService.updateCustomerPass(customer);
            model.addAttribute( "rows",rows );
            return "customer/account/customer_updatepwd_result";
        }else if(cus==null){
            rows=0;
            model.addAttribute( "rows",rows );
            return "customer/account/customer_updatepwd_result";
        }else {
            model.addAttribute( "rows",rows );
            return "customer/account/customer_updatepwd_result";
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
