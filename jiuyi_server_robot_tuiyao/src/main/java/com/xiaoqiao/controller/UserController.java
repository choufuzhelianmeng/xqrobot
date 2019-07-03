package com.xiaoqiao.controller;

import com.xiaoqiao.entity.User;
import com.xiaoqiao.service.UserService;
import com.xiaoqiao.service.UserServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController implements UserServiceApi {
    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String getUserNameById(@RequestParam int userId){
        return "hello world" + userId;
    }


    @Override
    public List<User> getUser() {
        return userService.getUser();
    }

    @Override
    public String getUserName(int userId) {
        return userService.getUserName(userId);
    }

}
