package com.stream.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.stream.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    //@Autowired
    @Reference(version = "1.0.0")
    public ITestService testService;

    @RequestMapping("/hello")
    public String hello(String name) throws  Exception{
        return testService.hello(name);
    }
}
