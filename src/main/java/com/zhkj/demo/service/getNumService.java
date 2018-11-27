package com.zhkj.demo.service;

import com.zhkj.demo.mapper.voteMapper;
import com.zhkj.demo.model.vote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class getNumService {
    @Autowired
    private voteMapper vdao;
    public int getNewNum(int i){
        int nVnum=vdao.selectByPrimaryKey(i).getvNum()+1;
        vote v=new vote();
        v.setvId(i);
        v.setvNum(nVnum);
        v.setvName(vdao.selectByPrimaryKey(i).getvName());
        v.setvPic(vdao.selectByPrimaryKey(i).getvPic());
        vdao.updateByPrimaryKey(v);
        return nVnum;
    }
}
