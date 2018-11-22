package com.example.wechat.controller;

import com.example.wechat.domain.Commodity;
import com.example.wechat.service.CommodityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CommodityController {

    private final CommodityService commodityService;

    public CommodityController(CommodityService commodityService) {
        this.commodityService = commodityService;
    }

    @PostMapping("/commodity")
    public ResponseEntity<Integer> save(@RequestBody Commodity commodity){
        if (commodity.getId()!=null){
            return ResponseEntity.ok().header("message","id already").build();
        }
        Integer num = commodityService.insert(commodity);
        if(num==0){
            return ResponseEntity.ok().header("message","fail").build();
        }
        return ResponseEntity.ok().header("message","success").build();
    }

    @PutMapping("/commodity")
    public ResponseEntity<Integer> update(@RequestBody Commodity commodity){
        if (commodity.getId()!=null){
            return ResponseEntity.ok().header("message","id dosen't").build();
        }
        Integer num = commodityService.updateById(commodity);
        if(num==0){
            return ResponseEntity.ok().header("message","fail").build();
        }
        return ResponseEntity.ok().header("message","success").build();
    }

    @GetMapping("/commodity")
    public ResponseEntity<List<Commodity>> getAll(Commodity commodity){
        return ResponseEntity.ok(commodityService.selectAll(commodity));
    }

}
