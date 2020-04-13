package com.ltz.mybatis.test;

import com.ltz.mybatis.config.MybatisConfiguration;
import com.ltz.mybatis.entity.User;
import com.ltz.mybatis.mapper.UserMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class MybatisTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MybatisConfiguration.class);
        UserMapper bean = applicationContext.getBean(UserMapper.class);
        List<User> users = bean.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
