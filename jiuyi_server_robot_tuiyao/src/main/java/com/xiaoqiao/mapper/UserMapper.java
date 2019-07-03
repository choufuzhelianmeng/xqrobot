package com.xiaoqiao.mapper;

import com.xiaoqiao.entity.User;

import java.util.List;

public interface UserMapper {

    List<User> getUser();

    String getUserName(int userId);
}
