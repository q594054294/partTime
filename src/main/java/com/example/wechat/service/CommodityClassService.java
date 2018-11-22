package com.example.wechat.service;

import com.example.wechat.domain.CommodityClass;

import java.util.List;

public interface CommodityClassService {

    int deleteById(Long id);

    int insert(CommodityClass record);

    CommodityClass selectById(Long id);

    List<CommodityClass> selectAll(CommodityClass commodityClass);

    int updateById(CommodityClass record);
}
