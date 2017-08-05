package com.stream.streamspringbootmybatisxmlmulidatasource;

import com.stream.streamspringbootmybatisxmlmulidatasource.domain.primary.UserEntity;
import com.stream.streamspringbootmybatisxmlmulidatasource.enums.UserSexEnum;
import com.stream.streamspringbootmybatisxmlmulidatasource.mapper.primary.PrimaryUserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PrimaryPrimaryUserMapperTest {

    @Autowired
    public PrimaryUserMapper primaryUserMapper;

    @Test
    public void testInsert() throws Exception {
        primaryUserMapper.insert(new UserEntity("aa", "a123456", UserSexEnum.MAN));
        primaryUserMapper.insert(new UserEntity("bb", "b123456", UserSexEnum.WOMAN));
        primaryUserMapper.insert(new UserEntity("cc", "b123456", UserSexEnum.WOMAN));

        Assert.assertEquals(6, primaryUserMapper.getAll().size());
    }

    @Test
    public void testQuery() throws Exception {
        List<UserEntity> users = primaryUserMapper.getAll();
        System.out.println(users);
    }


    @Test
    public void testUpdate() throws Exception {
        UserEntity user = primaryUserMapper.getOne(6l);
        System.out.println(user.toString());
        user.setNickName("neo");
        primaryUserMapper.update(user);
        Assert.assertTrue(("neo".equals(primaryUserMapper.getOne(6l).getNickName())));
    }
}
