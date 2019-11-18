package com.goldenhouse.dao;

import com.goldenhouse.entity.Shop;

import java.util.List;

public interface IShopDao {
    /**
     * 查看所有商品列表
     * @return
     */
    List<Shop> queryAllShop();
}
