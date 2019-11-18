package com.goldenhouse.controller;


import com.goldenhouse.entity.Shop;
import com.goldenhouse.service.IShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
        return "queryShop";
    }
}
