package com.goldenhouse.service.impl;

import com.goldenhouse.dao.ICartDao;
import com.goldenhouse.entity.Cart;
import com.goldenhouse.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("cartService")
public class CartServiceImpl implements ICartService {
    @Autowired
    @Qualifier("cartDao")
    private ICartDao cartDao;
    @Override
    public List<Map> queryBookOfCart(Integer cId) {
        return cartDao.queryBookOfCart(cId);
    }

    /**
     * 根据购物车id删除书本
     * @param gId
     * @return
     */
    @Override
    public int deleteBookOfCart(int gId) {
        return cartDao.deleteBookOfCart(gId);
    }

    /**
     * 根据用户id查询收藏夹所有书本id
     * @param cId
     * @return
     */
    @Override
    public List<Integer> queryBIdOfFavorite(int cId) {
        return cartDao.queryBIdOfFavorite(cId);
    }

    /**
     * 根据购物车id查询出要添加到收藏夹的字段
     * @param gId
     * @return
     */
    @Override
    public Cart getBC(Integer gId) {
        return cartDao.getBC(gId);
    }

    /**
     * 根据购物车Id把书本添加到收藏夹
     * @param cId
     * @param bId
     * @return
     */
    @Override
    public int addBookToFavorite(Integer cId, Integer bId) {
        return cartDao.addBookToFavorite(cId,bId);
    }

    /**
     * 结算时向订单中添加一条数据
     * @param cId
     * @param bId
     * @return
     */
    @Override
    public int addBookToOrder(Integer cId,Integer bId) {
        return cartDao.addBookToOrder(cId,bId);
    }

    /**
     * 结算时向用户个人添加积分
     * @param cId
     * @return
     */
    @Override
    public int updateGradeToCus(int cId) {
        return cartDao.updateGradeToCus(cId);
    }

    /**
     * 结算时从购物车删除该书本
     * @param gId
     * @return
     */
    @Override
    public int deleteBookToCart(int gId) {
        return cartDao.deleteBookToCart(gId);
    }

    /**
     * 根据用户id和书本id查询该书存在用户个人的购物车里
     * @param cart
     * @return
     */
    @Override
    public Cart queryByCIdByBId(Cart cart) {
        return cartDao.queryByCIdByBId( cart );
    }

}
