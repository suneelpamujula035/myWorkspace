package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example")
public class SpringBootCrudRestfulWebservices1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudRestfulWebservices1Application.class, args);
	}

}
