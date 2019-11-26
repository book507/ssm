package com.goldenhouse.dao.impl;

import com.goldenhouse.dao.IFavoriteDao;
import com.goldenhouse.entity.Favorite;
import com.goldenhouse.mapper.FavoriteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("favoriteDao")
public class FavoriteDaoImpl implements IFavoriteDao {
    @Autowired
    @Qualifier("favoriteMapper")
    private FavoriteMapper favoriteMapper;

    /**
     * 根据收藏id删除收藏夹的书本
     * @param fId
     * @return
     */
    @Override
    public int deleteBookOfFavorite(int fId) {
        return favoriteMapper.deleteBookOfFavorite(fId);
    }

    /**
     * 查看个人收藏夹所有的书本
     * @param cId
     * @return
     */
    @Override
    public List<Map> queryBookOfFavorite(int cId) {
        return favoriteMapper.queryBookOfFavorite(cId);
    }

    /**
     * 根据用户id查询购物车所有书本id
     * @param cId
     * @return
     */
    @Override
    public List<Integer> queryBIdOfCart(Integer cId) {
        return favoriteMapper.queryBIdOfCart(cId);
    }

    /**
     * 根据收藏夹Id把书本添加到购物车
     * @param cId
     * @return
     */
    @Override
    public int addBookToCart(Integer cId,Integer bId) {
        return favoriteMapper.addBookToCart(cId,bId);
    }

    /**
     * 根据收藏夹id查询出要添加到购物车的字段
     * @param fId
     * @return
     */
    @Override
    public Favorite getBC(Integer fId) {
        return favoriteMapper.getBC(fId);
    }
}
