package com.goldenhouse.service;

import com.goldenhouse.entity.Shop;

import java.util.List;

public interface IShopService {
    /**
     * 查看所有商品列表
     * @return
     */
    List<Shop> queryAllShop();

    /**
     * 增加积分商品信息
     * @param shop
     * @return
     */
    int addShop(Shop shop);

    /**
     * 根据商品ID查询单个商品信息
     * @param sId
     * @return
     */
    Shop queryShopById(int sId);

    /**
     * 修改积分商品信息
     * @param shop
     * @return
     */
    int updateShop(Shop shop);
}
