package com.ltz.mybatis.dao;

import com.ltz.mybatis.domain.User;

import java.util.List;

public interface IUserDao {

    public List<User> findAll();
}
