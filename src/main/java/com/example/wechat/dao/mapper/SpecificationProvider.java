package com.example.wechat.dao.mapper;

import com.example.wechat.domain.Specification;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;

public class SpecificationProvider{

    private final String TABLE_NAME = "specification";

    public String deleteById(final Long id) {
        return new SQL(){
            {
                DELETE_FROM(TABLE_NAME).WHERE("id="+id);
            }
        }.toString();
    }

    public String insert(final Specification record) {
        return new SQL(){
            {
                INSERT_INTO(TABLE_NAME);
                if(record.getSpecification()!=null){
                    VALUES("specification",valueOf(record.getSpecification()));
                }
                if(record.getNumber()!=null){
                    VALUES("number",record.getNumber()+"");
                }
                if(record.getUnit()!=null){
                    VALUES("unit",valueOf(record.getUnit()));
                }
                if(record.getCommodityId()!=null){
                    VALUES("commodity_id",record.getCommodityId()+"");
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

    public String selectAll() {
        return new SQL(){
            {
                SELECT("*").FROM(TABLE_NAME);
            }
        }.toString();
    }

    public String updateById(final Specification record) {
        return new SQL(){
            {
                UPDATE(TABLE_NAME);
                if(record.getSpecification()!=null){
                    SET("specification="+valueOf(record.getSpecification()));
                }
                if(record.getNumber()!=null){
                    SET("number="+record.getNumber()+"");
                }
                if(record.getUnit()!=null){
                    SET("unit="+valueOf(record.getUnit()));
                }
                if(record.getCommodityId()!=null){
                    SET("commodity_id="+record.getCommodityId()+"");
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
