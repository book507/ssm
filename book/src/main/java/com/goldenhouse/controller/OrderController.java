package com.goldenhouse.controller;

import com.goldenhouse.entity.Order;
import com.goldenhouse.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("order")
public class OrderController {

    @Autowired
    @Qualifier("orderService")
    private IOrderService iOrderService ;

    /**
     *  根据订单ID删除该订单信息
     * @return
     */
    @RequestMapping("deleteOrder")
    public String deleteOrder(int oId, Model model){
        int rows=iOrderService.deleteOrder( oId );
        model.addAttribute("rows", rows);
        return "order_delete_result";
    }

    /**
     * 查询所有订单信息
     * @return
     */
    @RequestMapping("queryOrder")
    public String queryOrder(Model model, HttpServletRequest request){
        String forword="order";
        List<Order> orderList= iOrderService.queryOrder();
        model.addAttribute("orderList", orderList);
        request.setAttribute("orderList", orderList);
        return forword;
    }

    /**
     * 管理员跳转到订单状态修改页面
     * @return
     */
    @RequestMapping("/order_update.action")
    public String adminOrderUpdate(int oId,Model model ){
        Order order=iOrderService.queryOrderById( oId );
        model.addAttribute("order",order);
        String forword="order_update";
        return forword;
    }

    /**
     * 管理员根据订单ID修改书订单状态
     * @param order
     * @return
     */
    @RequestMapping("order_update")
    public String OrderUpdate(Order order,Model model){
        int rows=iOrderService.updateOrderOfSta( order );
        model.addAttribute( "rows",rows );
        return "order_update_result";
    }


}
