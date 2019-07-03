package com.xiaoqiao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.xiaoqiao.mapper")
public class JiuyiServerRobotTuiyaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JiuyiServerRobotTuiyaoApplication.class, args);
    }

}
