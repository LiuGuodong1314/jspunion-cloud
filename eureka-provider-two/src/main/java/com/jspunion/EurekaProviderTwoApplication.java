package com.jspunion;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@SpringBootApplication(scanBasePackages = "com.jspunion")
@RestController
@RequestMapping
@EnableEurekaClient
public class EurekaProviderTwoApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaProviderTwoApplication.class, args);
    }

    @Value("${message}")
    private String message;

    @RequestMapping
    public Object index() {
        Map<String, Object> map = new HashMap<String, Object>() {{
            put("message", message+":two");
        }};
        return map;
    }
}
