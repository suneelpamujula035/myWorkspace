package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class PaymentController {
    private static final Logger logger = LoggerFactory.getLogger(PaymentController.class);

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/discount")
    public String getDiscount()
    {
        logger.info("discount service called....");
        return "added discount 15%";
    }

    @GetMapping("/payment")
    public String getPayment()
    {
        logger.info("discount service called using REST TEMPLATE....");
        return restTemplate.getForObject("http://localhost:8080/discount",String.class);
    }

}
