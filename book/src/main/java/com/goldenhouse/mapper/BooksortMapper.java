package com.goldenhouse.mapper;

import com.goldenhouse.entity.Booksort;

import java.util.List;

public interface BooksortMapper {

    /**
     * 增加书籍分类
     * @param booksort
     * @return
     */
    int addBooksort(Booksort booksort);

    /**
     * 根据书籍分类ID删除书籍分类信息
     * @param bsId
     * @return
     */
    int deleteBooksort(int bsId);

    /**
     * 根据书籍分类ID修改书籍分类信息
     * @param booksort
     * @return
     */
    int updateBooksort(Booksort booksort);

    /**
     * 查询所有书籍分类信息
     * @return
     */
    List<Booksort> queryBooksort();

    /**
     * 根据书籍分类ID查询单个书籍分类信息
     * @param bsId
     * @return
     */
    Booksort queryBooksortById(int bsId);

}
