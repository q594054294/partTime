package com.example.wechat.domain;

import io.swagger.annotations.ApiModel;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.sql.Time;
import java.time.ZonedDateTime;
import java.util.Date;

@ApiModel("店铺")
public class Store implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private String address;

    private String phone;

    private String des;

    private String img;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createdtime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date modifytime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date starttime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date entime;

    private String remark;

    private Integer remark1;

    public Store(Long id, String name, String address, String phone, String des, String img, Date createdtime, Date modifytime, Date starttime, Date entime, String remark, Integer remark1) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.des = des;
        this.img = img;
        this.createdtime = createdtime;
        this.modifytime = modifytime;
        this.starttime = starttime;
        this.entime = entime;
        this.remark = remark;
        this.remark1 = remark1;
    }

    public Store() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEntime() {
        return entime;
    }

    public void setEntime(Date entime) {
        this.entime = entime;
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