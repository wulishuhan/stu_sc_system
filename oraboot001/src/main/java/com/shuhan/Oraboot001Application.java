package com.shuhan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.shuhan.mapper")
public class Oraboot001Application {

    public static void main(String[] args) {
        SpringApplication.run(Oraboot001Application.class, args);
    }

}
