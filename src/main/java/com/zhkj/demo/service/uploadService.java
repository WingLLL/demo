package com.zhkj.demo.service;

import com.zhkj.demo.mapper.upfileMapper;
import com.zhkj.demo.model.upfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class uploadService {
    @Autowired
    private upfileMapper udao;
    public void insert(){
        Date now = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        upfile u=new upfile();
        u.setfTime(ft.format(now));
        udao.insert(u);
    }
}
