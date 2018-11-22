package com.example.wechat.controller;

import com.example.wechat.domain.UserClassify;
import com.example.wechat.service.UserClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserClassifyController {

    @Autowired
    private UserClassifyService userClassifyService;

    @PostMapping("/userClassify")
    public ResponseEntity<Integer> insert(@RequestBody UserClassify userClassify){
        if(userClassify.getId()!=null){
            return ResponseEntity.ok().header("message","id already").build();
        }
        Integer num = userClassifyService.insert(userClassify);
        if(num==0){
            return ResponseEntity.ok().header("message","fail").build();
        }
        return ResponseEntity.ok().header("message","success").build();
    }

    @PutMapping("/userClassify")
    public ResponseEntity<Integer> update(@RequestBody UserClassify userClassify){
        if(userClassify.getId()==null){
            return ResponseEntity.ok().header("message","id dosen't").build();
        }
        Integer num = userClassifyService.updateById(userClassify);
        if(num==0){
            return ResponseEntity.ok().header("message","fail").build();
        }
        return ResponseEntity.ok().header("message","success").build();
    }

    @GetMapping("/userClassify")
    public ResponseEntity<List<UserClassify>> getAll(){
        List<UserClassify> list = userClassifyService.selectAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/userClassify/{id}")
    public ResponseEntity<UserClassify> selectById(@PathVariable("id") Long id){
        UserClassify classify = userClassifyService.selectById(id);
        return ResponseEntity.ok(classify);
    }

    @DeleteMapping("/userClassify")
    public ResponseEntity<Void> deleById(String ids){
        long[] longs = Arrays.stream(ids.split(",")).mapToLong(Long::valueOf).toArray();
        try {
            for (long id : longs){
                userClassifyService.deleteById(id);
            }
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.ok().header("message","in use").build();
        }

        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/userClassify/{id}")
    public ResponseEntity<Void> dele(@PathVariable("id") Long id){
        Integer num = userClassifyService.deleteById(id);
        if(num==0){
            return ResponseEntity.ok().header("message","fail").build();
        }
        return ResponseEntity.ok().header("message","success").build();
    }
}
