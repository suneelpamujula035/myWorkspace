package com.suneel.Spring_02;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	//Object construction | Done by Developer
//    	Employee eRef = new Employee();
//    	eRef.setEid(101);
//    	eRef.setEname("Suneel");
//    	eRef.setEaddress("Banglore");
    	
//    	System.out.println("Employee Deatils : "+eRef);
    	
    	//Spring way | IOC (Inversion of Control)
    	ApplicationContext context = new ClassPathXmlApplicationContext("EmployeeBean.xml");
    	Employee e1 = (Employee) context.getBean("emp1");
    	Employee e2 = context.getBean("emp2",Employee.class);//Spring container which shall parse XML file and construct the objects

    	System.out.println("Employee1 Deatails : "+e1);
    	System.out.println("Employee2 Deatails : "+e2);

    }
    

	}
