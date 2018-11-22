package com.example.wechat.service;

import com.example.wechat.domain.Commodity;

import java.util.List;

public interface CommodityService {

    int deleteById(Long id);

    int insert(Commodity record);

    Commodity selectById(Long id);

    List<Commodity> selectAll(Commodity commodity);

    int updateById(Commodity record);
}
