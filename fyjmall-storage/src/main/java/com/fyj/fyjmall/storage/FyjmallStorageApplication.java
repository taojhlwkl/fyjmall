package com.fyj.fyjmall.storage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;


@RefreshScope
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class FyjmallStorageApplication {

    public static void main(String[] args) {
        SpringApplication.run(FyjmallStorageApplication.class, args);
    }

}
