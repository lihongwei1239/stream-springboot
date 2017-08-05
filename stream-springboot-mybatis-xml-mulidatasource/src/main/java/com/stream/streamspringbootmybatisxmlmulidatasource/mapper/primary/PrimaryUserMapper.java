package com.stream.streamspringbootmybatisxmlmulidatasource.mapper.primary;


import com.stream.streamspringbootmybatisxmlmulidatasource.domain.primary.UserEntity;

import java.util.List;

public interface PrimaryUserMapper {

    List<UserEntity> getAll();

    UserEntity getOne(Long id);

    void insert(UserEntity user);

    void update(UserEntity user);

    void delete(Long id);

}
