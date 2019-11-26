package com.goldenhouse.dao;

import com.goldenhouse.entity.Shop;

import java.util.List;

public interface IShopDao {
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

    /**
     * 根据商品ID删除积分商品信息
     * @param sId
     * @return
     */
    int deleteShop(int sId);

    /**
     * 兑换前先查询出用户个人的积分
     * @param cId
     * @return
     */
    int getGradeFromCus(int cId);

    /**
     * 兑换成功后减去相应的积分
     * @param sPrice
     * @param cId
     * @return
     */
    int minGrade(int sPrice,int cId);

}
