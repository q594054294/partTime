package com.example.wechat.aop.property;

public class File {

    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "File{" +
                "path='" + path + '\'' +
                '}';
    }
}
