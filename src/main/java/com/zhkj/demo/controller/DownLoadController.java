package com.zhkj.demo.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;

@Controller
public class DownLoadController {
    @RequestMapping(value = "/fileDownLoad.action",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<byte[]> textFileDownload() throws Exception {
        String path = "C://jianli/简历.doc";
        File file = new File(path);
        HttpHeaders headers = new HttpHeaders();
        // String fileName=new
        // String("你好.xlsx".getBytes("UTF-8"),"iso-8859-1");//为了解决中文名称乱码问题
        String fileName = new String(file.getName().getBytes("UTF-8"), "iso-8859-1");// 为了解决中文名称乱码问题
        headers.setContentDispositionFormData("attachment", fileName);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);
    }
    @RequestMapping(value = "/fileDownLoadScout.action")
    public ResponseEntity<byte[]> textFileDownloadScout() throws Exception {
        String path = "C://jianli/简历_星探.doc";
        File file = new File(path);
        HttpHeaders headers = new HttpHeaders();
        // String fileName=new
        // String("你好.xlsx".getBytes("UTF-8"),"iso-8859-1");//为了解决中文名称乱码问题
        String fileName = new String(file.getName().getBytes("UTF-8"), "iso-8859-1");// 为了解决中文名称乱码问题
        headers.setContentDispositionFormData("attachment", fileName);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);


    }

}
