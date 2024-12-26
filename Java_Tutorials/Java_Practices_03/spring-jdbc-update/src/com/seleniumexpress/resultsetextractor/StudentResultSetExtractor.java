package com.seleniumexpress.resultsetextractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.seleniumexpress.api.Student;

public class StudentResultSetExtractor implements ResultSetExtractor<List<Student>> {

	@Override
	public List<Student> extractData(ResultSet res) throws SQLException, DataAccessException {

		List<Student> studentList = new ArrayList<Student>();
		while (res.next()) {
			Student student = new Student();
			student.setRollNo(res.getInt("ROLL_NO"));
			student.setName(res.getString("STUDENT_NAME"));
			student.setAddress(res.getString("STUDENT_ADDRESS"));
			studentList.add(student);
		}

		System.out.println("inside the extractData method inside ResultSetExtractor");
		return studentList;
	}

}
