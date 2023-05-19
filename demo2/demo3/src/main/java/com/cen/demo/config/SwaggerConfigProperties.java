package com.cen.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
@ConfigurationProperties("swagger-properties")
public class SwaggerConfigProperties {
    private String basePackage;
}
