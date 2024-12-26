package com.valueRequiredAnnotation;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("${Student.name}")
	private String name;
	@Value("${Student.intrestedCource}")//@Required annotation is not working in this field
	private String intrestedCource;
	@Value("${Student.hobbies}")
	private String hobbies;
	
//	//@Value("Suneel")
//	@Value("${Student.name}")//For loading dynamic data from student-info.properties class
//	public void setName(String name) {
//		this.name = name;
//	}
//	@Required//To create the Student object this value is mandotory initialize ---- not null
//	//@Value("Java")
//	@Value("${Student.intrestedCource}")
//	public void setIntrestedCource(String intrestedCource) {
//		this.intrestedCource = intrestedCource;
//	}
//	//@Value("Travelling")
//	@Value("${Student.hobbies}")
//	public void setHobbies(String hobbies) {
//		this.hobbies = hobbies;
//	}
	
	public void display()
	{
		System.out.println("Student name is : "+name);
		System.out.println("Student intrestedCource is : "+intrestedCource);
		System.out.println("Student hobbies is : "+hobbies);

	}
	
}
