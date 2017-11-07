package com.stream.streamspringbootshiro.sevice;

import com.stream.streamspringbootshiro.entity.UserInfo;

public interface UserInfoService {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}