package com.stream.streamspringbootmybatisxml.mapper;

import com.stream.streamspringbootmybatisxml.domain.UserEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    List<UserEntity> getAll();

    UserEntity getOne(Long id);

    void insert(UserEntity user);

    void update(UserEntity user);

    void delete(Long id);

}
