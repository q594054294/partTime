package com.example.wechat.controller;

import com.example.wechat.service.manual.CommonsService;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api")
public class CommonController {

    private final CommonsService commonsService;

    public CommonController(CommonsService commonsService) {
        this.commonsService = commonsService;
    }

    @PostMapping("/upload")
    @ApiOperation("图片上传")
    public ResponseEntity<String> uploadImg(MultipartFile file){
        String s = commonsService.upload(file);
        if(s==null){
            return ResponseEntity.ok().header("message","fail").build();
        }
        return ResponseEntity.ok(s);
    }
}
