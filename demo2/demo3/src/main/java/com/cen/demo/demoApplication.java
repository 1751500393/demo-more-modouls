package com.cen.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//MapperScan指定当前项目中的Mapper接口路径位置.让mapper接口自动加载
@MapperScan("com.cen.demo.mapper")
public class demoApplication {
    public static void main(String[] args) {
        SpringApplication.run(demoApplication.class, args);

    }
}
