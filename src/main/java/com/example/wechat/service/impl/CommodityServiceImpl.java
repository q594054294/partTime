package com.example.wechat.service.impl;

import com.example.wechat.dao.CommodityMapper;
import com.example.wechat.domain.Commodity;
import com.example.wechat.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityServiceImpl implements CommodityService {

    @Autowired
    private CommodityMapper commodityMapper;

    @Override
    public int deleteById(Long id) {
        return commodityMapper.deleteById(id);
    }

    @Override
    public int insert(Commodity record) {
        return commodityMapper.insert(record);
    }

    @Override
    public Commodity selectById(Long id) {
        return commodityMapper.selectById(id);
    }

    @Override
    public List<Commodity> selectAll(Commodity commodity) {
        return commodityMapper.selectAll(commodity);
    }

    @Override
    public int updateById(Commodity record) {
        return commodityMapper.updateById(record);
    }
}
