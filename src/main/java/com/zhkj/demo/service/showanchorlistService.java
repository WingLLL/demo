package com.zhkj.demo.service;

import com.github.pagehelper.PageHelper;
import com.zhkj.demo.mapper.zhanchorMapper;
import com.zhkj.demo.model.zhanchor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class showanchorlistService {
    @Autowired
    private zhanchorMapper adao;
    public List<zhanchor> queryAll(int pageNum, int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<zhanchor> alist=adao.queryAll();
        return alist;
    }
}
