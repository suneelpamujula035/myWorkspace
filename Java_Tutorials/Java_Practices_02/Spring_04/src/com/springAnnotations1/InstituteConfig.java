package com.springAnnotations1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.springAnnotations1")
@PropertySource("classpath:institute-info.properties")
public class InstituteConfig {

}
