package com.seleniumexpress.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seleniumexpress.api.Student;
import com.seleniumexpress.dao.StudentDAO;

@Service("studentDaoHelper")
public class StudentDAOHelper {

	@Autowired
	private StudentDAO studentDAOImpl;
	
	public void setUpStudentTable()
	{
		Student student1 = new Student();
		student1.setRollNo(4);
		student1.setName("Saqlain");
		student1.setAddress("Kerala");
		
		Student student2 = new Student();
		student2.setRollNo(5);
		student2.setName("Vivek");
		student2.setAddress("Kochi");
		
		Student student3 = new Student();
		student3.setRollNo(6);
		student3.setName("Gopi");
		student3.setAddress("Odissa");
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);

		studentDAOImpl.insert(studentList);
		
	}
}
