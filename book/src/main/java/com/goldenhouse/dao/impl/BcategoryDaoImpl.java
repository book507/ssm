package com.goldenhouse.dao.impl;

import com.goldenhouse.dao.IBcategoryDao;
import com.goldenhouse.entity.Bcategory;
import com.goldenhouse.mapper.BcategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository("bcategoryDao")
public class BcategoryDaoImpl implements IBcategoryDao {
    @Autowired
    @Qualifier("bcategoryMapper")
    private BcategoryMapper bcategoryMapper;


    /**
     * 增加书籍分类
     * @param bcategory
     * @return
     */
    @Override
    public int addBcategory(Bcategory bcategory) {
        return bcategoryMapper.addBcategory( bcategory );
    }
}
