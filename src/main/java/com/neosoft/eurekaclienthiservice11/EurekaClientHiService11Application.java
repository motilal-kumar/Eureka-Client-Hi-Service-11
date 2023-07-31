package com.neosoft.eurekaclienthiservice11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientHiService11Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientHiService11Application.class, args);
    }

}
