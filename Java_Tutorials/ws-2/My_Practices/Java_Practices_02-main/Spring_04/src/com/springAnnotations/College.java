package com.springAnnotations;

import org.springframework.stereotype.Component;

//@Component("collegeBean")//This is Bean id. In case we are not creating bean id no problem by default class name will be the bean id
public class College {

	
	private Principal principal;
	private Teacher teacher;
	

//	public College(Principal principal) {
//		super();
//		this.principal = principal;
//	}
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}


	public void test()
	{
		principal.principalInfo();
		
		principal.setName("James Bond");
		principal.setAge(43);
		principal.setAddress("Vizag");
		System.out.println("My name is : " + principal.getName());
		System.out.println("My age is : " + principal.getAge());
		System.out.println("My address is : " + principal.getAddress());
		
		System.out.println("Its working");
		
		teacher.teach();
	}


	


	
}
