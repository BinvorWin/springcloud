package com.hbh.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author :Binvor
 * @Date :17:35
 * @Desc:
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication7001 {
    public static void main(String[] args){
        SpringApplication.run(EurekaApplication7001.class,args);
    }
}

