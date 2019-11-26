package com.goldenhouse.dao;

import com.goldenhouse.entity.Cart;

import java.util.List;
import java.util.Map;

public interface ICartDao {
    /**
     * 查看个人购物车所有书本
     * @param cId
     * @return
     */
    List<Map> queryBookOfCart(Integer cId);

    /**
     * 根据购物车id删除书本
     * @param gId
     * @return
     */
    int deleteBookOfCart(int gId);

    /**
     * 根据用户id查询收藏夹所有书本id
     * @param cId
     * @return
     */
    List<Integer> queryBIdOfFavorite(int cId);

    /**
     * 根据购物车id查询出要添加到收藏夹的字段
     * @param gId
     * @return
     */
    Cart getBC(Integer gId);

    /**
     * 根据购物车Id把书本添加到收藏夹
     * @param cId
     * @param bId
     * @return
     */
    int addBookToFavorite(Integer cId, Integer bId);

    /**
     * 结算时向订单中添加一条数据
     * @param cId
     * @param bId
     * @return
     */
    int addBookToOrder(Integer cId,Integer bId);

    /**
     * 结算时向用户个人添加积分
     * @param cId
     * @return
     */
    int updateGradeToCus(int cId);

    /**
     * 结算时从购物车删除该书本
     * @param gId
     * @return
     */
    int deleteBookToCart(int gId);

    /**
     * 根据用户id和书本id查询该书存在用户个人的购物车里
     * @param cart
     * @return
     */
    Cart queryByCIdByBId(Cart cart);
}
