package com.autowiring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("autowireBean1.xml");
		Human h = (Human) context.getBean("hum");
		h.startPumping();
	}

}
