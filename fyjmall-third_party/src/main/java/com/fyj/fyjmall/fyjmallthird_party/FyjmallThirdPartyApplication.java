package com.fyj.fyjmall.fyjmallthird_party;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class FyjmallThirdPartyApplication {

    public static void main(String[] args) {
        SpringApplication.run(FyjmallThirdPartyApplication.class, args);
    }

}
