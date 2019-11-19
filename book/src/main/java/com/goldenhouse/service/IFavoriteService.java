package com.goldenhouse.service;

import com.goldenhouse.entity.Favorite;

import java.util.List;

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
    List<Favorite> queryBookOfFavorite(int cId);

}