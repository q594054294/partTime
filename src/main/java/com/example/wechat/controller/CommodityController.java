package com.example.wechat.controller;

import com.example.wechat.domain.Commodity;
import com.example.wechat.domain.CommodityClass;
import com.example.wechat.domain.Store;
import com.example.wechat.domain.manual.StoreDTO;
import com.example.wechat.service.CommodityClassService;
import com.example.wechat.service.CommodityService;
import com.example.wechat.service.StoreService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CommodityController {

    private final CommodityService commodityService;

    private final CommodityClassService commodityClassService;

    private final StoreService storeService;

    public CommodityController(CommodityService commodityService, CommodityClassService commodityClassService, StoreService storeService) {
        this.commodityService = commodityService;
        this.commodityClassService = commodityClassService;
        this.storeService = storeService;
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


    @GetMapping("/commodity/store/{id}")
    public ResponseEntity<StoreDTO> getDetail(@PathVariable("id") Long id){
        StoreDTO storeDTO = new StoreDTO();
        Store store = storeService.selectById(id);
        Commodity commodity = new Commodity();
        commodity.setStoreId(id);
        List<Commodity> commodityList = commodityService.selectAll(commodity);
        CommodityClass commodityClass = new CommodityClass();
        commodityClass.setStoreId(id);
        List<CommodityClass> commodityClassList = commodityClassService.selectAll(commodityClass);
        storeDTO.setCommodity(commodityList);
        storeDTO.setCommodityClasses(commodityClassList);
        storeDTO.setStore(store);
        return ResponseEntity.ok(storeDTO);
    }
}
