package com.goldenhouse.mapper;



import com.goldenhouse.entity.Shop;

import java.util.List;

public interface ShopMapper {
    /**
     * 查看所有商品列表
     * @return
     */
    List<Shop> queryAllShop();

}
