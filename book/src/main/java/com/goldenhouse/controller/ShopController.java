package com.goldenhouse.controller;


import com.goldenhouse.entity.Shop;
import com.goldenhouse.service.IShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("shop")
public class ShopController {
    @Autowired
    @Qualifier("shopService")
    private IShopService shopService;

    /**
     * 查看所有积分商品
     * @param model
     * @param session
     * @return
     */
    @RequestMapping("queryAll")
    public String queryAllShop(Model model, HttpSession session){
        List<Shop> shopList=shopService.queryAllShop();
        for (Shop shop:shopList){
            System.out.println(shop);
        }
        model.addAttribute("shopList",shopList);
        return "cus_shop";
    }

    /**
     * 返回用户个人主页面
     * @return
     */
    @RequestMapping("returnIndex")
    public String returnCusIndex(){
        return "cus_index";
    }
    /**
     * 添加积分商品
     * @param shop
     * @return
     */
    @RequestMapping("addShop")
    public String addShop(Shop shop,Model model){
        int rows=shopService.addShop( shop );
        model.addAttribute( "rows",rows );
        return "shop_add_result";
    }

    /**
     * 跳转到积分商品增加页面
     * @return
     */
    @RequestMapping("/shop_add.action")
    public String adminBcategoryAdd(){
        String forword="shop_add";
        return forword;
    }

    /**
     * 跳转到积分商品页面
     * @return
     */
    @RequestMapping("/shop.action")
    public String shopAction(){
        String forword="shop";
        return forword;
    }

    /**
     * 管理员查询所有积分商品
     * @return
     */
    @RequestMapping("queryShop")
    public String queryBcategory(Model model, HttpServletRequest request){
        String forword="shop";
        List<Shop> shopList= shopService.queryAllShop();
        model.addAttribute("shopList", shopList);
        request.setAttribute("shopList", shopList);
        return forword;
    }

    /**
     * 管理员操作跳转到积分商品修改页面
     * @return
     */
    @RequestMapping("/shop_update.action")
    public String shopUpdate(int sId,Model model ){
        Shop shop=shopService.queryShopById( sId );
        model.addAttribute("shop",shop);
        String forword="shop_update";
        return forword;
    }

    /**
     * 管理员根据积分商品ID修改积分商品信息
     * @param shop
     * @return
     */
    @RequestMapping("shop_update")
    public String shopUpdate(Shop shop,Model model){
        int rows=shopService.updateShop( shop );
        model.addAttribute( "rows",rows );
        return "shop_update_result";
    }

    /**
     * 管理员根据积分商品ID删除积分商品信息
     * @param sId
     * @return
     */
    @RequestMapping("deleteShop")
    public String deleteShop(int sId,Model model){
        int rows=shopService.deleteShop( sId );
        model.addAttribute("rows", rows);
        return "shop_delete_result";
    }

}
