package com.github.frosch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
//@EnableDiscoveryClient
//@EnableZuulProxy
//@EnableCaching
public class ImmoUIApplication {

    public static void main(String... args) {
        SpringApplication.run(ImmoUIApplication.class, args);
    }
}
