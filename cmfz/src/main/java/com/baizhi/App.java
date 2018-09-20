package com.baizhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by skl on 2018/6/11.
 */
@SpringBootApplication
@MapperScan("com.baizhi.dao")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
        System.out.println(111111);
    }
}
