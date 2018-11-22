package com.example.wechat.dao;

import com.example.wechat.dao.mapper.StoreProvider;
import com.example.wechat.domain.Store;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("storeMapper")
public interface StoreMapper {
    @DeleteProvider(type = StoreProvider.class,method = "deleteById")
    int deleteById(Long id);
    @InsertProvider(type = StoreProvider.class,method = "insert")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    int insert(Store record);
    @SelectProvider(type = StoreProvider.class,method = "selectById")
    Store selectById(Long id);
    @SelectProvider(type = StoreProvider.class,method = "selectAll")
    List<Store> selectAll();
    @UpdateProvider(type = StoreProvider.class,method = "updateById")
    int updateById(Store record);
}