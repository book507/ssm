package com.goldenhouse.service.impl;

import com.goldenhouse.dao.IBookDao;
import com.goldenhouse.entity.Book;
import com.goldenhouse.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("bookService")
public class BookServiceImpl implements IBookService {

    @Autowired
    @Qualifier("bookDao")
    private IBookDao bookDao ;

    /**
     * 根据书籍分类ID查询是否有书籍在该分类下
     * @param bsId
     * @return
     */
    @Override
    public List<Book> queryBookOfBsId(int bsId) {
        return bookDao.queryBookOfBsId( bsId );
    }

    /**
     * 查询所有书籍信息
     * @return
     */
    @Override
    public List<Book> queryBook() {
        return bookDao.queryBook();
    }

    /**
     * 根据书籍ID删除书籍信息
     * @param bookId
     * @return
     */
    @Override
    public int deleteBook(int bookId) {
        return bookDao.deleteBook( bookId );
    }

    /**
     * 查询所有书籍信息关联书籍分类
     * @return
     */
    @Override
    public List<Map> queryBookOfAdmin() {
        return bookDao.queryBookOfAdmin();
    }

    /**
     * 增加书籍信息
     * @param book
     * @return
     */
    @Override
    public int addBook(Book book) {
        return bookDao.addBook( book );
    }

    /**
     * 根据书籍Id查询该书籍信息
     * @return
     */
    @Override
    public Book queryBookById(int bookId) {
        return bookDao.queryBookById( bookId );
    }

    /**
     * 修改书籍信息
     * @param book
     * @return
     */
    @Override
    public int updateBook(Book book) {
        return bookDao.updateBook( book );
    }

    /**
     * 关键字搜索书籍
     * @param book
     * @return
     */
    @Override
    public List<Map> keywordSearch(Book book) {
        return bookDao.keywordSearch(book);
    }

}
