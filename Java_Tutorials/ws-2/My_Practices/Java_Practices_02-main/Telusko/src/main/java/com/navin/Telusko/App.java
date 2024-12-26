package com.navin.Telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

//    	Using XML based configuration
//    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//    	Vehicle v = (Vehicle)context.getBean("vehicle");
//    	v.drive();
    	
    	
//    	Using Annotation based configuration
//    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//    	Vehicle v = (Vehicle)context.getBean("bike");//Here we can change from bike to car
//    	v.drive();//Use only small letters for getBean object
    	
    	
//    	Using Property tag uses inside bean tag in XML file
//    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//    	Tyre t = (Tyre)context.getBean("tyre");
//    	System.out.println(t);
    	
//    	Using Autowired Annotation(Using both Annotation  and XML based configurations)
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	Car obj = (Car)context.getBean("car");
    	obj.drive();
    	
    	
    	
    	
//    	Using interface
//    	Vehicle v = new Car();
//    	v.drive();
    }
} 