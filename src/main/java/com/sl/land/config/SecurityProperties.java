package com.sl.land.config;

import com.sl.land.validate.ImageCodeProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author ShuLu
 */
@Component
@ConfigurationProperties(prefix ="sl")
public class SecurityProperties {
    private ImageCodeProperties code = new ImageCodeProperties();


    public ImageCodeProperties getCode() {
        return code;
    }

    public void setCode(ImageCodeProperties code) {
        this.code = code;
    }
}
