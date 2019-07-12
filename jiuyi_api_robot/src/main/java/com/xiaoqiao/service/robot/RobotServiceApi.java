package com.xiaoqiao.service.robot;

import com.xiaoqiao.entity.Drug;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("robot")
public interface RobotServiceApi {

    @PostMapping()
    List<Drug> inputByRobot();


}
