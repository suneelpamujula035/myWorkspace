package com.seleniumexpress.dao;

import java.util.List;
import java.util.Map;

import com.seleniumexpress.api.Student;

public interface StudentDAO {

	void insert(Student student);
	void insert(List<Student> students);
	boolean deleteRecordByRollNO(int rollNo);
	int deleteRecordByStudentNameOrStudentAddress(String studentName, String studentAddress);
	
	
	List<Student> findAllStudents();
	Student findStudentByRollNo(int rollNo);
	
	List<Student>findStudentByName(String name);
	
	
	
	Map<String, List<String>>groupStudentsByAddress();
}
