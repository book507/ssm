package com.goldenhouse.dao;

import com.goldenhouse.entity.Bcategory;

public interface IBcategoryDao {
    /**
     * 增加书籍分类
     * @param bcategory
     * @return
     */
    int addBcategory(Bcategory bcategory);
}
