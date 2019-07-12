package com.xiaoqiao.robot.controller;

import com.xiaoqiao.entity.Drug;
import com.xiaoqiao.robot.service.RobotService;
import com.xiaoqiao.service.robot.RobotServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RobotController implements RobotServiceApi {

    @Autowired
    private RobotService robotService;

    @Override
    public List<Drug> inputByRobot() {
        return null;
    }
}
