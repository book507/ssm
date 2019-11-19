package com.goldenhouse.service.impl;

import com.goldenhouse.dao.ICustomerDao;
import com.goldenhouse.dao.IFavoriteDao;
import com.goldenhouse.entity.Book;
import com.goldenhouse.entity.Favorite;
import com.goldenhouse.service.IFavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
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
    public List<Favorite> queryBookOfFavorite(int cId) {
        return favoriteDao.queryBookOfFavorite(cId);
    }

}
