package com.goldenhouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("book")
public class BookController {

    /**
     * 管理员跳转到书籍管理页面
     * @return
     */
    @RequestMapping("/admin_book.action")
    public String adminBook(){
        String forword="book";
        return forword;
    }
}
