package com.seleniumexpress.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seleniumexpress.api.Student;
import com.seleniumexpress.dao.StudentDAOImpl;
import com.seleniumexpress.service.StudentDAOHelper;

public class Test {

	public static void main(String[] args) {

		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StudentDAOHelper helper = context.getBean("studentDaoHelper", StudentDAOHelper.class);
		StudentDAOImpl studentDAO = context.getBean("studentDAOImpl", StudentDAOImpl.class);

		Student Abhilash = new Student();
		Abhilash.setRollNo(12);
		Abhilash.setAddress("Blr55");
		
		Student Sathish = new Student();
		Sathish.setRollNo(6);
		Sathish.setAddress("Chen55");
		
		Student Praveen = new Student();
		Praveen.setRollNo(10);
		Praveen.setAddress("Koc55");
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(Abhilash);
		studentList.add(Sathish);
		studentList.add(Praveen);
		
		//Starting the batch update
		studentDAO.updateStudent(studentList);
	}
}
