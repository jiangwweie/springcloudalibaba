package com.jiangwei.cloud.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangwei
 * @date 2021/9/17
 */

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class DiscoveryConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryConfigApplication.class,args);
    }


    @RestController
    @RefreshScope
    static class ConfigDemo {

        @Value("${user-info.name}")
        private String name;

        @Value("${user.name}")
        private String username;

        @Value("${names}")
        private String names;

        @GetMapping("hello")
        public String hello() {
            return "hello " + name;
        }

        @GetMapping("hi")
        public String hi() {
            return "hello " + username;
        }

        @GetMapping("names")
        public String names() {
            return "hello " + names;
        }


    }

}
