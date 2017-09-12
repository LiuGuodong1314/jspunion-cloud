package com.jspunion;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@SpringBootApplication
@RestController
@RequestMapping("/")
@RefreshScope
public class Application {

    @Value("${foo}")
    private String serverHost;

    @RequestMapping
    public Object index() {
        Map<String, Object> map = new HashMap<String, Object>(){{
            put("serverHost",serverHost);
        }};
        return  map;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
