package com.valueRequiredAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
		Student s1 = (Student) context.getBean("stud");
		System.out.println(s1);
		s1.display();
	}

}
