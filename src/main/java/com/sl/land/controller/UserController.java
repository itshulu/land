package com.sl.land.controller;


import com.sl.land.entity.MyUser;
import com.sl.land.entity.RestModel;
import com.sl.land.exception.NullUserNameException;
import com.sl.land.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author shulu
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public ResponseEntity<RestModel> getAllGroups() {
        List<MyUser> all = userService.findAll();
        return ResponseEntity.ok(new RestModel<>(userService.findAll()));
    }

    @PostMapping
    public ResponseEntity<RestModel> getOne(@PathVariable MyUser myUser) throws NullUserNameException {
        MyUser myUser1 = userService.findByUserName(myUser.getUserName());
        if (myUser1 == null) {
            throw new NullUserNameException(myUser.getUserName());
        }
        return ResponseEntity.ok(new RestModel<>(userService.findByUserName(myUser.getUserName())));
    }

}
