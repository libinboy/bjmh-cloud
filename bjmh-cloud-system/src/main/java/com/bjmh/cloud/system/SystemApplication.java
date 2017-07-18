package com.bjmh.cloud.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//启动一个服务注册中心提供给其他应用进行对话
@EnableEurekaClient
@SpringBootApplication
@ServletComponentScan("com.bjmh.cloud.system.config.druid")
public class SystemApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(SystemApplication.class, args);
    }
}
