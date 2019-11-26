package com.goldenhouse.dao.impl;

import com.goldenhouse.dao.IBookDao;
import com.goldenhouse.entity.Book;
import com.goldenhouse.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("bookDao")
public class BookDaoImpl implements IBookDao {
    @Autowired
    @Qualifier("bookMapper")
    private BookMapper bookMapper;

    /**
     * 根据书籍分类ID查询是否有书籍在该分类下
     * @param bsId
     * @return
     */
    @Override
    public List<Book> queryBookOfBsId(int bsId) {
        return bookMapper.queryBookOfBsId( bsId );
    }

    /**
     * 查询所有书籍信息
     * @return
     */
    @Override
    public List<Book> queryBook() {
        return bookMapper.queryBook();
    }

    /**
     * 根据书籍ID删除书籍信息
     * @param bookId
     * @return
     */
    @Override
    public int deleteBook(int bookId) {
        return bookMapper.deleteBook( bookId );
    }

    /**
     * 查询所有书籍信息关联书籍分类
     * @return
     */
    @Override
    public List<Map> queryBookOfAdmin() {
        return bookMapper.queryBookOfAdmin();
    }

    /**
     * 增加书籍信息
     * @param book
     * @return
     */
    @Override
    public int addBook(Book book) {
        return bookMapper.addBook( book );
    }

    /**
     * 根据书籍Id查询该书籍信息
     * @return
     */
    @Override
    public Book queryBookById(int bookId) {
        return bookMapper.queryBookById(bookId);
    }

    /**
     * 修改书籍信息
     * @param book
     * @return
     */
    @Override
    public int updateBook(Book book) {
        return bookMapper.updateBook( book );
    }

    /**
     * 关键字搜索书籍
     * @param book
     * @return
     */
    @Override
    public List<Map> keywordSearch(Book book) {
        return bookMapper.keywordSearch(book);
    }
}
