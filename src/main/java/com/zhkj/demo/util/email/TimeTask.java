package com.zhkj.demo.util.email;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.Properties;
import java.util.Timer;

/**
 * Created by zhaoyu
 */
public class TimeTask implements ServletContextListener {
    private Timer timer = null;
    public void contextDestroyed(ServletContextEvent event) {
        timer.cancel();
        event.getServletContext().log("定时器销毁");
    }
    public void contextInitialized(ServletContextEvent event) {
        //在这里初始化监听器，在tomcat启动的时候监听器启动，可以在这里实现定时器功能
        timer = new Timer(true);
        event.getServletContext().log("定时器已启动");//添加日志，可在tomcat日志中查看到
        //调用exportHistoryBean，0表示任务无延迟，1*1000表示每隔1秒执行任务，60*1000表示一分钟；
        timer.schedule(new SendMail(event.getServletContext()),0,60*1000);
    }
}


class SendMail extends java.util.TimerTask  {

    private ServletContext context = null;
    public SendMail(ServletContext context)
    {
        this.context = context;
    }

    public void run() {
        Properties prop = new Properties();
        prop.put("mail.host","smtp.163.com");//发件人使用发邮件的电子信箱服务器我使用的是163的服务器
        prop.put("mail.transport.protocol", "smtp");//发送邮件协议名称
        prop.put("mail.smtp.auth","true"); //这样才能通过验证

        try {
            //使用JavaMail发送邮件的5个步骤
            //1、创建session
            Session session = Session.getInstance(prop);
            //开启Session的debug模式，这样就可以查看到程序发送Email的运行状态
            session.setDebug(true);
            //2、通过session得到transport对象
            Transport ts = session.getTransport();
            //3、使用邮箱的用户名和密码(开启step服务后的授权码)连上邮件服务器，
            ts.connect("smtp.163.com", "邮箱账号", "授权码");
                /*
                4、创建邮件（只包含文本）
                Message message = createSimpleMail(session);
                 */
            //4、创建邮件（带附件）
            Message message = createAttachMail(session);
            //5、发送邮件
            ts.sendMessage(message, message.getAllRecipients());
            ts.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }


    //创建一封只包含文本的邮件
    public static MimeMessage createSimpleMail(Session session) throws Exception {

        //创建邮件对象
        MimeMessage message = new MimeMessage(session);
        //指明邮件的发件人
        message.setFrom(new InternetAddress("发件人邮箱地址@163.com"));
        //指明邮件的收件人
        message.setRecipient(Message.RecipientType.TO, new InternetAddress("xxxxxxx@qq.com"));
        //邮件的标题
        message.setSubject("测试邮件");

        //邮件的文本内容，为了避免邮件正文中文乱码问题，需要使用charset=UTF-8指明字符编码
        //需要注意的是如果收件人是qq邮箱极有可能被当作垃圾邮件而不会提醒有新邮件
        message.setContent("都说了这不是垃圾邮件！", "text/html;charset=UTF-8");

        //返回创建好的邮件对象
        System.out.println(message);
        return message;
    }

    //创建一封包含附件的邮件
    public static MimeMessage createAttachMail(Session session) throws Exception {
        //创建邮件对象
        MimeMessage message = new MimeMessage(session);
        //指明邮件的发件人
        message.setFrom(new InternetAddress("发件人邮箱地址@163.com"));
        //指明邮件的收件人
        message.setRecipient(Message.RecipientType.TO, new InternetAddress("xxxxxxx@qq.com"));
        //邮件的标题
        message.setSubject("日志文件");

        //创建邮件正文，为了避免邮件正文中文乱码问题，需要使用charset=UTF-8指明字符编码
        MimeBodyPart text = new MimeBodyPart();
        String mailText = "请尽快回复!";
        text.setContent(mailText, "text/html;charset=UTF-8");
        //创建邮件附件
        MimeBodyPart attach = new MimeBodyPart();
        DataHandler dh = new DataHandler(new FileDataSource("C:\\Users\\john\\Desktop\\rz.txt"));
        attach.setDataHandler(dh);
        attach.setFileName(dh.getName());


        //创建容器描述数据关系
        MimeMultipart mp = new MimeMultipart();
        mp.addBodyPart(text);
        mp.addBodyPart(attach);
        mp.setSubType("mixed");
        message.setContent(mp);
        message.saveChanges();

        //返回创建好的邮件对象
        System.out.println(message);
        return message;

    }
}
