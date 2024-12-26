package com.seleniumexpress.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.seleniumexpress.api.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate; //new JdbcTemplate(getDataSource());

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insert(Student student) {

		String sql = "INSERT INTO STUDENT VALUES(?,?,?)";

		Object[] arg = { student.getRollNo(), student.getName(), student.getAddress() };

		int noOfRowInserted = jdbcTemplate.update(sql, arg);

		System.out.println("No of row inserted is " + noOfRowInserted);

	}

	@Override
	public boolean deleteRecordByRollNO(int rollNo) {

		String sql = "DELETE FROM STUDENT WHERE ROLL_NO=?";
		int noOfRowDeleted = jdbcTemplate.update(sql,rollNo);
		
		System.out.println("No of record deleted is "+noOfRowDeleted);
		return noOfRowDeleted == 1;
	}

	@Override
	public int deleteRecordByStudentNameOrStudentAddress(String studentName, String studentAddress) {

		String sql = " DELETE FROM STUDENT WHERE STUDENT_NAME = ? OR STUDENT_ADDRESS = ?";
		Object [] args = {studentName,studentAddress};
		int noOfRowsDeleted = jdbcTemplate.update(sql, args);
		System.out.println("No of rows got deleted are "+noOfRowsDeleted);
		return noOfRowsDeleted;
	}
	
	public void cleanUp()
	{
		String sql = "TRUNCATE TABLE STUDENT";
		//jdbcTemplate.update(sql);//For DML commands
		jdbcTemplate.execute(sql);//For DDL commands
		System.out.println("Table cleaned up>>>>>>>>>");
	}

	@Override
	public void insert(List<Student> students) {

		String sql = "INSERT INTO STUDENT VALUES (?,?,?)";
		
		ArrayList<Object[]> sqlArgs = new ArrayList<Object[]>();
		for(Student tempStudent : students)
		{
			Object [] studentData = {tempStudent.getRollNo(),tempStudent.getName(),tempStudent.getAddress()};
			sqlArgs.add(studentData);
		}
		jdbcTemplate.batchUpdate(sql, sqlArgs);
		
		System.out.println("Batch update completed!!!");
	}

//	public DataSource getDataSource() {
//		
//		String url = "jdbc:mysql://localhost:3306/school";//?useSSL=false
//		String username = "root";
//		String password = "root";
//		
//		DataSource dataSource = new DriverManagerDataSource(url, username, password);
//
//		return dataSource;
//	}

}
