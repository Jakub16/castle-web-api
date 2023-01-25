package com.castle.webapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.castle")
public class CastleWebApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CastleWebApiApplication.class, args);
    }

}
