package com.goldenhouse.controller;

import com.goldenhouse.entity.Favorite;
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

    /**
     * 查看个人收藏夹所有的书本
     * @param cId
     * @param model
     * @return
     */
    @RequestMapping("queryBook")
    public String queryBookOfFavorite(int cId, Model model){
        List<Map<String,Object>> mapList=favoriteService.queryBookOfFavorite(cId);
        System.out.println(mapList);
        model.addAttribute("mapList",mapList);
        return "cus_fav";
    }


    /**
     * 根据收藏id删除收藏夹的书本
     * @param fId
     * @param model
     * @return
     */
    @RequestMapping("deleteBook")
    public String deleteBook(int fId,Model model){
        int rows=favoriteService.deleteBookOfFavorite(fId);
        System.out.println(rows);
        model.addAttribute("rows",rows);
        return "queryShop";
    }
}
