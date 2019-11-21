package com.goldenhouse.dao.impl;

import com.goldenhouse.dao.IOrderDao;
import com.goldenhouse.entity.Order;
import com.goldenhouse.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;
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
}
