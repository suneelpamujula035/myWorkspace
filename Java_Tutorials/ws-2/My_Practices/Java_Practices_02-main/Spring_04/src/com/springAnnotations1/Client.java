package com.springAnnotations1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(InstituteConfig.class);
		Institute i = (Institute) context.getBean("institute");
		i.details();
	}

}
