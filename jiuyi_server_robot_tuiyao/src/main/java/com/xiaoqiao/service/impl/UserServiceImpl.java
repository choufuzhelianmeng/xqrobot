package com.xiaoqiao.service.impl;

import com.xiaoqiao.entity.User;
import com.xiaoqiao.mapper.UserMapper;
import com.xiaoqiao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUser() {
        return userMapper.getUser();
    }

    @Override
    public String getUserName(int userId) {
        return userMapper.getUserName(userId);
    }
}
