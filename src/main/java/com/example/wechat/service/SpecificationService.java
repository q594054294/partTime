package com.example.wechat.service;

import com.example.wechat.domain.Specification;

import java.util.List;

public interface SpecificationService {

    int deleteById(Long id);

    int insert(Specification record);

    Specification selectById(Long id);

    List<Specification> selectAll();

    int updateById(Specification record);
}
