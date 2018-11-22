package com.example.wechat.dao.mapper;

import com.example.wechat.domain.User;
import com.sun.org.apache.regexp.internal.RE;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.data.domain.Pageable;

public class userProvider {

    private final String TABLE_NAME="user";

    public String selectAll(final User user) {
        return new SQL() {
            {
                SELECT("*").FROM(TABLE_NAME);
                WHERE("1=1");
                if (user.getName() != null && user.getName() != "") {
                    AND().WHERE("name LIKE %" + user.getName() + "%");
                }
                if(user.getUserclassifyId()!=null){
                    AND().WHERE("userClassify_id="+user.getUserclassifyId());
                }
                ORDER_BY("id");
            }
        }.toString();
    }

    public String insetUser(final User user) {
        return new SQL() {
            {
                INSERT_INTO(TABLE_NAME);
                if (user.getName() != null && user.getName() != "") {
                    VALUES("name", valueOf(user.getName().trim()));
                }
                if (user.getPhone() != null && user.getPhone() != "") {
                    VALUES("phone", valueOf(user.getPhone()));
                }
                if (user.getEnterprisenum() != null && user.getEnterprisenum() != "") {
                    VALUES("enterpriseNum", valueOf(user.getEnterprisenum()));
                }
                if (user.getImg() != null && user.getImg() != "") {
                    VALUES("img", valueOf(user.getImg()));
                }
                if (user.getAddress() != null && user.getAddress() != "") {
                    VALUES("address", valueOf(user.getAddress()));
                }
                if (user.getUserclassifyId() != null) {
                    VALUES("userClassify_id", user.getUserclassifyId() + "");
                }
                if (user.getStoreId() != null) {
                    VALUES("store_id", user.getStoreId() + "");
                }
                if(user.getRoleName()!=null){
                    VALUES("role_name",valueOf(user.getRoleName()));
                }
                if (user.getIsDel() != null) {
                    VALUES("is_del", user.getIsDel() + "");
                }
                if (user.getRemark() != null && user.getRemark() != "") {
                    VALUES("remark", valueOf(user.getRemark()));
                }
                if (user.getRemark1() != null) {
                    VALUES("remark1", user.getRemark1() + "");
                }
                if(user.getCreatedBy()!=null){
                    VALUES("created_by",user.getCreatedBy()+"");
                }
            }
        }.toString();
    }

    public String updateUser(final User user) {
        return new SQL() {
            {
                UPDATE(TABLE_NAME);
                if (user.getName() != null && user.getName() != "") {
                    SET("name=" + valueOf(user.getName()));
                }
                if (user.getPhone() != null && user.getPhone() != "") {
                    SET("phone=" + valueOf(user.getPhone()));
                }
                if (user.getEnterprisenum() != null && user.getEnterprisenum() != "") {
                    SET("enterpriseNum=" + valueOf(user.getEnterprisenum()));
                }
                if (user.getImg() != null && user.getImg() != "") {
                    SET("img=" + valueOf(user.getImg()));
                }
                if (user.getAddress() != null && user.getAddress() != "") {
                    SET("address=" + valueOf(user.getAddress()));
                }
                if (user.getUserclassifyId() != null) {
                    SET("userClassify_id=" + user.getUserclassifyId());
                }
                if (user.getStoreId() != null) {
                    SET("store_id=" + user.getStoreId());
                }
                if(user.getRoleName()!=null){
                    SET("role_name="+valueOf(user.getRoleName()));
                }
                if (user.getIsDel() != null) {
                    SET("is_del=" + user.getIsDel());
                }
                if (user.getRemark() != null && user.getRemark() != "") {
                    SET("remark=" + valueOf(user.getRemark()));
                }
                if (user.getRemark1() != null) {
                    SET("remark1=" + user.getRemark1());
                }
                if(user.getCreatedBy()!=null){
                    SET("created_by="+user.getCreatedBy()+"");
                }
                WHERE("id=" + user.getId());
            }
        }.toString();
    }

    public String selectById(final Long id) {
        return new SQL() {
            {
                SELECT("*").FROM(TABLE_NAME).WHERE("id=" + id);
            }
        }.toString();
    }

    public String deleteById(final Long id) {
        return new SQL() {
            {
                DELETE_FROM(TABLE_NAME).WHERE("id=" + id);
            }
        }.toString();
    }

    public String countByExample(final User user) {
        return new SQL() {
            {
                SELECT("COUNT(id)").FROM(TABLE_NAME);
            }
        }.toString();
    }

    public String selectByPhone(String phone){
        return new SQL(){
            {
                SELECT("*").FROM(TABLE_NAME);
                WHERE("phone="+valueOf(phone)).AND().WHERE("is_del=0");
            }
        }.toString();
    }

    private String valueOf(Object string) {
        return "'" + string + "'";
    }
}
