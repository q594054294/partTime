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
public class StoreController {

    private final StoreService storeService;

    private final CommodityService commodityService;

    private final CommodityClassService commodityClassService;

    public StoreController(StoreService storeService, CommodityService commodityService, CommodityClassService commodityClassService) {
        this.storeService = storeService;
        this.commodityService = commodityService;
        this.commodityClassService = commodityClassService;
    }


    @PostMapping("/store")
    public ResponseEntity<Integer> addStore(@RequestBody Store store){
        if(store.getId()!=null){
            return ResponseEntity.ok().header("message","id already").build();
        }
        Integer num = storeService.insert(store);
        if(num==0){
            return ResponseEntity.ok().header("message","fail").build();
        }
        return ResponseEntity.ok().header("message","success").build();
    }

    @PutMapping("/store")
    public ResponseEntity<Integer> updateStore(@RequestBody Store store){
        if(store.getId()!=null){
            return ResponseEntity.ok().header("message","id dosen't").build();
        }
        Integer num = storeService.updateById(store);
        if(num==0){
            return ResponseEntity.ok().header("message","fail").build();
        }
        return ResponseEntity.ok().header("message","success").build();
    }

    @GetMapping("/store")
    public ResponseEntity<List<Store>> getAll(){
        return ResponseEntity.ok(storeService.selectAll());
    }

    @GetMapping("/store/{id}")
    public ResponseEntity<Store> findOne(@PathVariable("id") Long id){
//        StoreDTO storeDTO = new StoreDTO();
        Store store = storeService.selectById(id);
//        Commodity commodity = new Commodity();
//        commodity.setStoreId(id);
//        List<Commodity> commodityList = commodityService.selectAll(commodity);
//        CommodityClass commodityClass = new CommodityClass();
//        commodityClass.setStoreId(id);
//        List<CommodityClass> commodityClassList = commodityClassService.selectAll(commodityClass);
//        storeDTO.setCommodity(commodityList);
//        storeDTO.setCommodityClasses(commodityClassList);
//        storeDTO.setStore(store);
        return ResponseEntity.ok(store);
    }


}
