package com.jiangwei.cloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangwei
 * @date 2021/10/23
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelApplication {


    public static void main(String[] args) {
        SpringApplication.run(SentinelApplication.class);
    }

    @Slf4j
    @RestController
    static class TestController {

        //@DubboReference
        //DubboHelloService dubboHelloService;

        @GetMapping("/hello")
        public String hello() {
            return "jiangwei hello ";
        }

    }


}
