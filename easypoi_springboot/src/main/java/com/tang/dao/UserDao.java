package com.tang.dao;

import com.tang.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author xiaokaixin
 * @Date 2021/7/9 14:55
 * @Version 1.0
 */

@Mapper
public interface UserDao {

    public List<User> findAll();

    public void save(User user);
}
