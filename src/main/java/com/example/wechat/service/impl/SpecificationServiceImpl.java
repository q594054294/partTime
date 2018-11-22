package com.example.wechat.service.impl;

import com.example.wechat.dao.SpecificationMapper;
import com.example.wechat.domain.Specification;
import com.example.wechat.service.SpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecificationServiceImpl implements SpecificationService {

    @Autowired
    private SpecificationMapper specificationMapper;

    @Override
    public int deleteById(Long id) {
        return specificationMapper.deleteById(id);
    }

    @Override
    public int insert(Specification record) {
        return specificationMapper.insert(record);
    }

    @Override
    public Specification selectById(Long id) {
        return specificationMapper.selectById(id);
    }

    @Override
    public List<Specification> selectAll() {
        return specificationMapper.selectAll();
    }

    @Override
    public int updateById(Specification record) {
        return specificationMapper.updateById(record);
    }
}
