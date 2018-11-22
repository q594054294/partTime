package com.example.wechat.controller;

import com.example.wechat.domain.User;
import com.example.wechat.service.UserService;
import com.example.wechat.service.manual.CommonsService;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
@Api(value = "用户控制", tags = "用户控制")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getUser")
    @ApiOperation("获取所有用户")
    public ResponseEntity<List<User>> getUser(User user){
        return ResponseEntity.ok(userService.selectAll(user));
    }

    @PostMapping("/addUser")
    @ApiOperation("添加用户")
    public ResponseEntity<Integer> addUser(@RequestBody User user){
        return ResponseEntity.ok(userService.insertUser(user));
    }

    @PutMapping("/updateUser")
    @ApiOperation("修改用户")
    public ResponseEntity<Integer> updateUser(@RequestBody User user){
        if(user.getId()==null){
            Integer result = userService.insertUser(user);
            if(result>0) {
                return ResponseEntity.ok().header("message", "add success").build();
            }else{
                return ResponseEntity.ok().header("message","add fail").build();
            }
        }else{
            return ResponseEntity.ok(userService.updateUser(user));
        }
    }

    @DeleteMapping("/deleUser")
    @ApiOperation("删除用户")
    public ResponseEntity<Void> deleUser(String ids){
        long[] longs = Arrays.stream(ids.split(",")).mapToLong(Long :: valueOf).toArray();
        try {
            for (long id : longs) {
                userService.deleteUser(id);
            }
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.ok().header("message","in use").build();
        }
        return ResponseEntity.ok().build();
    }

    @GetMapping("/pageUser")
    @ApiOperation("分页")
    public ResponseEntity<List<User>> page(User user, int page,int size){
        PageHelper.startPage(page,size);
        List<User> list = userService.selectAll(user);
        return ResponseEntity.ok(list);
    }

    @PostMapping("/login")
    @ApiOperation("登录")
    public ResponseEntity<User> login(String phone,String enterpriseNum,HttpServletRequest request){
        User user = userService.selectByPhone(phone);
        if(user==null){
            return ResponseEntity.status(504).build();
        }else{
            if(user.getEnterprisenum().equals(enterpriseNum)){
                HttpSession session = request.getSession();
                session.setAttribute("user",user);
                return ResponseEntity.ok(user);
            }else{
                return ResponseEntity.status(504).build();
            }
        }
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> selectById(@PathVariable("id") Long id){
        User user = userService.selectById(id);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<Integer> deleById(@PathVariable("id") Long id){
        Integer num = userService.deleteUser(id);
        if(num==0){
            return ResponseEntity.ok().header("message","fail").build();
        }
        return ResponseEntity.ok().header("message","success").build();
    }
}
