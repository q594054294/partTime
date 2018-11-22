package com.example.wechat.dao;

import com.example.wechat.dao.mapper.OrderProvider;
import com.example.wechat.domain.Order;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("orderMapper")
public interface OrderMapper {
    @DeleteProvider(type = OrderProvider.class,method = "deleteById")
    int deleteById(Long id);
    @InsertProvider(type = OrderProvider.class,method = "insert")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    int insert(Order record);
    @SelectProvider(type = OrderProvider.class,method = "selectById")
    Order selectById(Long id);
    @SelectProvider(type = OrderProvider.class,method = "selectAll")
    List<Order> selectAll(Order order);
    @UpdateProvider(type = OrderProvider.class,method = "updateById")
    int updateById(Order record);
}