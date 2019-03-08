package com.sl.land.service.impl;


import com.sl.land.dao.UserDao;
import com.sl.land.entity.MyUser;
import com.sl.land.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shulu
 */
@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public MyUser findByUserName(String userName) {
        return userDao.findByUserName(userName);
    }

    @Override
    public List<MyUser> findAll() {
        return userDao.findAll();
    }
}
