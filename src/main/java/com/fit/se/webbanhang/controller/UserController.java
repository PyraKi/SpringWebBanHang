package com.fit.se.webbanhang.controller;

import java.util.List;

import com.fit.se.webbanhang.entity.User;
import com.fit.se.webbanhang.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserService userService;
    
    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @RequestMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }
}
