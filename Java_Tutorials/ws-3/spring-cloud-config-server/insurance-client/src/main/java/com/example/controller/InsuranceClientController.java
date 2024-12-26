package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/insuranceClient")
public class InsuranceClientController {

    @Autowired
    @Lazy
    private RestTemplate restTemplate;

    @Value("${insurance.provider.url}")
    private String url;

    @GetMapping("/getPlan")
    public List<String > getPlans()
    {
        return restTemplate.getForObject(url,List.class);
    }
}
