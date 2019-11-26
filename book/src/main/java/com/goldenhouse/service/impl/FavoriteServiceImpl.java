package com.goldenhouse.service.impl;

import com.goldenhouse.dao.ICustomerDao;
import com.goldenhouse.dao.IFavoriteDao;
import com.goldenhouse.entity.Favorite;
import com.goldenhouse.service.IFavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("favoriteService")
public class FavoriteServiceImpl implements IFavoriteService {

    @Autowired
    @Qualifier("favoriteDao")
    private IFavoriteDao favoriteDao;
    @Autowired
    private ICustomerDao customerDao;

    /**
     * 根据收藏id删除收藏夹的书本
     * @param fId
     * @return
     */
    @Override
    public int deleteBookOfFavorite(int fId) {
        return favoriteDao.deleteBookOfFavorite(fId);
    }

    /**
     * 查看个人收藏夹所有的书本
     * @param cId
     * @return
     */
    @Override
    public List<Map> queryBookOfFavorite(int cId) {
        return favoriteDao.queryBookOfFavorite(cId);
    }

    /**
     * 根据用户id查询购物车所有书本id
     * @param cId
     * @return
     */
    @Override
    public List<Integer> queryBIdOfCart(Integer cId) {
        return favoriteDao.queryBIdOfCart(cId);
    }

    /**
     * 根据收藏夹Id把书本添加到购物车
     * @param cId
     * @return
     */
    @Override
    public int addBookToCart(Integer cId,Integer bId) {
        return favoriteDao.addBookToCart(cId,bId);
    }

    /**
     * 根据收藏夹id查询出要添加到购物车的字段
     * @param fId
     * @return
     */
    @Override
    public Favorite getBC(Integer fId) {
        return favoriteDao.getBC(fId);
    }

}
