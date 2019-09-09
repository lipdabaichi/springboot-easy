package com.picc.hz2zj4wx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.picc.hz2zj4wx.mapper")
public class Hz2zj4wxApplication {

    public static void main(String[] args) {
        SpringApplication.run(Hz2zj4wxApplication.class, args);
    }

}
