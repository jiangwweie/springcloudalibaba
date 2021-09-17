package com.jiangwei.cloud.api.service.impl;

import com.jiangwei.cloud.api.service.DubboHelloService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author jiangwei
 * @date 2021/9/17
 */
@DubboService
public class DubboHelloServiceImpl implements DubboHelloService {

    @Override
    public String sayHi(String msg) {
        return "hello " + msg;
    }
}
