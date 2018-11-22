package com.example.wechat.service.manual;

import org.springframework.web.multipart.MultipartFile;

public interface CommonsService {

    String upload(MultipartFile file);
}
