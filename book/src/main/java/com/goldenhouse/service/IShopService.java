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
}
