package com.pyc.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServe_7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServe_7001.class,args);
    }
}
