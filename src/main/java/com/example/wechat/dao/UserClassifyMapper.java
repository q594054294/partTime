package com.example.wechat.dao;

import com.example.wechat.dao.mapper.UserClassifyProvider;
import com.example.wechat.domain.UserClassify;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("userClassifyMapper")
public interface UserClassifyMapper {
    @DeleteProvider(type = UserClassifyProvider.class,method = "deleteById")
    int deleteById(Long id);
    @InsertProvider(type = UserClassifyProvider.class,method = "insert")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    int insert(UserClassify record);
    @SelectProvider(type = UserClassifyProvider.class,method = "selectById")
    UserClassify selectById(Long id);
    @SelectProvider(type = UserClassifyProvider.class,method = "selectAll")
    List<UserClassify> selectAll();
    @UpdateProvider(type = UserClassifyProvider.class,method = "updateById")
    int updateById(UserClassify record);
}