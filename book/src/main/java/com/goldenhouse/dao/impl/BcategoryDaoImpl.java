package com.goldenhouse.dao.impl;

import com.goldenhouse.dao.IBcategoryDao;
import com.goldenhouse.entity.Bcategory;
import com.goldenhouse.mapper.BcategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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

    /**
     * 查询所有书籍分类
     * @return
     */
    @Override
    public List<Bcategory> queryBcategory() {
        return bcategoryMapper.queryBcategory();
    }

    /**
     * 根据书籍分类ID删除书籍分类信息
     * @param bs_id
     * @return
     */
    @Override
    public int deleteBcategory(int bs_id) {
        return bcategoryMapper.deleteBcategory( bs_id );
    }

    /**
     * 根据书籍分类ID修改书籍分类信息
     * @param bcategory
     * @return
     */
    @Override
    public int updateBcategory(Bcategory bcategory) {
        return bcategoryMapper.updateBcategory( bcategory );
    }

    /**
     * 根据书籍分类ID查询单个书籍分类信息
     * @return
     */


}
