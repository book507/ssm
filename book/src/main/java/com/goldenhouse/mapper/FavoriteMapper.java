package com.goldenhouse.mapper;

import com.goldenhouse.entity.Favorite;

import java.util.List;

/**
 * 收藏夹mapper接口
 */
public interface FavoriteMapper {
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
