package com.spring.cloud.config.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class ClientDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientDemoApplication.class,args);
    }

}
