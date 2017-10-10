package com.stream.service;

import org.springframework.stereotype.Service;


@Service("testService")
public class TestServiceImpl implements ITestService {

    @Override
    public String hello(String name) throws Exception {
        return name +" hello!";
    }
}
