package com.zhkj.demo.controller;

import com.zhkj.demo.model.zhanchor;
import com.zhkj.demo.service.showanchorlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class showanchorlistController {
    @Autowired
    private showanchorlistService showdao;
    @RequestMapping(value = "/showAnchor")
    public ModelAndView anchorlist(int pageNum){
        ModelAndView mv=new ModelAndView("hotAnchorlist.html");
        List<zhanchor> alist=showdao.queryAll(pageNum,21);
        mv.addObject("alist",alist);
        return mv;
    }
}
