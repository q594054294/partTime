package com.example.wechat.controller;

import com.example.wechat.domain.CommodityClass;
import com.example.wechat.service.CommodityClassService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CommodityClassController {

    private final CommodityClassService commodityClassService;

    public CommodityClassController(CommodityClassService commodityClassService) {
        this.commodityClassService = commodityClassService;
    }

    @PostMapping("/class")
    public ResponseEntity<Integer> save(@RequestBody CommodityClass commodityClass){
        if (commodityClass.getId()!=null){
            return ResponseEntity.ok().header("message","id already").build();
        }
        Integer num = commodityClassService.insert(commodityClass);
        if(num==0){
            return ResponseEntity.ok().header("message","fail").build();
        }
        return ResponseEntity.ok().header("message","success").build();
    }

    @PutMapping("/class")
    public ResponseEntity<Integer> update(@RequestBody CommodityClass commodityClass){
        if (commodityClass.getId()!=null){
            return ResponseEntity.ok().header("message","id dosen't").build();
        }
        Integer num = commodityClassService.updateById(commodityClass);
        if(num==0){
            return ResponseEntity.ok().header("message","fail").build();
        }
        return ResponseEntity.ok().header("message","success").build();
    }

    @GetMapping("/class")
    public ResponseEntity<List<CommodityClass>> getAll(CommodityClass commodityClass){
        return ResponseEntity.ok(commodityClassService.selectAll(commodityClass));
    }
}
