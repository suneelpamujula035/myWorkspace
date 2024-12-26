package com.seleniumexpress.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seleniumexpress.api.Student;
import com.seleniumexpress.dao.StudentDAO;
import com.seleniumexpress.dao.StudentDAOImpl;
import com.seleniumexpress.service.StudentDAOHelper;

public class Test {

	public static void main(String[] args) {

		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//StudentDAOImpl studentDAOImpl =	context.getBean("studentDAOImpl",StudentDAOImpl.class);
		StudentDAOHelper studentDAOHelper = context.getBean("studentDaoHelper", StudentDAOHelper.class);
		studentDAOHelper.setUpStudentTable();
		
//		Student newStudent1 = new Student();
//		newStudent1.setRollNo(5);
//		newStudent1.setName("Sumanth");
//		newStudent1.setAddress("Noida");
		
//		StudentDAO studentDAO = new StudentDAOImpl();
//		studentDAO.insert(newStudent1);
//		studentDAOImpl.insert(newStudent1);
//		boolean isDeleted = studentDAOImpl.deleteRecordByRollNO(2);
//		if(isDeleted)
//		{
//			System.out.println("The roll no 2 got deleted>>>>>>>>");
//		}
		
//		studentDAOImpl.deleteRecordByStudentNameOrStudentAddress("Suneel","Pune");
//		studentDAOImpl.cleanUp();
		
	}

}
