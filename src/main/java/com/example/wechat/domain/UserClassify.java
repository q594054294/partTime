package com.example.wechat.domain;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;

@ApiModel("用户分类")
public class UserClassify implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private String remark;

    private Integer remark1;

    public UserClassify(Long id, String name, String remark, Integer remark1) {
        this.id = id;
        this.name = name;
        this.remark = remark;
        this.remark1 = remark1;
    }

    public UserClassify() {
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

    @Override
    public String toString() {
        return "UserClassify{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", remark='" + remark + '\'' +
                ", remark1=" + remark1 +
                '}';
    }
}