package com.stream.web;

import com.stream.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    public ITestService testService;

    @RequestMapping("/hello")
    public String hello(String name) throws  Exception{
        return testService.hello(name);
    }
}
