package com.zhkj.demo.service;

import com.zhkj.demo.mapper.voteMapper;
import com.zhkj.demo.model.vote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class voteService {
    @Autowired
    private voteMapper vdao;
    public List<vote> voteList(){
        return vdao.queryAll();
    }
}
