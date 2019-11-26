package com.goldenhouse.service.impl;

import com.goldenhouse.dao.IOrderDao;
import com.goldenhouse.entity.Order;
import com.goldenhouse.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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

    /**
     * 根据书籍ID查询订单信息
     * @param bId
     * @return
     */
    @Override
    public List<Order> queryOrderBybookId(int bId) {
        return iOrderDao.queryOrderBybookId( bId );
    }

    /**
     * 用户查看个人所有订单
     * @param cId
     * @return
     */
    @Override
    public List<Map> queryOrderOfCus(Integer cId) {
        return iOrderDao.queryOrderOfCus(cId);
    }

}
