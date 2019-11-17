package com.goldenhouse.service;

import com.goldenhouse.entity.Bcategory;

public interface IBcategoryService {
    /**
     * 增加书籍分类
     * @param bcategory
     * @return
     */
    int addBcategory(Bcategory bcategory);
}
