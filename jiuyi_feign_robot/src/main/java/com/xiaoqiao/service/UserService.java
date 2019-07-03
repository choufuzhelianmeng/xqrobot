package com.xiaoqiao.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("jiuyi-server-robot-tuiyao")
public interface UserService extends UserServiceApi{
}
