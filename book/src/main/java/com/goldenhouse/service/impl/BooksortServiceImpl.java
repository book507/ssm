package com.goldenhouse.service.impl;

import com.goldenhouse.dao.IBooksortDao;
import com.goldenhouse.entity.Booksort;
import com.goldenhouse.service.IBooksortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("booksortService")
public class BooksortServiceImpl implements IBooksortService {

    @Autowired
    @Qualifier("booksortDao")
    private IBooksortDao iBooksortDao ;

    /**
     * 增加书籍分类
     * @param booksort
     * @return
     */
    @Override
    public int addBooksort(Booksort booksort) {
        return iBooksortDao.addBooksort( booksort );
    }

    /**
     * 查询所有书籍分类
     * @return
     */
    @Override
    public List<Booksort> queryBooksort() {
        return iBooksortDao.queryBooksort();
    }
    /**
     * 根据书籍分类ID删除书籍分类信息
     * @param bs_id
     * @return
     */
    @Override
    public int deleteBooksort(int bs_id) {
        return iBooksortDao.deleteBooksort( bs_id );
    }

    /**
     * 根据书籍分类ID修改书籍分类信息
     * @param booksort
     * @return
     */
    @Override
    public int updateBooksort(Booksort booksort) {
        return iBooksortDao.updateBooksort( booksort );
    }

    /**
     * 根据书籍分类ID查询单个书籍分类信息
     * @param bsId
     * @return
     */
    @Override
    public Booksort queryBooksortById(int bsId) {
        return iBooksortDao.queryBooksortById( bsId );
    }

}
