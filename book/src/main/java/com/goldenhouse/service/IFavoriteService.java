package com.goldenhouse.service;

import com.goldenhouse.entity.Favorite;

import java.util.List;
import java.util.Map;

public interface IFavoriteService {

    /**
     * 根据收藏id删除收藏夹的书本
     * @param fId
     * @return
     */
    int deleteBookOfFavorite(int fId);

    /**
     * 查看个人收藏夹所有的书本
     * @param cId
     * @return
     */
    List<Map> queryBookOfFavorite(int cId);

    /**
     * 根据用户id查询购物车所有书本id
     * @param cId
     * @return
     */
    List<Integer> queryBIdOfCart(Integer cId);

    /**
     * 根据收藏夹Id把书本添加到购物车
     * @param cId
     * @return
     */
    int addBookToCart(Integer cId,Integer bId);

    /**
     *
     * @param fId
     * @return
     */
    Favorite getBC(Integer fId);

}