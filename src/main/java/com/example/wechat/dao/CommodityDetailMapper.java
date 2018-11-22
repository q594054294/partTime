package com.example.wechat.dao;

import com.example.wechat.dao.mapper.CommodityDetailProvider;
import com.example.wechat.domain.CommodityDetail;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("commodityDetailMapper")
public interface CommodityDetailMapper {
    @DeleteProvider(type = CommodityDetailProvider.class,method = "deleteById")
    int deleteById(Long id);
    @InsertProvider(type = CommodityDetailProvider.class,method = "insert")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    int insert(CommodityDetail record);
    @SelectProvider(type = CommodityDetailProvider.class,method = "selectById")
    CommodityDetail selectById(Long id);
    @SelectProvider(type = CommodityDetailProvider.class,method = "selectAll")
    List<CommodityDetail> selectAll();
    @UpdateProvider(type = CommodityDetailProvider.class,method = "updateById")
    int updateById(CommodityDetail record);
}