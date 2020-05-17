package com.fyj.fyjmall.storage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@RefreshScope
@SpringBootApplication
public class FyjmallStorageApplication {

    public static void main(String[] args) {
        SpringApplication.run(FyjmallStorageApplication.class, args);
    }

}
