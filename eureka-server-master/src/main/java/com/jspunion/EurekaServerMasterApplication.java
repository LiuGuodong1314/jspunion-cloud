package com.jspunion;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication(scanBasePackages = "com.jspunion")
@EnableEurekaServer
public class EurekaServerMasterApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerMasterApplication.class, args);
    }
}
