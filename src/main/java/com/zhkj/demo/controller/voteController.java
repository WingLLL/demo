package com.zhkj.demo.controller;

import com.zhkj.demo.service.getNumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class voteController {
    @Autowired
    private getNumService gdao;
    @RequestMapping(value = "/vote",method = RequestMethod.POST)
    public Map vnum(@RequestBody int da){
        int newNum=gdao.getNewNum(da);
        Map map=new HashMap();
        map.put("vId",da);
        map.put("vNum",newNum);
        return map;
    }
}
