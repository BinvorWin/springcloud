package com.hbh.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * Author:Binvor
 * Date:2020/6/17
 * Des:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderApplication8001 {
    public static void main(String[] args){
        SpringApplication.run(ProviderApplication8001.class, args);
    }
}
