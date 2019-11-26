package com.goldenhouse.service;

import com.goldenhouse.entity.Order;

import java.util.List;
import java.util.Map;

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

    /**
     * 根据书籍ID查询订单信息
     * @param bId
     * @return
     */
    List<Order> queryOrderBybookId(int bId);

    /**
     * 用户查看个人所有订单
     * @param cId
     * @return
     */
    List<Map> queryOrderOfCus(Integer cId);

}
