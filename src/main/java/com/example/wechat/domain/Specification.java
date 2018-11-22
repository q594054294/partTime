package com.example.wechat.domain;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;

@ApiModel("规格")
public class Specification implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String specification;

    private Integer number;

    private String unit;

    private Long commodityId;

    private String remark;

    private Integer remark1;

    public Specification(Long id, String specification, Integer number, String unit, Long commodityId, String remark, Integer remark1) {
        this.id = id;
        this.specification = specification;
        this.number = number;
        this.unit = unit;
        this.commodityId = commodityId;
        this.remark = remark;
        this.remark1 = remark1;
    }

    public Specification() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Long getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Long commodityId) {
        this.commodityId = commodityId;
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