package com.tang.service;

import com.tang.entity.User;

import java.util.List;

/**
 * @Author xiaokaixin
 * @Date 2021/7/9 15:00
 * @Version 1.0
 */
public interface UserService {

    public List<User> findAll();

    public void saveAll(List<User> users);
}
