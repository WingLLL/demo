package com.zhkj.demo.Interceptor;

import com.zhkj.demo.mapper.uipMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.List;

public class ipvoteIntercepter implements HandlerInterceptor{
    @Autowired
    uipMapper udao;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String ip = request.getHeader("x-forwarded-for");
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
            if(ip.equals("127.0.0.1")){
                InetAddress inet=null;
                try {
                    inet = InetAddress.getLocalHost();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                ip= inet.getHostAddress();
            }
        }
        if(ip != null && ip.length() > 15){
            if(ip.indexOf(",")>0){
                ip = ip.substring(0,ip.indexOf(","));
            }
        }
//        System.out.println("interceptor success");
//        System.out.println(ip);
        List<String> list=udao.queryAll();
        Iterator it=list.iterator();
        while(it.hasNext()){
            if(ip.equals(it.next())){
                response.sendError(HttpServletResponse.SC_FORBIDDEN);
                return false;
            }
        }
        udao.insertuip(ip);
        return true;
    }
}
