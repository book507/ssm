package com.goldenhouse.controller;

import com.goldenhouse.entity.Sug;
import com.goldenhouse.service.ISugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("sug")
public class SugController {

    @Autowired
    @Qualifier("sugService")
    private ISugService iSugService ;

    /**
     * 管理员查询所有意见信息
     * @return
     */
    @RequestMapping("queryAllSug")
    public String queryAllSug(Model model){
        String forword="admin/mailbox/sug";
        List<Sug> sugList= iSugService.queryAllSug();
        model.addAttribute("sugList", sugList);
        return forword;
    }

    /**
     *  管理员根据意见ID删除该意见信息
     * @return
     */
    @RequestMapping("deleteSug")
    public String deleteSug(int sugId,Model model){
        int rows=iSugService.deleteSug( sugId );
        model.addAttribute("rows", rows);
        return "admin/mailbox/sug_delete_result";
    }

    /**
     * 用户添加意见信息
     * @param sug
     * @return
     */
    @RequestMapping("submitSug")
    public String cusSubmitSug(Sug sug,Model model){
        int rows=iSugService.cusSubmitSug(sug);
        model.addAttribute("rows",rows);
        return "customer/suggest/sug_submit_result";
    }

    /**
     * 用户跳转到添加意见页面
     * @return
     */
    @RequestMapping("/cus_sug.action")
    public String cusSugAction(Integer cId,Model model){
        model.addAttribute("cId",cId);
        String forword="customer/suggest/cus_suggest";
        return forword;
    }

}
