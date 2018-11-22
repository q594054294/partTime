package com.example.wechat.dao.mapper;

import com.example.wechat.domain.CommodityDetail;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;


public class CommodityDetailProvider {

    private final String TABLE_NAME = "commoditydetail";

    public String deleteById(final Long id) {
        return new SQL(){
            {
                DELETE_FROM(TABLE_NAME).WHERE("id="+id);
            }
        }.toString();
    }

    public String insert(CommodityDetail record) {
        return new SQL(){
            {
                INSERT_INTO(TABLE_NAME);
                if(record.getName()!=null){
                    VALUES("name",valueOf(record.getName()));
                }
                if(record.getDesc()!=null){
                    VALUES("desc",valueOf(record.getDesc()));
                }
                if(record.getImg()!=null){
                    VALUES("img",valueOf(record.getImg()));
                }
                if (record.getRemark()!=null){
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

    public String updateById(CommodityDetail record) {
        return new SQL(){
            {
                UPDATE(TABLE_NAME);
                if(record.getName()!=null){
                    SET("name="+valueOf(record.getName()));
                }
                if(record.getDesc()!=null){
                    SET("desc="+valueOf(record.getDesc()));
                }
                if(record.getImg()!=null){
                    SET("img="+valueOf(record.getImg()));
                }
                if (record.getRemark()!=null){
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
