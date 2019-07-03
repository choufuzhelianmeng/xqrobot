package com.xiaoqiao.service;

import com.xiaoqiao.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUser();

    String getUserName(int userId);
}
