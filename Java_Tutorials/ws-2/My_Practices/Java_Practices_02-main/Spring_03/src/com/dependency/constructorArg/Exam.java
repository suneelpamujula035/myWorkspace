package com.dependency.constructorArg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Student pawan = context.getBean("pawan",Student.class);
		System.out.println(pawan);
		Student suresh = context.getBean("suresh",Student.class);
		System.out.println(suresh);
		Student fahim = context.getBean("fahim",Student.class);
		System.out.println(fahim);
		
	}

}
