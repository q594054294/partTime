package com.example.wechat.dao.mapper;

import com.example.wechat.domain.Store;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;

public class StoreProvider {

    private final String TABLE_NAME = "store";

    public String deleteById(final Long id) {
        return new SQL() {
            {
                DELETE_FROM(TABLE_NAME).WHERE("id="+id);
            }
        }.toString();
    }

    public String insert(final Store record) {
        return new SQL() {
            {
                INSERT_INTO(TABLE_NAME);
                if(record.getName()!=null&&record.getName()!=""){
                    VALUES("name",valueOf(record.getName()));
                }
                if(record.getPhone()!=null){
                    VALUES("phone",valueOf(record.getPhone()));
                }
                if(record.getAddress()!=null){
                    VALUES("address",valueOf(record.getAddress()));
                }
                if(record.getImg()!=null){
                    VALUES("img",valueOf(record.getImg()));
                }
                if(record.getCreatedtime()!=null){
                    VALUES("createdTime",record.getCreatedtime().toString());
                }
                if(record.getModifytime()!=null){
                    VALUES("modifyTime",record.getModifytime().toString());
                }
                if(record.getStarttime()!=null){
                    VALUES("startTime",record.getStarttime().toString());
                }
                if(record.getEntime()!=null){
                    VALUES("enTime",record.getEntime().toString());
                }
                if(record.getRemark()!=null){
                    VALUES("remark",valueOf(record.getRemark()));
                }
                if(record.getRemark1()!=null){
                    VALUES("remark1",record.getRemark1()+"");
                }
            }
        }.toString();
    }

    public String selectById(final Long id) {
        return new SQL() {
            {
                SELECT("*").FROM(TABLE_NAME).WHERE("id="+id);
            }
        }.toString();
    }

    public String selectAll() {
        return new SQL() {
            {
                SELECT("*").FROM(TABLE_NAME);
            }
        }.toString();
    }

    public String updateById(final Store record) {
        return new SQL() {
            {
                UPDATE(TABLE_NAME);
                if(record.getName()!=null&&record.getName()!=""){
                    SET("name="+valueOf(record.getName()));
                }
                if(record.getPhone()!=null){
                    SET("phone="+valueOf(record.getPhone()));
                }
                if(record.getAddress()!=null){
                    SET("address="+valueOf(record.getAddress()));
                }
                if(record.getImg()!=null){
                    SET("img="+valueOf(record.getImg()));
                }
                if(record.getCreatedtime()!=null){
                    SET("createdTime="+record.getCreatedtime().toString());
                }
                if(record.getModifytime()!=null){
                    SET("modifyTime="+record.getModifytime().toString());
                }
                if(record.getStarttime()!=null){
                    SET("startTime="+record.getStarttime().toString());
                }
                if(record.getEntime()!=null){
                    SET("enTime="+record.getEntime().toString());
                }
                if(record.getRemark()!=null){
                    SET("remark="+valueOf(record.getRemark()));
                }
                if(record.getRemark1()!=null){
                    SET("remark1="+record.getRemark1()+"");
                }
                WHERE("id="+record.getId());
            }
        }.toString();
    }

    private String valueOf(Object string) {
        return "'" + string + "'";
    }
}
