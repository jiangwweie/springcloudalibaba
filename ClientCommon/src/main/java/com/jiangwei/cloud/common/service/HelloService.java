package com.jiangwei.cloud.common.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author jiangwei
 * @date 2021/9/17
 */
@FeignClient("discovery-client")
public interface HelloService {


    /**
     * @param name
     * @return
     */
    @GetMapping("/hello/{name}")
    String helloFeigh(@PathVariable String name);
}
