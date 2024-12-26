package com.seleniumexpress.test;

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
		//SETTING UP THE TABLE DATA
		//helper.setUpStudentTable();
		
		//Call the findAllStudents() >>>>  FETCHING THE DATA FROM THE TABLE
		StudentDAOImpl studentDAO = context.getBean("studentDAOImpl", StudentDAOImpl.class);
		//List<Student> studentList = studentDAO.findAllStudents();
		//helper.printStudents(studentList);

		//Quering for specific object
		//System.out.println("Fetching the student with roll no 2");
		//Student student = studentDAO.findStudentByRollNo(2);
		//System.out.println(student);
		
		//CLEAN UP THE DATA
		//studentDAO.cleanUp();
		
//		System.out.println("Printing students where the name is Suneel>>>>>>>>");
//		System.out.println("Using ResultSetExtractor approach>>>>>>>>");
//		List<Student> findStudentByName = studentDAO.findStudentByName("Suneel");
//		helper.printStudents(findStudentByName);
//		
//		System.out.println("************************************************************");
//		System.out.println("Printing all tye students from the student table");
//		System.out.println("Using the RowMapper");
//		List<Student> findAllStudents = studentDAO.findAllStudents();
//		helper.printStudents(findAllStudents);
		
		//GroupByStudentAddress
		Map<String, List<String>> groupStudentsByAddress = studentDAO.groupStudentsByAddress();
		System.out.println(groupStudentsByAddress);

	}

}
