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
}
