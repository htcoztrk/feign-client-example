package com.testinium.east;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients()
public class EastApplication {

    public static void main(String[] args) {
        SpringApplication.run(EastApplication.class, args);
    }

}
