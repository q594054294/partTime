package com.example.wechat.service.impl;

import com.example.wechat.dao.StoreMapper;
import com.example.wechat.domain.Store;
import com.example.wechat.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    private StoreMapper storeMapper;

    @Override
    public int deleteById(Long id) {
        return storeMapper.deleteById(id);
    }

    @Override
    public int insert(Store record) {
        return storeMapper.insert(record);
    }

    @Override
    public Store selectById(Long id) {
        return storeMapper.selectById(id);
    }

    @Override
    public List<Store> selectAll() {
        return storeMapper.selectAll();
    }

    @Override
    public int updateById(Store record) {
        return storeMapper.updateById(record);
    }
}
