package com.example.wechat.service.impl;

import com.example.wechat.dao.UserClassifyMapper;
import com.example.wechat.domain.UserClassify;
import com.example.wechat.service.UserClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserClassifyServiceImpl implements UserClassifyService {

    @Autowired
    private UserClassifyMapper userClassifyMapper;

    @Override
    public int deleteById(Long id) {
        return userClassifyMapper.deleteById(id);
    }

    @Override
    public int insert(UserClassify record) {
        return userClassifyMapper.insert(record);
    }

    @Override
    public UserClassify selectById(Long id) {
        return userClassifyMapper.selectById(id);
    }

    @Override
    public List<UserClassify> selectAll() {
        return userClassifyMapper.selectAll();
    }

    @Override
    public int updateById(UserClassify record) {
        return userClassifyMapper.updateById(record);
    }
}
