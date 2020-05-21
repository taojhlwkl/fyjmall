package com.fyj.fyjmall.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.fyj.fyjmall.product.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class FyjmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(FyjmallProductApplication.class, args);
    }

}
