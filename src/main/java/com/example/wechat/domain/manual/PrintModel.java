package com.example.wechat.domain.manual;

import java.awt.*;
import java.io.Serializable;

public class PrintModel implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private String val;

    private Boolean isWrap = false;

    private Image image;

    public PrintModel(String name, String val) {
        this.name = name;
        this.val = val;
    }

    public PrintModel(String name, String val, Boolean isWrap) {
        this.name = name;
        this.val = val;
        this.isWrap = isWrap;
    }

    public PrintModel(String name, String val, Boolean isWrap, Image image) {
        this.name = name;
        this.val = val;
        this.isWrap = isWrap;
        this.image = image;
    }

    public PrintModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public Boolean getWrap() {
        return isWrap;
    }

    public void setWrap(Boolean wrap) {
        isWrap = wrap;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
