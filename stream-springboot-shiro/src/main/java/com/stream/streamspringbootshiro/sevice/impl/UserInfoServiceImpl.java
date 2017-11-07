package com.stream.streamspringbootshiro.sevice.impl;

import com.stream.streamspringbootshiro.dao.UserInfoDao;
import com.stream.streamspringbootshiro.entity.UserInfo;
import com.stream.streamspringbootshiro.sevice.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoDao userInfoDao;
    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoDao.findByUsername(username);
    }
}