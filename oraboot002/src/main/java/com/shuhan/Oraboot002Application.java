package com.shuhan;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.shuhan.mapper")
public class Oraboot002Application {

    public static void main(String[] args) {
        SpringApplication.run(Oraboot002Application.class, args);
    }

}
