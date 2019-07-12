package com.xiaoqiao.service.robot;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("jiuyi-server-robot-tuiyao")
public interface RobotService extends RobotServiceApi{
}
