package com.goldenhouse.dao.impl;

import com.goldenhouse.dao.IBookDao;
import com.goldenhouse.entity.Book;
import com.goldenhouse.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

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
}
