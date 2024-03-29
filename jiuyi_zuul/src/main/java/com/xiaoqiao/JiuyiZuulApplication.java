package com.xiaoqiao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class JiuyiZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(JiuyiZuulApplication.class, args);
    }

}
