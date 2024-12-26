package com.springBeanLifeCycle;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.springBeanLifeCycle")
@PropertySource("classpath:DatabaseConnection.properties")
public class StudentConfig {

}
