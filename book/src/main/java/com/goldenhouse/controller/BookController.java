package com.goldenhouse.controller;

import com.goldenhouse.entity.Booksort;
import com.goldenhouse.entity.Book;
import com.goldenhouse.entity.Order;
import com.goldenhouse.service.IBooksortService;
import com.goldenhouse.service.IBookService;
import com.goldenhouse.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("book")
public class BookController {
    @Autowired
    @Qualifier("bookService")
    private IBookService iBookService ;

    @Autowired
    @Qualifier("booksortService")
    private IBooksortService iBooksortService;

    @Autowired
    @Qualifier("orderService")
    private IOrderService iOrderService ;

    /**
     * 管理员跳转到书籍管理页面
     * @return
     */
    @RequestMapping("/admin_book.action")
    public String adminBook(){
        String forword="admin/book/book";
        return forword;
    }

    /**
     * 管理员查询所有书籍
     * @return
     */
    @RequestMapping("queryBook")
    public String queryBook(Model model, HttpServletRequest request){
        String forword="admin/book/book";
        List<Book> bookList=iBookService .queryBook();
        model.addAttribute("bookList", bookList);
        request.setAttribute("bookList", bookList);
        return forword;
    }

    /**
     * 管理员查询所有书籍关联书籍分类
     * @return
     */
    @RequestMapping("queryBookOfAdmin")
    public String queryBookOfAdmin(Model model){
        String forword="admin/book/book";
        List<Map> mapList=iBookService.queryBookOfAdmin();
        model.addAttribute("mapList", mapList);
        return forword;
    }

    /**
     * 管理员根据书籍ID删除书籍信息
     * @param bookId
     * @return
     */
    @RequestMapping("deleteBook")
    public String deleteBook(int bookId,Model model){
        int rows=-1;
        List<Order> orderList=iOrderService.queryOrderBybookId( bookId );
        if(orderList.isEmpty()){
            rows=iBookService.deleteBook( bookId );
            model.addAttribute("rows", rows);
            return "admin/book/book_delete_result";
        }else if(orderList!=null){
            rows=0;
            model.addAttribute( "rows",rows );
            return "admin/book/book_delete_result";
        }else{
            model.addAttribute( "rows",rows );
            return "admin/book/book_delete_result";
        }
    }

    /**
     * 管理员添加书籍分类
     * @param book
     * @return
     */
    @RequestMapping("addBook")
    public String addBook(Book book,Model model){
        int rows=iBookService.addBook( book );
        model.addAttribute( "rows",rows );
        return "admin/book/book_add_result";
    }

    /**
     * 管理员跳转到书籍信息增加页面
     * @return
     */
    @RequestMapping("/book_add.action")
    public String adminBookAdd(Model model){
        List<Booksort> booksortList=iBooksortService.queryBooksort();
        System.out.println( booksortList );
        model.addAttribute( "booksortList", booksortList );//加载书籍分类选项
        String forword="admin/book/book_add";
        return forword;
    }

    /**
     * 管理员跳转到书籍信息修改页面
     * @return
     */
    @RequestMapping("/book_update.action")
    public String adminBookUpdate(int bookId,Model model ){
        Book book=iBookService.queryBookById( bookId );
        model.addAttribute("book",book);
        List<Booksort> booksortList=iBooksortService.queryBooksort();
        System.out.println( booksortList );
        model.addAttribute( "booksortList", booksortList );//加载书籍分类选项
        String forword="admin/book/book_update";
        return forword;
    }

    /**
     * 管理员修改书籍信息
     * @return
     */
    @RequestMapping("updateBook")
    public String updateBook(Book book,Model model){
        int rows=iBookService.updateBook( book );
        model.addAttribute( "rows",rows );
        return "admin/book/book_update_result";
    }


    /**
     * 用户根据书籍分类id查询该分类下的书籍信息
     * @return
     */
    @RequestMapping("queryBookOfBooksort")
    public String queryBookOfBooksort(int cId ,int bsId ,Model model){


        List<Book> bookList=iBookService.queryBookOfBsId(bsId);
        model.addAttribute("bookList", bookList);
        return "customer/book/cus_book";
    }

    /**
     * 关键字搜索书籍
     * @param book
     * @param keyword
     * @param model
     * @return
     */
    @RequestMapping("keyword")
    public String keywordSearch(Book book,String keyword,Model model){
        if (keyword==null||keyword==""){
            return "customer/book/cus_book";
        }else {
            book.setBookName(keyword);
            List<Map> mapList=iBookService.keywordSearch(book);
            System.out.println(mapList);
            model.addAttribute("mapList",mapList);
            return "customer/book/cus_book";
        }

    }


}
