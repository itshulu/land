package com.sl.land.service;


import com.sl.land.entity.MyUser;

import java.util.List;

/**
 * @author shulu
 */
public interface UserService {

    MyUser findByUserName(String userName);

    List<MyUser> findAll();
}
