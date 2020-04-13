package com.ltz.mybatis;

import com.ltz.mybatis.dao.IUserDao;
import com.ltz.mybatis.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MybatisTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring-mybatis-config.xml");
        IUserDao userDao = ac.getBean(IUserDao.class);
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
