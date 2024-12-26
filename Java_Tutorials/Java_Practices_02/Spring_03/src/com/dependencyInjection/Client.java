package com.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		Student s = context.getBean("stu",Student.class);
		s.cheating();
		AnotherStudent s1 = context.getBean("anoStu",AnotherStudent.class);
		s1.cheat();
		/*
		 * Student s = new Student(); MathsCheat m = new MathsCheat();
		 * s.setMathscheat(new MathsCheat()); s.setMathscheat(m); s.cheating();
		 */
		
	}

}
