package com.example.wechat.service.impl;

import com.example.wechat.dao.OrderMapper;
import com.example.wechat.domain.Order;
import com.example.wechat.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public int deleteById(Long id) {
        return orderMapper.deleteById(id);
    }

    @Override
    public int insert(Order record) {
        return orderMapper.insert(record);
    }

    @Override
    public Order selectById(Long id) {
        return orderMapper.selectById(id);
    }

    @Override
    public List<Order> selectAll(Order order) {
        return orderMapper.selectAll(order);
    }

    @Override
    public int updateById(Order record) {
        return orderMapper.updateById(record);
    }
}
