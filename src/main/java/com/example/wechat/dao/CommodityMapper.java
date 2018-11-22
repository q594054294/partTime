package com.example.wechat.dao;

import com.example.wechat.dao.mapper.CommodityProvider;
import com.example.wechat.domain.Commodity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("commodityMapper")
public interface CommodityMapper {
    @DeleteProvider(type = CommodityProvider.class,method = "deleteById")
    int deleteById(Long id);
    @InsertProvider(type = CommodityProvider.class,method = "insert")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    int insert(Commodity record);
    @SelectProvider(type = CommodityProvider.class,method = "selectById")
    Commodity selectById(Long id);
    @SelectProvider(type = CommodityProvider.class,method = "selectAll")
    List<Commodity> selectAll(Commodity commodity);
    @UpdateProvider(type = CommodityProvider.class,method = "updateById")
    int updateById(Commodity record);
}