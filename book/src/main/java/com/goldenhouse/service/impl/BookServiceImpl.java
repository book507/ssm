package com.goldenhouse.service.impl;

import com.goldenhouse.dao.IBookDao;
import com.goldenhouse.entity.Book;
import com.goldenhouse.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
