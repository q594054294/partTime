package com.example.wechat.service;

import com.example.wechat.domain.UserClassify;

import java.util.List;

public interface UserClassifyService {
    int deleteById(Long id);

    int insert(UserClassify record);

    UserClassify selectById(Long id);

    List<UserClassify> selectAll();

    int updateById(UserClassify record);
}
