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
}
