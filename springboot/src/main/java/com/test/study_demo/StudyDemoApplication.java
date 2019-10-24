package com.test.study_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.test.study_demo.bussiness.mapper")
public class StudyDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyDemoApplication.class, args);
    }

}
