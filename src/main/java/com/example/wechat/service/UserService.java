package com.example.wechat.service;

import com.example.wechat.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.List;

public interface UserService {

    int deleteUser(Long id);

    int insertUser(User user);

    User selectById(Long id);

    List<User> selectAll(User user);

    int updateUser(User user);

    Long countByExample(User user);

    User selectByPhone(String phone);
}
