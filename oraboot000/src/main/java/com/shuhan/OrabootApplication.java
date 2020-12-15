package com.shuhan;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.shuhan.mapper")
public class OrabootApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrabootApplication.class, args);
    }

}
