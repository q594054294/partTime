package com.example.wechat.controller;

import com.example.wechat.domain.CommodityDetail;
import com.example.wechat.service.CommodityDetailService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CommodityDetailController {

    private final CommodityDetailService commodityDetailService;

    public CommodityDetailController(CommodityDetailService commodityDetailService) {
        this.commodityDetailService = commodityDetailService;
    }

    @PostMapping("/detail")
    public ResponseEntity<Integer> save(@RequestBody CommodityDetail commodityDetail){
        if(commodityDetail.getId()!=null){
            return ResponseEntity.ok().header("message","id already").build();
        }
        Integer num = commodityDetailService.insert(commodityDetail);
        if(num==0){
            return ResponseEntity.ok().header("message","fail").build();
        }
        return ResponseEntity.ok().header("message","success").build();
    }

    @PutMapping("/detail")
    public ResponseEntity<Integer> update(@RequestBody CommodityDetail commodityDetail){
        if(commodityDetail.getId()!=null){
            return ResponseEntity.ok().header("message","id dosen't").build();
        }
        Integer num = commodityDetailService.updateById(commodityDetail);
        if(num==0){
            return ResponseEntity.ok().header("message","fail").build();
        }
        return ResponseEntity.ok().header("message","success").build();
    }

    @GetMapping("/detail")
    public ResponseEntity<List<CommodityDetail>> getAll(){
        return ResponseEntity.ok(commodityDetailService.selectAll());
    }
}
