package com.zhkj.demo.controller;

import com.zhkj.demo.service.uploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Controller
public class UploadController {
    @Autowired
    private uploadService udao;
    @RequestMapping("/fileUpLoad.action")
    @ResponseBody
    public ResponseEntity upLoadFile(MultipartFile file) throws IllegalStateException, IOException {
        BufferedOutputStream stream = null;
        if (!file.isEmpty()) {
            String path = "C://upload";
            File newFile=new File(path+"/"+file.getOriginalFilename());
            if(!newFile.exists()){
                newFile.createNewFile();
            }
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(newFile));
            out.write(file.getBytes());
            out.flush();
            out.close();
            udao.insert();
            return new ResponseEntity(HttpStatus.OK);
        }
        return null;
    }
    @RequestMapping("/fileUpLoadScout.action")
    @ResponseBody
    public ResponseEntity upLoadFileScout(MultipartFile file) throws IllegalStateException, IOException {
        BufferedOutputStream stream = null;
        if (!file.isEmpty()) {
            String path = "C://upload";
            File newFile=new File(path+"/"+file.getOriginalFilename());
            if(!newFile.exists()){
                newFile.createNewFile();
            }
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(newFile));
            out.write(file.getBytes());
            out.flush();
            out.close();
            udao.insert();
            return new ResponseEntity(HttpStatus.OK);
        }
        return null;
    }

}
