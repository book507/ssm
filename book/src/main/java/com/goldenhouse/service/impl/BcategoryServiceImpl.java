package com.goldenhouse.service.impl;

import com.goldenhouse.dao.IBcategoryDao;
import com.goldenhouse.entity.Bcategory;
import com.goldenhouse.service.IBcategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("bcategoryService")
public class BcategoryServiceImpl implements IBcategoryService {

    @Autowired
    @Qualifier("bcategoryDao")
    private IBcategoryDao iBcategoryDao ;

    /**
     * 增加书籍分类
     * @param bcategory
     * @return
     */
    @Override
    public int addBcategory(Bcategory bcategory) {
        return iBcategoryDao.addBcategory( bcategory );
    }
}
