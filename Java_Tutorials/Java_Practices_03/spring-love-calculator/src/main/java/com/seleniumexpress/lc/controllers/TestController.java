package com.seleniumexpress.lc.controllers;

import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.seleniumexpress.lc.config.LoveCalculatorAppConfig;

@Controller
public class TestController {

	Logger logger = Logger.getLogger(LoveCalculatorAppConfig.class.getName());

	@RequestMapping("/test")
	public String sayHello()
	{
		logger.info("Inside test method");
		return "hello-world";
	}
}
