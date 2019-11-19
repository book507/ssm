package com.goldenhouse.service;

import com.goldenhouse.entity.Bcategory;

import java.util.List;

public interface IBcategoryService {
    /**
     * 增加书籍分类
     * @param bcategory
     * @return
     */
    int addBcategory(Bcategory bcategory);

    /**
     * 查询所有书籍分类信息
     * @return
     */
    List<Bcategory> queryBcategory();

    /**
     * 根据书籍分类ID删除书籍分类信息
     * @param bsId
     * @return
     */
    int deleteBcategory(int bsId);

    /**
     * 根据书籍分类ID修改书籍分类信息
     * @param bcategory
     * @return
     */
    int updateBcategory(Bcategory bcategory);

    /**
     * 根据书籍分类ID查询单个书籍分类信息
     * @return bsId
     */
    Bcategory queryBcategoryById(int bsId);
}
