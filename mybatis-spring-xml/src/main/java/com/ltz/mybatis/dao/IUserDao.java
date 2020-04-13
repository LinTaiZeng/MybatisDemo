package com.ltz.mybatis.dao;

import com.ltz.mybatis.entity.User;

import java.util.List;

public interface IUserDao {

    public List<User> findAll();
}
