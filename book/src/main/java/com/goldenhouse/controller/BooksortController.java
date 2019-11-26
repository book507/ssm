package com.goldenhouse.controller;

import com.goldenhouse.entity.Booksort;
import com.goldenhouse.entity.Book;
import com.goldenhouse.service.IBooksortService;
import com.goldenhouse.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("booksort")
public class BooksortController {

    @Autowired
    @Qualifier("booksortService")
    private IBooksortService iBooksortService;

    @Autowired
    @Qualifier("bookService")
    private IBookService iBookService ;

    /**
     * 管理员添加书籍分类
     * @param booksort
     * @return
     */
    @RequestMapping("addBooksort")
    public String addBooksort(Booksort booksort , Model model){
        int rows=iBooksortService.addBooksort( booksort );
        model.addAttribute( "rows",rows );
        return "admin/booksort/booksort_add_result";
    }

    /**
     * 管理员查询所有书籍分类
     * @return
     */
    @RequestMapping("queryBooksort")
    public String queryBooksort(Model model, HttpServletRequest request){
        List<Booksort> booksortList= iBooksortService.queryBooksort();
        model.addAttribute("bookfl", booksortList );
        request.setAttribute("bookfl", booksortList );
        String forword="admin/booksort/booksort";
        return forword;
    }

    /**
     * 管理员根据书籍分类ID删除书籍分类信息
     * @param bs_id
     * @return
     */
    @RequestMapping("deleteBooksort")
    public String deleteBooksort(int bs_id,Model model){
        int rows=-1;
        List<Book> bookList=iBookService.queryBookOfBsId( bs_id );
        System.out.println( bookList );
        if(bookList.isEmpty()){
            rows=iBooksortService.deleteBooksort( bs_id );
            model.addAttribute("rows", rows);
            return "admin/booksort/booksort_delete_result";
        }
        else if(bookList!=null){
            rows=0;
            model.addAttribute("rows", rows);
            return "admin/booksort/booksort_delete_result";
        }else{
            model.addAttribute( "rows",rows );
            return "admin/booksort/booksort_delete_result";
        }
    }

    /**
     * 管理员跳转到书籍分类修改页面
     * @return
     */
    @RequestMapping("/booksort_update.action")
    public String adminBooksortUpdate(int bs_id,Model model ){
        Booksort booksort=iBooksortService.queryBooksortById( bs_id );
        model.addAttribute("booksort", booksort );
        String forword="admin/booksort/booksort_update";
        return forword;
    }

    /**
     * 管理员根据书籍分类ID修改书籍分类信息
     * @param booksort
     * @return
     */
    @RequestMapping("booksort_update")
    public String booksortUpdate(Booksort booksort , Model model){
        int rows=iBooksortService.updateBooksort( booksort );
        model.addAttribute( "rows",rows );
        return "admin/booksort/booksort_update_result";
    }

    /**
     * 管理员跳转到书籍分类页面
     * @return
     */
    @RequestMapping("/booksort.action")
    public String adminBooksort(){
        String forword="admin/booksort/booksort";
        return forword;
    }

    /**
     * 管理员跳转到书籍分类增加页面
     * @return
     */
    @RequestMapping("/booksort_add.action")
    public String adminBooksortAdd(){
        String forword="admin/booksort/booksort_add";
        return forword;
    }

}
