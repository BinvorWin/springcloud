package com.hbh.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * Author:Binvor
 * Date:2020/6/17
 * Des:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ProviderApplication8001 {
    public static void main(String[] args){
        SpringApplication.run(ProviderApplication8001.class, args);
    }
}
