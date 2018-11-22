package com.example.wechat.service.impl;

import com.example.wechat.dao.CommodityDetailMapper;
import com.example.wechat.domain.CommodityDetail;
import com.example.wechat.service.CommodityDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityDetailServiceImpl implements CommodityDetailService {

    @Autowired
    private CommodityDetailMapper commodityDetailMapper;

    @Override
    public int deleteById(Long id) {
        return commodityDetailMapper.deleteById(id);
    }

    @Override
    public int insert(CommodityDetail record) {
        return commodityDetailMapper.insert(record);
    }

    @Override
    public CommodityDetail selectById(Long id) {
        return commodityDetailMapper.selectById(id);
    }

    @Override
    public List<CommodityDetail> selectAll() {
        return commodityDetailMapper.selectAll();
    }

    @Override
    public int updateById(CommodityDetail record) {
        return commodityDetailMapper.updateById(record);
    }
}
