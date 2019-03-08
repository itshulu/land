package com.sl.land.controller;

import com.sl.land.entity.MyUser;
import com.sl.land.entity.RestModel;
import com.sl.land.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author 舒露
 */
@Controller
class LoginController {
    private final UserService userService;

    @Autowired
    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/")
    public ResponseEntity<RestModel> success() {
        List<MyUser> all = userService.findAll();
        return ResponseEntity.ok(new RestModel<>(userService.findAll()));
    }

}
