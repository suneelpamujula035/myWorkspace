package com.seleniumexpress.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seleniumexpress.api.Student;
import com.seleniumexpress.dao.StudentDAO;

@Service("studentDaoHelper")
public class StudentDAOHelper {

	@Autowired
	private StudentDAO studentDAOImpl;

	public void setUpStudentTable() {
		Student student1 = new Student();
		student1.setRollNo(1);
		student1.setName("Naresh");
		student1.setAddress("Noida");

		Student student2 = new Student();
		student2.setRollNo(2);
		student2.setName("Kiran");
		student2.setAddress("Gujarath");

		Student student3 = new Student();
		student3.setRollNo(3);
		student3.setName("Nani");
		student3.setAddress("Hyderabad");

		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);

		studentDAOImpl.insert(studentList);
	}

	public void printStudents(List<Student> students) {
		for (Student tempStudent : students) {
			System.out.println(tempStudent);
		}
	}

}
