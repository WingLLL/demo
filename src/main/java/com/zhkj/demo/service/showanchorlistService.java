package com.zhkj.demo.service;

import com.github.pagehelper.PageHelper;
import com.zhkj.demo.mapper.zhanchorMapper;
import com.zhkj.demo.model.zhanchor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class showanchorlistService {
    private static final Logger logger = LoggerFactory.getLogger(showanchorlistService.class);
    @Autowired
    private zhanchorMapper adao;
    public List<zhanchor> queryAll(int pageNum, int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<zhanchor> alist=adao.queryAll();
        return alist;
    }
    public List<zhanchor> queryAll_wx(){
        List<zhanchor> list = null;
        try {
            list = adao.queryAll_wx();
        } catch (Exception e) {
            logger.error("error:{}",e);
            e.printStackTrace();
        }
        return list;
    }
}
