package com.ithinksky.dao;

import com.ithinksky.entity.UserEntity;

import java.util.Date;

/**
 * @author tengpeng.gao
 */
public class UserMapperTest {

    @org.junit.Test
    public void insert() {

        UserMapper userMapper = new UserMapper();

        UserEntity userEntity = new UserEntity();
        userEntity.setAge(0);
        userEntity.setUsername("李四");
        userEntity.setPassword("admin");
        userEntity.setBirthday(new Date());
        int resultInt = userMapper.insert(userEntity);

        System.out.println("resultInt: " + resultInt);

    }
}