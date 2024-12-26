package com.dependency.getterSetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Student s = context.getBean("student",Student.class);
		System.out.println(s);
		Student t = context.getBean("tiru",Student.class);
		System.out.println(t);

	}

}
