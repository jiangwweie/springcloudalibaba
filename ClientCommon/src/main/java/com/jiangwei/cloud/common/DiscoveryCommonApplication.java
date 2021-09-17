package com.jiangwei.cloud.common;

import com.jiangwei.cloud.common.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangwei
 * @date 2021/9/17
 */

@SpringBootApplication
@EnableDiscoveryClient
@RestController
@EnableFeignClients
public class DiscoveryCommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryCommonApplication.class);
    }


    @Autowired
    HelloService helloService;

    @GetMapping("/test/{name}")
    public String hello(@PathVariable String name) {
        return helloService.helloFeigh(name);
    }


}
