package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class PaymentConfig {

    @Bean
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }

//    @Bean
//    public AlwaysSample defaultSampler()
//    {
//        return new AlwaysSampler();
//    }
}
