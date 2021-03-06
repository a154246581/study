package com.jp.test.regist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RegistApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistApplication.class, args);
    }

}
