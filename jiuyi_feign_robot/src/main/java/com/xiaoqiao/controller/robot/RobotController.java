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
    private List<Drug> inputByRobot(util.Params params){
        //设置症状code
        params.setSymptomCode("");
        //设置症状code
        params.setDrugCode(1);
        //设置药店code
        params.setDrugstoreCode(1);
        //设置健康档案code
        params.setHealthFileCode(1);
        ////联合分类TYPE
        params.setLhtype(1);
        // 0:不是联合用药,1:联合用药
        //params.setType();
        //是否为医保 0：否，1：是
        params.setYiBao(0);
        //中西 1:中药,2:西药
        params.setZhongXi(1);
        return robotService.inputByRobot(params);
    }

}
