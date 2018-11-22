package com.example.wechat.dao.mapper;

import com.example.wechat.domain.UserClassify;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;

public class UserClassifyProvider{

    private final String TABLE_NAME="userclassify";

    public String deleteById(final Long id) {
        return new SQL(){
            {
                DELETE_FROM(TABLE_NAME).WHERE("id="+id);
            }
        }.toString();
    }

    public String insert(final UserClassify record) {
        return new SQL(){
            {
                INSERT_INTO(TABLE_NAME);
                if(record.getName()!=null&& record.getName()!=""){
                    VALUES("name",valueOf(record.getName()));
                }
                if(record.getRemark()!=null&&record.getRemark()!=""){
                    VALUES("remark",valueOf(record.getRemark()));
                }
                if(record.getRemark1()!=null){
                    VALUES("remark1",record.getRemark1()+"");
                }
            }
        }.toString();
    }

    public String selectById(final Long id) {
        return new SQL(){
            {
                SELECT("*").FROM(TABLE_NAME).WHERE("id="+id);
            }
        }.toString();
    }

    public String selectAll() {
        return new SQL(){
            {
                SELECT("*").FROM(TABLE_NAME);
            }
        }.toString();
    }

    public String updateById(final UserClassify record) {
        return new SQL(){
            {
                UPDATE(TABLE_NAME);
                if(record.getName()!=null&& record.getName()!=""){
                    SET("name="+valueOf(record.getName()));
                }
                if(record.getRemark()!=null&&record.getRemark()!=""){
                    SET("remark="+valueOf(record.getRemark()));
                }
                if(record.getRemark1()!=null){
                    SET("remark1="+record.getRemark1());
                }
                WHERE("id="+record.getId());
            }
        }.toString();
    }

    private String valueOf(Object string) {
        return "'" + string + "'";
    }
}
