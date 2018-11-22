package com.example.wechat.domain;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;

@ApiModel("商品")
public class Commodity implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String tittle;

    private String img;

    private Long classifyId;

    private Long storeId;

    private String remark;

    private Integer remark1;

    public Commodity(Long id, String tittle, String img, Long classifyId,Long storeId, String remark, Integer remark1) {
        this.id = id;
        this.tittle = tittle;
        this.img = img;
        this.classifyId = classifyId;
        this.storeId=storeId;
        this.remark = remark;
        this.remark1 = remark1;
    }

    public Commodity() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle == null ? null : tittle.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public Long getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(Long classifyId) {
        this.classifyId = classifyId;
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

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }
}