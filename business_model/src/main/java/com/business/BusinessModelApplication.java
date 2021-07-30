package com.business;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 易健 071136540
 * @date 2021-7-28 16:47
 * @description
 */
@SpringBootApplication
@MapperScan({"com.business.*.mapper"})
public class BusinessModelApplication {
    public static void main(String[] args) {
        SpringApplication.run(BusinessModelApplication.class, args);
    }
}
