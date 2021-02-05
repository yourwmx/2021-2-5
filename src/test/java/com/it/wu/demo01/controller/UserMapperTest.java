package com.it.wu.demo01.controller;

import com.it.wu.demo01.dao.UserMapper;
import com.it.wu.demo01.enums.UserSexEnum;
import com.it.wu.demo01.model.UserEntity;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsert() throws Exception {
        userMapper.insert(new UserEntity("aa1", "a123456", UserSexEnum.MAN));
        userMapper.insert(new UserEntity("bb1", "b123456", UserSexEnum.WOMAN));
        userMapper.insert(new UserEntity("cc1", "b123456", UserSexEnum.WOMAN));

        Assert.assertEquals(3, userMapper.getAll().size());
    }

    @Test
    public void testQuery() throws Exception {
        List<UserEntity> users = userMapper.getAll();
        System.out.println(users.toString());
    }


    @Test
    public void testUpdate() throws Exception {
        UserEntity user = userMapper.getOne(3l);
        System.out.println(user.toString());
        user.setNickName("neo");
        userMapper.update(user);
        Assert.assertTrue(("neo".equals(userMapper.getOne(3l).getNickName())));
    }
}