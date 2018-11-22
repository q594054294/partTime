package com.example.wechat.domain;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;
import java.util.Date;

@ApiModel("订单")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String orderInfo;

    private String ordernum;

    private String des;

    private Integer isDel;

    private Date createdtime;

    private Long userId;

    private Long storeId;

    private String remark;

    private Integer remark1;

    public Order(Long id, String orderInfo, String ordernum, String des, Integer isDel, Date createdtime, Long userId, Long storeId, String remark, Integer remark1) {
        this.id = id;
        this.orderInfo = orderInfo;
        this.ordernum = ordernum;
        this.des = des;
        this.isDel = isDel;
        this.createdtime = createdtime;
        this.userId = userId;
        this.storeId = storeId;
        this.remark = remark;
        this.remark1 = remark1;
    }

    public Order() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(String orderInfo) {
        this.orderInfo = orderInfo == null ? null : orderInfo.trim();
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel == null ? null : isDel;
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getRemark1() {
        return remark1;
    }

    public void setRemark1(Integer remark1) {
        this.remark1 = remark1;
    }
}