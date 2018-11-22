package com.example.wechat.dao;

import com.example.wechat.dao.mapper.SpecificationProvider;
import com.example.wechat.domain.Specification;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("specificationMapper")
public interface SpecificationMapper {
    @DeleteProvider(type = SpecificationProvider.class,method = "deleteById")
    int deleteById(Long id);
    @InsertProvider(type = SpecificationProvider.class,method = "insert")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    int insert(Specification record);
    @SelectProvider(type = SpecificationProvider.class,method = "selectById")
    Specification selectById(Long id);
    @SelectProvider(type = SpecificationProvider.class,method = "selectAll")
    List<Specification> selectAll();
    @UpdateProvider(type = SpecificationProvider.class,method = "updateById")
    int updateById(Specification record);
}