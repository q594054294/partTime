package com.example.wechat.controller;

import com.example.wechat.domain.Specification;
import com.example.wechat.service.SpecificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SpecificationController {

    private final SpecificationService specificationService;

    public SpecificationController(SpecificationService specificationService) {
        this.specificationService = specificationService;
    }

    @PostMapping("/speci")
    public ResponseEntity<Integer> save(@RequestBody Specification specification){
        if(specification.getId()!=null){
            return ResponseEntity.ok().header("message","id already").build();
        }
        Integer num = specificationService.insert(specification);
        if(num==0){
            return ResponseEntity.ok().header("message","fail").build();
        }
        return ResponseEntity.ok().header("message","success").build();
    }

    @PutMapping("/speci")
    public ResponseEntity<Integer> update(@RequestBody Specification specification){
        if(specification.getId()==null){
            return ResponseEntity.ok().header("message","id dosen't").build();
        }
        Integer num = specificationService.updateById(specification);
        if(num==0){
            return ResponseEntity.ok().header("message","fail").build();
        }
        return ResponseEntity.ok().header("message","success").build();
    }

    @GetMapping("/speci")
    public ResponseEntity<List<Specification>> getSpeci(Specification specification){
        List<Specification> list = specificationService.selectAll();
        return ResponseEntity.ok(list);
    }
}
