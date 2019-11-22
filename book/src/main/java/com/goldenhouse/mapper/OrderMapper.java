package com.goldenhouse.mapper;

import com.goldenhouse.entity.Order;

import java.util.List;

public interface OrderMapper {

    /**
     * 根据订单ID删除该订单信息
     * @param oId
     * @return
     */
    int deleteOrder(int oId);

    /**
     * 查询所有订单信息
     * @return
     */
    List<Order> queryOrder();

    /**
     * 根据订单ID查询单个订单信息
     * @param oId
     * @return
     */
    Order queryOrderById(int oId);


    /**
     * 修改订单状态
     * @param order
     * @return
     */
    int updateOrderOfSta(Order order);
}
