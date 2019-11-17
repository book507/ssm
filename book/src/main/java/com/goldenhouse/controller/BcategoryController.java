package com.goldenhouse.controller;

import com.goldenhouse.entity.Bcategory;
import com.goldenhouse.service.IBcategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("bcategory")
public class BcategoryController {

    @Autowired
    @Qualifier("bcategoryService")
    private IBcategoryService iBcategoryService ;

    /**
     * 添加书籍分类
     * @param bcategory
     * @return
     */
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

    /**
     * 查询所有书籍分类
     * @return
     */
    @RequestMapping("queryBcategory")
    public void queryBcategory(){
        List<Bcategory> bcategoryList= iBcategoryService.queryBcategory();
        for (Bcategory bcategory:bcategoryList){
            System.out.println(bcategory);
        }
    }

    /**
     * 根据书籍分类ID删除书籍分类信息
     * @param bs_id
     * @return
     */
    @RequestMapping("deleteBcategory")
    public String deleteBcategory(int bs_id){
        int rows=iBcategoryService.deleteBcategory( bs_id );
        if (rows==1){
            return "/WEB-INF/register_success.jsp";
        }else {
            return "/WEB-INF/register_fail.jsp";
        }
    }

    /**
     * 根据书籍分类ID修改书籍分类信息
     * @param bcategory
     * @return
     */
    public int updateBcategory(Bcategory bcategory){
        int rows=iBcategoryService.updateBcategory( bcategory );
        return rows;
    }

}
