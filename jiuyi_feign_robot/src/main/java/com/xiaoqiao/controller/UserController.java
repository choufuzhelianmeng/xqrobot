package com.xiaoqiao.controller;

import com.xiaoqiao.entity.User;
import com.xiaoqiao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUser")
    public List<User> getUser(){
        List<User> user = userService.getUser();
        return user;
    }

    @RequestMapping(value = "/getUserName")
    public String getUserName(int userId){
        return userService.getUserName(userId);
    }

}
