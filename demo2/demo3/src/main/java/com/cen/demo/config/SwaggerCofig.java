package com.cen.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ControllerAdvice;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;
@EnableSwagger2
//@ComponentScan(basePackages = "com.cen.demo.controller")
//@ControllerAdvice(basePackages = "com.cen.demo.controller")
@Configuration
public class SwaggerCofig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.cen.demo.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "My API Title",
                "My API Description",
                "API TOS",
                "Terms of service",
                new Contact("Your Name", "www.example.com", "your-email@example.com"),
                "License of API", "API license URL", Collections.emptyList());
    }

}
