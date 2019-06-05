package com.ithinksky.dao;

import com.ithinksky.entity.UserEntity;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author tengpeng.gao
 */
public class UserMapperTest {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // 1.读取mybatis配置文件创SqlSessionFactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        inputStream.close();
    }

    @Test
    public void selectByPrimaryKey() {

        // 1.获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 2.获取对应mapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 3.执行查询语句并返回结果
        UserEntity user = mapper.selectByPrimaryKey(1);
        System.out.println(user.toString());

    }
}