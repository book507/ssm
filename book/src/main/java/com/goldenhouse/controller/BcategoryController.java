package com.goldenhouse.controller;

import com.goldenhouse.dao.IBcategoryDao;
import com.goldenhouse.entity.Bcategory;
import com.goldenhouse.service.IBcategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("bcategory")
public class BcategoryController {

    @Autowired
    @Qualifier("bcategoryService")
    private IBcategoryService iBcategoryService ;

    @RequestMapping("addBcategory")
    public String addBcategory(Bcategory bcategory){
        int rows=iBcategoryService.addBcategory( bcategory );
        System.out.println( "rows:"+rows );
        if (rows==1){
            return "/WEB-INF/register_success.jsp";
        }else {
            return "/WEB-INF/register_fail.jsp";
        }
    }

}
