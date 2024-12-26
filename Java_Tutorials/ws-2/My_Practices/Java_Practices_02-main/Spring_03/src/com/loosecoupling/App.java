package com.loosecoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
		Airtel s1 = (Airtel) context.getBean("airt");
		System.out.println("Activate services for Airtel");
		s1.activateService();
		System.out.println("-----------------------------------");
		
		Jio s2 = (Jio) context.getBean("ji");
		System.out.println("Activate services for Jio");
		s2.activateService();
	}

}
