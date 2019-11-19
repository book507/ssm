package com.goldenhouse.controller;

import com.goldenhouse.entity.Bcategory;
import com.goldenhouse.service.IBcategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
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
    public String addBcategory(Bcategory bcategory,Model model){
        int rows=iBcategoryService.addBcategory( bcategory );
        model.addAttribute( "rows",rows );
        return "bcategory_add_result";
    }

    /**
     * 查询所有书籍分类
     * @return
     */
    @RequestMapping("queryBcategory")
    public String queryBcategory(Model model, HttpServletRequest request){
        List<Bcategory> bcategoryList= iBcategoryService.queryBcategory();
        String forword="booksort";

        model.addAttribute("bookfl", bcategoryList);
        request.setAttribute("bookfl", bcategoryList);
        return forword;
    }

    /**
     * 根据书籍分类ID删除书籍分类信息
     * @param bs_id
     * @return
     */
    @RequestMapping("deleteBcategory")
    public String deleteBcategory(int bs_id,Model model){

        try {
             iBcategoryService.deleteBcategory( bs_id );

        }catch (Exception e){
            List<Bcategory> bcategoryList= iBcategoryService.queryBcategory();

            model.addAttribute("bookfl", bcategoryList);
            model.addAttribute( "key" ,1);
            return "booksort";
        }
            return "redirect:queryBcategory";
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
