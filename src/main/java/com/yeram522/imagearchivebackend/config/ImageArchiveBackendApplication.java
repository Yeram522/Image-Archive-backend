package com.yeram522.imagearchivebackend.config;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.yeram522.imagearchivebackend")
@MapperScan( basePackages = "com.yeram522.imagearchivebackend", annotationClass = Mapper.class)
public class ImageArchiveBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImageArchiveBackendApplication.class, args);
    }

}
