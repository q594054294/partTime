package com.example.wechat.service.impl;

import com.example.wechat.dao.CommodityClassMapper;
import com.example.wechat.domain.CommodityClass;
import com.example.wechat.service.CommodityClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityClassServiceImpl implements CommodityClassService {

    @Autowired
    private CommodityClassMapper commodityClassMapper;

    @Override
    public int deleteById(Long id) {
        return commodityClassMapper.deleteById(id);
    }

    @Override
    public int insert(CommodityClass record) {
        return commodityClassMapper.insert(record);
    }

    @Override
    public CommodityClass selectById(Long id) {
        return commodityClassMapper.selectById(id);
    }

    @Override
    public List<CommodityClass> selectAll(CommodityClass commodityClass) {
        return commodityClassMapper.selectAll(commodityClass);
    }

    @Override
    public int updateById(CommodityClass record) {
        return commodityClassMapper.updateById(record);
    }
}
