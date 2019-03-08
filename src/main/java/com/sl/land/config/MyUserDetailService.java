package com.sl.land.config;

import com.sl.land.entity.MyUser;
import com.sl.land.exception.NullUserNameException;
import com.sl.land.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

/**
 * @author 舒露
 */
@Component
public class MyUserDetailService implements UserDetailsService {

    private final UserService userService;


    @Autowired
    public MyUserDetailService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String userName) {
        MyUser user = userService.findByUserName(userName);
        if (user==null){
            try {
                throw new NullUserNameException(userName);
            } catch (NullUserNameException e) {
                e.printStackTrace();
            }
        }
        assert user != null;
        return new User(userName,user.getPassword(), AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
    }
}
