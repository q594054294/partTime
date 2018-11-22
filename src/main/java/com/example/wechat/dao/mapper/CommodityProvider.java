package com.example.wechat.dao.mapper;

import com.example.wechat.domain.Commodity;
import org.apache.ibatis.jdbc.SQL;

public class CommodityProvider {

    private final String TABLE_NAME = "commodity";

    public String deleteById(final Long id) {
        return new SQL(){
            {
                DELETE_FROM(TABLE_NAME).WHERE("id="+id);
            }
        }.toString();
    }

    public String insert(final Commodity record) {
        return new SQL(){
            {
                INSERT_INTO(TABLE_NAME);
                if(record.getTittle()!=null){
                    VALUES("tittle",valueOf(record.getTittle()));
                }
                if(record.getImg()!=null){
                    VALUES("img",valueOf(record.getImg()));
                }
                if(record.getClassifyId()!=null){
                    VALUES("classify_id",record.getClassifyId()+"");
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

    public String selectAll(final Commodity commodity) {
        return new SQL(){
            {
                SELECT("*").FROM(TABLE_NAME);
                WHERE("1=1");
                if(commodity.getStoreId()!=null){
                    AND().WHERE("store_id="+commodity.getStoreId());
                }
                if(commodity.getClassifyId()!=null){
                    AND().WHERE("classify_id="+commodity.getClassifyId());
                }
            }
        }.toString();
    }

    public String updateById(final Commodity record) {
        return new SQL(){
            {
                UPDATE(TABLE_NAME);
                if(record.getTittle()!=null){
                    SET("tittle="+valueOf(record.getTittle()));
                }
                if(record.getImg()!=null){
                    SET("img="+valueOf(record.getImg()));
                }
                if(record.getClassifyId()!=null){
                    SET("classify_id="+record.getClassifyId()+"");
                }
                if(record.getRemark()!=null){
                    SET("remark="+valueOf(record.getRemark()));
                }
                if(record.getRemark1()!=null){
                    SET("remark1="+record.getRemark1()+"");
                }
            }
        }.toString();
    }

    private String valueOf(Object string) {
        return "'" + string + "'";
    }
}
