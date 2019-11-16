package com.goldenhouse.controller;

import com.goldenhouse.entity.Customer;
import com.goldenhouse.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
     * @param customer
     * @return
     */
    @RequestMapping("register")
    public String registerCustomer(Customer customer){
        int rows=customerService.registerCustomer(customer);
        if (rows>0){
        return "register_success";
        }else {
            return "register_fail";
        }
    }

}
