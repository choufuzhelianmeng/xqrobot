package com.xiaoqiao.robot.service.impl;

import com.xiaoqiao.robot.mapper.RobotMapper;
import com.xiaoqiao.robot.service.RobotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RobotServiceImpl implements RobotService {

    @Autowired
    private RobotMapper robotMapper;
}
