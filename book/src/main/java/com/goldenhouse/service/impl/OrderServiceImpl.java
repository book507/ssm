package com.goldenhouse.service.impl;

import com.goldenhouse.dao.IOrderDao;
import com.goldenhouse.entity.Order;
import com.goldenhouse.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("orderService")
public class OrderServiceImpl implements IOrderService {

    @Autowired
    @Qualifier("orderDao")
    private IOrderDao iOrderDao;

    /**
     * 根据订单ID删除该订单信息
     * @param oId
     * @return
     */
    @Override
    public int deleteOrder(int oId) {
        return iOrderDao.deleteOrder( oId );
    }

    /**
     * 查询所有订单信息
     * @return
     */
    @Override
    public List<Order> queryOrder() {
        return iOrderDao.queryOrder();
    }

    /**
     * 根据订单ID查询单个订单信息
     * @param oId
     * @return
     */
    @Override
    public Order queryOrderById(int oId) {
        return iOrderDao.queryOrderById( oId );
    }

    /**
     * 修改订单状态
     * @param order
     * @return
     */
    @Override
    public int updateOrderOfSta(Order order) {
        return iOrderDao.updateOrderOfSta( order );
    }

}
