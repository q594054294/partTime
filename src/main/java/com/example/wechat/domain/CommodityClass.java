package com.example.wechat.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;

import java.io.Serializable;

@ApiModel("商品分类")
public class CommodityClass implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private Long storeId;

    private String remark;

    private Integer remark1;

    public CommodityClass(Long id, String name, Long storeId, String remark, Integer remark1) {
        this.id = id;
        this.name = name;
        this.storeId = storeId;
        this.remark = remark;
        this.remark1 = remark1;
    }

    public CommodityClass() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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