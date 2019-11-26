package com.goldenhouse.mapper;

import com.goldenhouse.entity.Favorite;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

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
    List<Map> queryBookOfFavorite(int cId);

    /**
     * 根据用户id查询购物车所有书本id
     * @param cId
     * @return
     */
    List<Integer> queryBIdOfCart(int cId);

    /**
     * 根据收藏夹Id把书本添加到购物车
     * @param cId
     * @param bId
     * @return
     */
    int addBookToCart(@Param("cId") Integer cId, @Param("bId") Integer bId);

    /**
     * 根据收藏夹id查询出要添加到购物车的字段
     * @param fId
     * @return
     */
    Favorite getBC(Integer fId);
}
