package com.jspunion.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="service-greet")
public interface GreetService {

    @RequestMapping("/")
    Object hello();

}
