package com.example.wechat.service.impl.manual;

import java.io.File;
import com.example.wechat.service.manual.CommonsService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class CommonsServiceImpl implements CommonsService {

    @Value("${application.file.path}")
    private String path;

    @Override
    public String upload(MultipartFile file) {
        if(file.isEmpty()){
            return null;
        }
        SimpleDateFormat format = new SimpleDateFormat("/yyyy/MM/dd/");
        String date = format.format(new Date());
        File rootPath = new File(path+date);
        if(!rootPath.exists()) rootPath.mkdirs();
        String fileName = "img"+System.currentTimeMillis()+file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        File realPath = new File(path+date+fileName);
        try {
            file.transferTo(realPath);
            return date+fileName;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
