package com.jiangwei.cloud.api.controller;

import com.jiangwei.cloud.api.service.DubboHelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangwei
 * @date 2021/9/17
 */
@RestController
@RequestMapping("/dubbo")
public class Controller {

    @DubboReference
    DubboHelloService dubboHelloService;

    @GetMapping("/{msg}")
    public String hello(@PathVariable String msg) {
        return dubboHelloService.sayHi(msg);
    }

}
