package com.example.wechat.domain;

import com.example.wechat.domain.ennum.RoleName;
import io.swagger.annotations.ApiModel;

import java.io.Serializable;

@ApiModel("用户")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private String phone;

    private String enterprisenum;

    private String img;

    private String address;

    private Long userclassifyId;

    private Long storeId;

    private RoleName roleName;

    private Integer isDel;

    private Long createdBy;

    private String remark;

    private Integer remark1;

    public User(Long id, String name, String phone, String enterprisenum, String img, String address, Long userclassifyId, Long storeId, RoleName roleName, Integer isDel,Long createdBy, String remark, Integer remark1) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.enterprisenum = enterprisenum;
        this.img = img;
        this.address = address;
        this.userclassifyId = userclassifyId;
        this.storeId = storeId;
        this.roleName = roleName;
        this.isDel = isDel;
        this.createdBy=createdBy;
        this.remark = remark;
        this.remark1 = remark1;
    }

    public User() {
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEnterprisenum() {
        return enterprisenum;
    }

    public void setEnterprisenum(String enterprisenum) {
        this.enterprisenum = enterprisenum == null ? null : enterprisenum.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Long getUserclassifyId() {
        return userclassifyId;
    }

    public void setUserclassifyId(Long userclassifyId) {
        this.userclassifyId = userclassifyId;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public RoleName getRoleName() {
        return roleName;
    }

    public void setRoleName(RoleName roleName) {
        this.roleName = roleName == null ? null : roleName;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
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

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", enterprisenum='" + enterprisenum + '\'' +
                ", img='" + img + '\'' +
                ", address='" + address + '\'' +
                ", userclassifyId=" + userclassifyId +
                ", storeId=" + storeId +
                ", roleName=" + roleName +
                ", isDel=" + isDel +
                ", createdBy=" + createdBy +
                ", remark='" + remark + '\'' +
                ", remark1=" + remark1 +
                '}';
    }
}