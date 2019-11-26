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
import java.util.Map;

@Controller
@RequestMapping("order")
public class OrderController {

    @Autowired
    @Qualifier("orderService")
    private IOrderService iOrderService ;

    /**
     *  管理员根据订单ID删除该订单信息
     * @return
     */
    @RequestMapping("deleteOrder")
    public String deleteOrder(int oId, Model model){
        int rows=iOrderService.deleteOrder( oId );
        model.addAttribute("rows", rows);
        return "admin/order/order_delete_result";
    }

    /**
     * 管理员查询所有订单信息
     * @return
     */
    @RequestMapping("queryOrder")
    public String queryOrder(Model model, HttpServletRequest request){
        String forword="admin/order/order";
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
        String forword="admin/order/order_update";
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
        return "admin/order/order_update_result";
    }

    /**
     * 用户查看个人所有订单
     * @param cId
     * @param model
     * @return
     */
    @RequestMapping("queryOrderOfCus")
    public String queryOrderOfCus(int cId, Model model){
        List<Map> mapList=iOrderService.queryOrderOfCus(cId);
        System.out.println(mapList);
        model.addAttribute("mapList",mapList);
        return "customer/order/cus_order";
    }

    /**
     * 用户申请退款
     * @param oId
     * @param model
     * @return
     */
    @RequestMapping("updateOrderOfUser")
    public String updateOrderOfUser(int oId,int oSta,Model model){
        int rows;
        rows=oSta;
        if(rows==0||rows==1||rows==2){
            Order order=new Order(  );
            order.setoId( oId );
            order.setoSta( 4 );
            rows=iOrderService.updateOrderOfSta( order );
            model.addAttribute( "rows",rows );
            return "customer/order/order_update_result";
        }
        model.addAttribute( "rows",rows );
        return "customer/order/order_update_result";
    }
}
