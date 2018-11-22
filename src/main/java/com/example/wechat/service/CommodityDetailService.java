package com.example.wechat.service;

import com.example.wechat.domain.CommodityDetail;

import java.util.List;

public interface CommodityDetailService {

    int deleteById(Long id);

    int insert(CommodityDetail record);

    CommodityDetail selectById(Long id);

    List<CommodityDetail> selectAll();

    int updateById(CommodityDetail record);
}
