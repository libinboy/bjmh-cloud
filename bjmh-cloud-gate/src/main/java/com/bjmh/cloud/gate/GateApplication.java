package com.bjmh.cloud.gate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

//启动一个服务注册中心提供给其他应用进行对话
@SpringBootApplication
@EnableZuulProxy
public class GateApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(GateApplication.class, args);
    }
}