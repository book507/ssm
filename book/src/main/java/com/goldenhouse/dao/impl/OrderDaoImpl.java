package com.goldenhouse.dao.impl;

import com.goldenhouse.dao.IOrderDao;
import com.goldenhouse.entity.Order;
import com.goldenhouse.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("orderDao")
public class OrderDaoImpl implements IOrderDao {
    @Autowired
    @Qualifier("orderMapper")
    private OrderMapper orderMapper;

    /**
     * 根据订单ID删除该订单信息
     * @param oId
     * @return
     */
    @Override
    public int deleteOrder(int oId) {
        return orderMapper.deleteOrder( oId );
    }

    /**
     * 查询所有意见信息
     * @return
     */
    @Override
    public List<Order> queryOrder() {
        return orderMapper.queryOrder();
    }

    /**
     * 根据订单ID查询单个订单信息
     * @param oId
     * @return
     */
    @Override
    public Order queryOrderById(int oId) {
        return orderMapper.queryOrderById( oId );
    }

    /**
     * 修改订单状态
     * @param order
     * @return
     */
    @Override
    public int updateOrderOfSta(Order order) {
        return orderMapper.updateOrderOfSta( order );
    }

    /**
     * 根据书籍ID查询订单信息
     * @param bId
     * @return
     */
    @Override
    public List<Order> queryOrderBybookId(int bId) {
        return orderMapper.queryOrderBybookId( bId );
    }

    /**
     * 用户查看个人所有订单
     * @param cId
     * @return
     */
    @Override
    public List<Map> queryOrderOfCus(Integer cId) {
        return orderMapper.queryOrderOfCus(cId);
    }

}
