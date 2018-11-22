package com.example.wechat.controller;

import com.example.wechat.Utils.OrderUtils;
import com.example.wechat.domain.Order;
import com.example.wechat.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/orderNum")
    public ResponseEntity<String> getOrderNum(){
        String orderNum = OrderUtils.getOrderNum();
        return ResponseEntity.ok(orderNum);
    }

    @PostMapping("/order")
    public ResponseEntity<Integer> save(@RequestBody Order order){
        if(order.getId()!=null){
            return ResponseEntity.ok().header("message","id already").build();
        }
        Integer num = orderService.insert(order);
        if(num==0){
            return ResponseEntity.ok().header("message","fail").build();
        }
        return ResponseEntity.ok().header("message","success").build();
    }

    @PutMapping("/order")
    public ResponseEntity<Integer> update(@RequestBody Order order){
        if(order.getId()==null){
            return ResponseEntity.ok().header("message","id dosen't").build();
        }
        Integer num = orderService.updateById(order);
        if(num==0){
            return ResponseEntity.ok().header("message","fail").build();
        }
        return ResponseEntity.ok().header("message","success").build();
    }

    @GetMapping("/oreder")
    public ResponseEntity<List<Order>> getAll(Order order){
        List<Order> list = orderService.selectAll(order);
        return ResponseEntity.ok(list);
    }
}
