package com.example.carauction;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.carauction")
@SpringBootApplication
public class CarAuctionApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarAuctionApplication.class, args);
    }

}
