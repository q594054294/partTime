package com.example.wechat.dao.mapper;

import com.example.wechat.domain.Order;
import org.apache.ibatis.jdbc.SQL;


public class OrderProvider {

    private final String TABLE_NAME = "order";

    public String deleteById(final Long id) {
        return new SQL(){
            {
                DELETE_FROM(TABLE_NAME).WHERE("id="+id);
            }
        }.toString();
    }

    public String insert(final Order record) {
        return new SQL(){
            {
                INSERT_INTO(TABLE_NAME);
                if(record.getOrderInfo()!=null){
                    VALUES("order_info",valueOf(record.getOrderInfo()));
                }
                if(record.getOrdernum()!=null){
                    VALUES("orderNum",valueOf(record.getOrdernum()));
                }
                if(record.getDes()!=null){
                    VALUES("des",valueOf(record.getDes()));
                }
                if(record.getIsDel()!=null){
                    VALUES("is_del",record.getIsDel()+"");
                }
                if(record.getCreatedtime()!=null){
                    VALUES("createdTime",valueOf(record.getCreatedtime()));
                }
                if (record.getUserId()!=null){
                    VALUES("user_id",record.getUserId()+"");
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

    public String selectAll(final Order order) {
        return new SQL(){
            {
                SELECT("*").FROM(TABLE_NAME);
                WHERE("1=1");
                if(order.getIsDel()!=null){
                    AND().WHERE("is_del="+order.getIsDel());
                }
                if(order.getStoreId()!=null){
                    AND().WHERE("store_id="+order.getStoreId());
                }
            }
        }.toString();
    }

    public String updateById(final Order record) {
        return new SQL(){
            {
                UPDATE(TABLE_NAME);
                if(record.getOrderInfo()!=null){
                    SET("order_info="+valueOf(record.getOrderInfo()));
                }
                if(record.getOrdernum()!=null){
                    SET("orderNum="+valueOf(record.getOrdernum()));
                }
                if(record.getDes()!=null){
                    SET("des="+valueOf(record.getDes()));
                }
                if(record.getIsDel()!=null){
                    SET("is_del="+record.getIsDel()+"");
                }
                if(record.getCreatedtime()!=null){
                    SET("createdTime="+valueOf(record.getCreatedtime()));
                }
                if (record.getUserId()!=null){
                    SET("user_id="+record.getUserId()+"");
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
