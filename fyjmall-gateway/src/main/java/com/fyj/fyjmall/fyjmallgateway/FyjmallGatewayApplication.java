package com.fyj.fyjmall.fyjmallgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class FyjmallGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(FyjmallGatewayApplication.class, args);
    }

}
