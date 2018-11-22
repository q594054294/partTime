package com.example.wechat.domain;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;

@ApiModel("商品详情")
public class CommodityDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private String desc;

    private String img;

    private String remark;

    private Integer remark1;

    public CommodityDetail(Long id, String name, String desc, String img, String remark, Integer remark1) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.img = img;
        this.remark = remark;
        this.remark1 = remark1;
    }

    public CommodityDetail() {
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
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