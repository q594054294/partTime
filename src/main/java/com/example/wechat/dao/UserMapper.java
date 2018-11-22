package com.example.wechat.dao;

import com.example.wechat.dao.mapper.userProvider;
import com.example.wechat.domain.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("userMapper")
public interface UserMapper {
    @DeleteProvider(type = userProvider.class,method = "deleteById")
    int deleteById(final Long id);
    @InsertProvider(type = userProvider.class,method = "insetUser")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    int insert(final User user);
    @SelectProvider(type = userProvider.class,method = "selectById")
    User selectById(final Long id);
    @SelectProvider(type = userProvider.class,method = "selectAll")
    List<User> selectAll(final User user);
    @UpdateProvider(type = userProvider.class,method = "updateUser")
    int updateByPrimaryKey(final User record);
    @SelectProvider(type = userProvider.class,method = "countByExample")
    Long countByExample(final User user);
    @SelectProvider(type = userProvider.class,method = "selectByPhone")
    User login(String phone);
}