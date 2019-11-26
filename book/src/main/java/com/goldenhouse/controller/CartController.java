package com.goldenhouse.controller;

import com.goldenhouse.entity.Cart;
import com.goldenhouse.entity.Favorite;
import com.goldenhouse.service.ICartService;
import com.goldenhouse.service.IFavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("cart")
public class CartController {
    @Autowired
    @Qualifier("cartService")
    private ICartService cartService;

    @Autowired
    @Qualifier("favoriteService")
    private IFavoriteService favoriteService;

    /**
     * 查看个人购物车所有物品
     * @param cId
     * @param model
     * @return
     */
    @RequestMapping("queryBook")
    public String queryBookOfCart(Integer cId,Model model){
        List<Map> mapList=cartService.queryBookOfCart(cId);
        System.out.println(mapList);
        model.addAttribute("mapList",mapList);
        return "customer/gwc/cus_gwc";
    }

    /**
     * 根据购物车id删除书本
     * @param gId
     * @param model
     * @return
     */
    @RequestMapping("deleteBook")
    public String deleteBookOfCart(Integer gId,Integer cId,Model model){
        int rows=cartService.deleteBookOfCart(gId);
        System.out.println(rows);
        model.addAttribute("rows",rows);
        model.addAttribute("cId",cId);
        return "customer/gwc/cart_delete_result";
    }

    /**
     * 加入购物车
     * @param gId
     * @param cId
     * @param bId
     * @param model
     * @return
     */
    @RequestMapping("add")
    public String addBookToFavorite(Integer gId,Integer cId,Integer bId,Model model){
        List<Integer> integers=cartService.queryBIdOfFavorite(cId);
        if (integers.contains(bId)==true){
            return "customer/gwc/cart_exit";
        }else {
            Cart cart=cartService.getBC(gId);
            int cI=cart.getCId();
            int bI=cart.getBId();
            int rows=cartService.addBookToFavorite(cI,bI);
            model.addAttribute("rows",rows);
            return "customer/gwc/cart_add_result";
        }
    }

    /**
     * 将书籍加入到购物车
     * @param bId
     * @param cId
     * @param model
     * @return
     */
    @RequestMapping("addBookToCart")
    public String addBookToCart(Integer bId,Integer cId,Model model){
        List<Integer> integers=favoriteService.queryBIdOfCart(cId);
        if (integers.contains(bId)==true){
            return "customer/gwc/cart_exit1";
        }else {
            int rows=favoriteService.addBookToCart(cId,bId);
            model.addAttribute("rows",rows);
            return "customer/gwc/cart_add_result";
        }
    }

    @RequestMapping("addToOrder")
    public String addBookToOrder(Integer gId,Integer cId,Integer bId,Model model){
        int rows=cartService.addBookToOrder(cId,bId);//向订单表添加一条数据
        cartService.updateGradeToCus(cId);  //给用户个人添加一定积分
        cartService.deleteBookToCart(gId);  //结算后从购车删除该条书本
        model.addAttribute("rows",rows);
        return "customer/gwc/cart_account_result";
    }
}
