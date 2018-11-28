package com.zhkj.demo.controller;

import com.zhkj.demo.model.zhanchor;
import com.zhkj.demo.service.showanchorlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value = "/showAnchor_wx",method = RequestMethod.GET)
    public ResponseEntity anchorlist_wx(){
        List<zhanchor> list = showdao.queryAll_wx();
        if(list.size()>0){
            return new ResponseEntity<List<zhanchor>>(list, HttpStatus.OK);
        }else{
            return new ResponseEntity<List<zhanchor>>(list, HttpStatus.CONFLICT);
        }
    }

}
