package com.tang.service;

import com.tang.dao.UserDao;
import com.tang.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author xiaokaixin
 * @Date 2021/7/9 15:01
 * @Version 1.0
 */
@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public void saveAll(List<User> users) {
        for (User user : users) {
            user.setId(null);
            String fileName = user.getPhoto().substring(user.getPhoto().lastIndexOf("/") + 1);
            user.setPhoto(fileName);
            userDao.save(user);
        }
    }
}
