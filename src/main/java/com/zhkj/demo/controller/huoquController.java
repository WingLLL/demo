package com.zhkj.demo.controller;

import com.zhkj.demo.service.voteService;
        import com.zhkj.demo.model.vote;
        import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
        import org.springframework.web.servlet.ModelAndView;

        import java.util.List;

@RestController
public class huoquController{
    @Autowired
    private voteService vdao;
    @RequestMapping("/huoqu")
    public ModelAndView voteList(){
        List<vote> vlist=vdao.voteList();
        return new ModelAndView("anchorVote.html","vlist",vlist);
    }
}
