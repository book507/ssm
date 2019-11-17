package com.goldenhouse.service.impl;

import com.goldenhouse.dao.IBcategoryDao;
import com.goldenhouse.entity.Bcategory;
import com.goldenhouse.service.IBcategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bcategoryService")
public class BcategoryServiceImpl implements IBcategoryService {

    @Autowired
    @Qualifier("bcategoryDao")
    private IBcategoryDao bcategoryDao ;

    /**
     * 增加书籍分类
     * @param bcategory
     * @return
     */
    @Override
    public int addBcategory(Bcategory bcategory) {
        return bcategoryDao.addBcategory( bcategory );
    }

    /**
     * 查询所有书籍分类
     * @return
     */
    @Override
    public List<Bcategory> queryBcategory() {
        return bcategoryDao.queryBcategory();
    }
    /**
     * 根据书籍分类ID删除书籍分类信息
     * @param bs_id
     * @return
     */
    @Override
    public int deleteBcategory(int bs_id) {
        return bcategoryDao.deleteBcategory( bs_id );
    }

    /**
     * 根据书籍分类ID修改书籍分类信息
     * @param bcategory
     * @return
     */
    @Override
    public int updateBcategory(Bcategory bcategory) {
        return bcategoryDao.updateBcategory( bcategory );
    }
}
