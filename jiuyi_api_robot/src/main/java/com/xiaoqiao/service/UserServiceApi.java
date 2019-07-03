package com.xiaoqiao.service;

import com.xiaoqiao.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("user")
public interface UserServiceApi {

    @GetMapping("")
    List<User> getUser();

    @PostMapping("getUserName")
    String getUserName(@RequestParam(value = "userId") int userId);
}
