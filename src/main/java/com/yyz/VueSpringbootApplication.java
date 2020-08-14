package com.yyz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yyz.dao")
public class VueSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(VueSpringbootApplication.class, args);
    }

}
