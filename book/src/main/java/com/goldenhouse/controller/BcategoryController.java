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
            model.addAttribute( "key" ,-10);
        }catch (Exception e){
            List<Bcategory> bcategoryList= iBcategoryService.queryBcategory();

           model.addAttribute("bookfl", bcategoryList);
            model.addAttribute( "key" ,10);
            return "booksort";
        }
            return "redirect:queryBcategory";
    }

    /**
     * 跳转到书籍分类修改页面
     * @return
     */
    @RequestMapping("/bcategory_update.action")
    public String adminBcategoryUpdate(int bs_id,Model model ){
        Bcategory bcategory=iBcategoryService.queryBcategoryById( bs_id );
        model.addAttribute("bcategory",bcategory);
        String forword="bcategory_update";
        return forword;
    }

    /**
     * 根据书籍分类ID修改书籍分类信息
     * @param bcategory
     * @return
     */
    @RequestMapping("bcategory_update")
    public String bcategoryUpdate(Bcategory bcategory,Model model){
        int rows=iBcategoryService.updateBcategory( bcategory );
        System.out.println( "**************************************"+rows );
        model.addAttribute( "rows",rows );
        return "bcategory_update_result";
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
     * 跳转到书籍分类增加页面
     * @return
     */
    @RequestMapping("/bcategory_add.action")
    public String adminBcategoryAdd(){
        String forword="bcategory_add";
        return forword;
    }

}
