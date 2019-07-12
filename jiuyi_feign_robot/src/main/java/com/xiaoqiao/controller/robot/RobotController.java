package com.xiaoqiao.controller.robot;

import com.xiaoqiao.entity.Drug;
import com.xiaoqiao.service.robot.RobotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/robot")
public class RobotController {

    @Autowired
    private RobotService robotService;

    @RequestMapping("inputByRobot")
    private List<Drug> inputByRobot(){
        return robotService.inputByRobot();
    }

}
