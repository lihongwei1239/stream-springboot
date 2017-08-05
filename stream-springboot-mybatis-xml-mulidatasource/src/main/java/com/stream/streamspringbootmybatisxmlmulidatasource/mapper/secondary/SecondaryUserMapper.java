package com.stream.streamspringbootmybatisxmlmulidatasource.mapper.secondary;

import com.stream.streamspringbootmybatisxmlmulidatasource.domain.secondary.UserEntity;

import java.util.List;

public interface SecondaryUserMapper {

    List<UserEntity> getAll();

    UserEntity getOne(Long id);

    void insert(UserEntity user);

    void update(UserEntity user);

    void delete(Long id);

}
