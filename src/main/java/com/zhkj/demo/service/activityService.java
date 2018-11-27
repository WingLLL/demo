package com.zhkj.demo.service;

import com.zhkj.demo.mapper.Activity_anchorMapper;
import com.zhkj.demo.model.Activity_anchor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhaoyu
 */
@Service
public class activityService {
    private static final Logger logger = LoggerFactory.getLogger(activityService.class);
    @Autowired
    private Activity_anchorMapper adao;
    public List<Activity_anchor> queryAll(){
        List<Activity_anchor> alist= null;
        try {
            alist = adao.queryAll();
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("error:{}",e);
        }
        return alist;
    }
}
