package com.hbh.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.context.annotation.Configuration;
/**
 * Author:Binvor
 * Date:2020/6/17
 * Des:
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
