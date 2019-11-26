package com.goldenhouse.service;

import com.goldenhouse.entity.Book;

import java.util.List;
import java.util.Map;

public interface IBookService {

    /**
     * 根据书籍分类ID查询是否有书籍在该分类下
     * @param bsId
     * @return
     */
    List<Book> queryBookOfBsId(int bsId);

    /**
     * 查询所有书籍信息
     * @return
     */
    List<Book> queryBook();

    /**
     * 根据书籍ID删除书籍信息
     * @param bookId
     * @return
     */
    int deleteBook(int bookId);

    /**
     * 查询所有书籍信息关联书籍分类
     * @return
     */
    List<Map> queryBookOfAdmin();

    /**
     * 增加书籍信息
     * @param book
     * @return
     */
    int addBook(Book book);

    /**
     * 根据书籍Id查询该书籍信息
     * @return
     */
    Book queryBookById(int bookId);

    /**
     * 修改书籍信息
     * @param book
     * @return
     */
    int updateBook(Book book);

    /**
     * 关键字搜索书籍
     * @param book
     * @return
     */
    List<Map> keywordSearch(Book book);

}
