package com.example.wechat.aop;

import com.example.wechat.aop.property.File;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "application",ignoreUnknownFields = false)
public class ApplicationProperty {

    private File file;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "ApplicationProperty{" +
                "file=" + file +
                '}';
    }
}
