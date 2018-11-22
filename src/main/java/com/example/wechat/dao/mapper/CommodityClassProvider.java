package com.example.wechat.dao.mapper;

import com.example.wechat.domain.CommodityClass;
import org.apache.ibatis.jdbc.SQL;

public class CommodityClassProvider {

    private final String TABLE_NAME = "commodityclassify";

    public String deleteById(final Long id) {
        return new SQL(){
            {
                DELETE_FROM(TABLE_NAME).WHERE("id="+id);
            }
        }.toString();
    }

    public String insert(final CommodityClass record) {
        return new SQL(){
            {
                INSERT_INTO(TABLE_NAME);
                if(record.getName()!=null){
                    VALUES("name",valueOf(record.getName()));
                }
                if(record.getStoreId()!=null){
                    VALUES("store_id",record.getStoreId()+"");
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
        return new SQL(){
            {
                SELECT("*").FROM(TABLE_NAME).WHERE("id="+id);
            }
        }.toString();
    }

    public String selectAll(final CommodityClass commodityClass) {
        return new SQL(){
            {
                SELECT("*").FROM(TABLE_NAME);
                WHERE("1=1");
                if(commodityClass.getStoreId()!=null){
                    AND().WHERE("store_id="+commodityClass.getStoreId());
                }
            }
        }.toString();
    }

    public String updateById(final CommodityClass record) {
        return new SQL(){
            {
                UPDATE(TABLE_NAME);
                if(record.getName()!=null){
                    SET("name="+valueOf(record.getName()));
                }
                if(record.getStoreId()!=null){
                    SET("store_id="+record.getStoreId()+"");
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
