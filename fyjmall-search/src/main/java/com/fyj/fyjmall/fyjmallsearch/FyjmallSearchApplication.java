package com.fyj.fyjmall.fyjmallsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class FyjmallSearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(FyjmallSearchApplication.class, args);
    }

}
