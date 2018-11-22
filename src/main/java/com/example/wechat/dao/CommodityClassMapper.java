package com.example.wechat.dao;

import com.example.wechat.dao.mapper.CommodityClassProvider;
import com.example.wechat.domain.CommodityClass;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("commodityClassMapper")
public interface CommodityClassMapper {
    @DeleteProvider(type = CommodityClassProvider.class,method = "deleteById")
    int deleteById(Long id);
    @InsertProvider(type = CommodityClassProvider.class,method = "insert")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    int insert(CommodityClass record);
    @SelectProvider(type = CommodityClassProvider.class,method = "selectById")
    CommodityClass selectById(Long id);
    @SelectProvider(type = CommodityClassProvider.class,method = "selectAll")
    List<CommodityClass> selectAll(CommodityClass commodityClass);
    @UpdateProvider(type = CommodityClassProvider.class,method = "updateById")
    int updateById(CommodityClass record);
}