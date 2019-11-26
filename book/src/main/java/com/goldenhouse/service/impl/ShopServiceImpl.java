package com.goldenhouse.service.impl;


import com.goldenhouse.entity.Shop;
import com.goldenhouse.dao.IShopDao;
import com.goldenhouse.service.IShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("shopService")
public class ShopServiceImpl implements IShopService {

    @Autowired
    @Qualifier("shopDao")
    private IShopDao shopDao;

    /**
     *实现查看所有积分商品列表
     * @return
     */
    @Override
    public List<Shop> queryAllShop() {
        return shopDao.queryAllShop();
    }

    /**
     * 增加积分商品信息
     * @param shop
     * @return
     */
    @Override
    public int addShop(Shop shop) {
        return shopDao.addShop( shop );
    }

    /**
     * 根据商品ID查询单个商品信息
     * @param sId
     * @return
     */
    @Override
    public Shop queryShopById(int sId) {
        return shopDao.queryShopById( sId );
    }

    /**
     * 修改积分商品信息
     * @param shop
     * @return
     */
    @Override
    public int updateShop(Shop shop) {
        return shopDao.updateShop( shop );
    }

    /**
     * 根据商品ID删除积分商品信息
     * @param sId
     * @return
     */
    @Override
    public int deleteShop(int sId) {
        return shopDao.deleteShop( sId );
    }

    /**
     * 兑换前先查询出用户个人的积分
     * @param cId
     * @return
     */
    @Override
    public int getGradeFromCus(int cId) {
        return shopDao.getGradeFromCus(cId);
    }

    /**
     * 兑换成功后减去相应的积分
     * @param sPrice
     * @param cId
     * @return
     */
    @Override
    public int minGrade(int sPrice,int cId) {
        return shopDao.minGrade(sPrice,cId);
    }

}
