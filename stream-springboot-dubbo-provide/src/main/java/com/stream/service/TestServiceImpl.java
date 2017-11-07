package com.stream.service;


import com.alibaba.dubbo.config.annotation.Service;

//@Service("testService")
@Service(version = "1.0.0")
public class TestServiceImpl implements ITestService {

    @Override
    public String hello(String name) throws Exception {
        return name +" hello!";
    }
}
