package com.pyc.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient // 告诉别人我的服务信息
public class DeptService {
    public static void main(String[] args) {
        SpringApplication.run(DeptService.class,args);
    }
}
