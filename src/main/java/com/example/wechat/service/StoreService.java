package com.example.wechat.service;

import com.example.wechat.domain.Store;

import java.util.List;

public interface StoreService {

    int deleteById(Long id);

    int insert(Store record);

    Store selectById(Long id);

    List<Store> selectAll();

    int updateById(Store record);
}
