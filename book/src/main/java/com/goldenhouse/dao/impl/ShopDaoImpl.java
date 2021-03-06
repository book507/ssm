package com.goldenhouse.dao.impl;


import com.goldenhouse.dao.IShopDao;
import com.goldenhouse.entity.Shop;
import com.goldenhouse.mapper.ShopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("shopDao")
public class ShopDaoImpl implements IShopDao {
    @Autowired
    @Qualifier("shopMapper")
    private ShopMapper shopMapper;

    /**
     * 查看所有商品列表
     * @return
     */
    @Override
    public List<Shop> queryAllShop() {
        return shopMapper.queryAllShop();
    }

    /**
     * 增加积分商品信息
     * @param shop
     * @return
     */
    @Override
    public int addShop(Shop shop) {
        return shopMapper.addShop( shop );
    }

    /**
     * 根据商品ID查询单个商品信息
     * @param sId
     * @return
     */
    @Override
    public Shop queryShopById(int sId) {
        return shopMapper.queryShopById( sId );
    }

    /**
     * 修改积分商品信息
     * @param shop
     * @return
     */
    @Override
    public int updateShop(Shop shop) {
        return shopMapper.updateShop( shop );
    }

    /**
     * 根据商品ID删除积分商品信息
     * @param sId
     * @return
     */
    @Override
    public int deleteShop(int sId) {
        return shopMapper.deleteShop( sId );
    }

    /**
     * 兑换前先查询出用户个人的积分
     * @param cId
     * @return
     */
    @Override
    public int getGradeFromCus(int cId) {
        return shopMapper.getGradeFromCus(cId);
    }

    /**
     * 兑换成功后减去相应的积分
     * @param sPrice
     * @param cId
     * @return
     */
    @Override
    public int minGrade(int sPrice,int cId) {
        return shopMapper.minGrade(sPrice,cId);
    }

}
