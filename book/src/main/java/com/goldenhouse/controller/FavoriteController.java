package com.goldenhouse.controller;

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
@RequestMapping("favorite")
public class FavoriteController {
    @Autowired
    @Qualifier("favoriteService")
    private IFavoriteService favoriteService;

    @Autowired
    @Qualifier("cartService")
    private ICartService cartService;

    /**
     * 查看个人收藏夹所有的书本
     * @param cId
     * @param model
     * @return
     */
    @RequestMapping("queryBook")
    public String queryBookOfFavorite(int cId, Model model){
        List<Map> mapList=favoriteService.queryBookOfFavorite(cId);
        System.out.println(mapList);
        model.addAttribute("mapList",mapList);
        return "customer/favorites/cus_fav";
    }

/*    *//**
     * 根据收藏id删除收藏夹的书本
     * @param fId
     * @param model
     * @return
     *//*
    @RequestMapping("deleteBook")
    public String deleteBook(int fId,Model model){
        int rows=favoriteService.deleteBookOfFavorite(fId);
        System.out.println(rows);
        model.addAttribute("rows",rows);
        return "queryShop";
    }*/

    /**
     * 根据收藏id删除收藏夹的书本
     * @param fId
     * @param model
     * @return
     */
    @RequestMapping("deleteBook")
    public String deleteBook(Integer fId,Integer cId,Model model){
        int rows=favoriteService.deleteBookOfFavorite(fId);
        System.out.println(rows);
        model.addAttribute("rows",rows);
        model.addAttribute("cId",cId);
        return "customer/favorites/favorite_delete_result";
    }

    /**
     * 根据收藏夹Id把书本添加到购物车
     * @param cId
     * @param bId
     * @param model
     * @return
     */
    @RequestMapping("add")
    public String addBookToCart(Integer fId,Integer cId,Integer bId,Model model){
        List<Integer> integers=favoriteService.queryBIdOfCart(cId);
        if (integers.contains(bId)==true){
            model.addAttribute( cId );
            return "customer/favorites/favorite_exit";
        }else {
            Favorite favorite=favoriteService.getBC(fId);
            int cI=favorite.getCId();
            int bI=favorite.getBId();
            int rows=favoriteService.addBookToCart(cI,bI);
            model.addAttribute("rows",rows);
            return "customer/favorites/favorite_add_result";
        }
    }

    /**
     * 将书籍添加到收藏夹
     * @param bId
     * @param cId
     * @param model
     * @return
     */
    @RequestMapping("addBookToFav")
    public String addBookToFav(Integer bId,Integer cId,Model model){
        List<Integer> integers=favoriteService.queryBIdOfCart(cId);
        if (integers.contains(bId)==true){
            model.addAttribute( cId );
            return "customer/favorites/favorite_exit1";
        }else {
            int rows=cartService.addBookToFavorite(cId,bId);
            model.addAttribute("rows",rows);
            return "customer/favorites/favorite_add_result";
        }
    }

}
