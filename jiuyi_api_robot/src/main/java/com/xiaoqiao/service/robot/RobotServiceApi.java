package com.xiaoqiao.service.robot;

import com.xiaoqiao.entity.Drug;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("robot")
public interface RobotServiceApi {

    @PostMapping()
    List<Drug> inputByRobot(@RequestParam("params") util.Params params);

}
