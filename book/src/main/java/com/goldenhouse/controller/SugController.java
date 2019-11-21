package com.goldenhouse.controller;

import com.goldenhouse.entity.Sug;
import com.goldenhouse.service.ISugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("sug")
public class SugController {

    @Autowired
    @Qualifier("sugService")
    private ISugService iSugService ;

    /**
     * 查询所有意见信息
     * @return
     */
    @RequestMapping("queryAllSug")
    public String queryAllSug(Model model, HttpServletRequest request){
        String forword="mailbox";
        List<Sug> sugList= iSugService.queryAllSug();
        model.addAttribute("sugList", sugList);
        request.setAttribute("sugList", sugList);
        return forword;
    }

    /**
     *  根据意见ID删除该意见信息
     * @return
     */
    @RequestMapping("deleteSug")
    public String deleteSug(int sugId,Model model){
        int rows=iSugService.deleteSug( sugId );
        model.addAttribute("rows", rows);
        return "redirect:queryAllSug";
    }
}
