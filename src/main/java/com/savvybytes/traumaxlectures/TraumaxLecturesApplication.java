package com.savvybytes.traumaxlectures;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TraumaxLecturesApplication {

    public static void main(String[] args) {
        SpringApplication.run(TraumaxLecturesApplication.class, args);
    }

}
