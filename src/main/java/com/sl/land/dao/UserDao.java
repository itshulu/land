package com.sl.land.dao;


import com.sl.land.entity.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author shulu
 */
public interface UserDao extends JpaRepository<MyUser,String> {
    MyUser findByUserName(String userName);
}
