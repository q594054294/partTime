package com.example.wechat.service;

import com.example.wechat.domain.Order;

import java.util.List;

public interface OrderService {

    int deleteById(Long id);

    int insert(Order record);

    Order selectById(Long id);

    List<Order> selectAll(Order order);

    int updateById(Order record);
}
