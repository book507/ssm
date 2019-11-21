package com.goldenhouse.service;

import com.goldenhouse.entity.Order;

import java.util.List;

public interface IOrderService {
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
}
