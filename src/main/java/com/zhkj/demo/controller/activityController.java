package com.zhkj.demo.controller;

import com.zhkj.demo.model.Activity_anchor;
import com.zhkj.demo.service.activityService;
import com.zhkj.demo.util.Excel.Anchor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by zhaoyu
 */
@Controller
public class activityController {
    @Autowired
    private activityService vdao;
    @RequestMapping(value = "/activity",method = RequestMethod.GET)
    public ModelAndView voteList(){
        List<Activity_anchor> vlist=vdao.queryAll();
        return new ModelAndView("test.html","alist",vlist);
    }
}
