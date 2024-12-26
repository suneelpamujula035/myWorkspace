package com.seleniumexpress.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.seleniumexpress.api.Student;
import com.seleniumexpress.resultsetextractor.StudentAddressResultSetExtractor;
import com.seleniumexpress.resultsetextractor.StudentResultSetExtractor;
import com.seleniumexpress.rowmapper.StudentRowMapper;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate; // new JdbcTemplate(getDataSource());

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
		int noOfRowDeleted = jdbcTemplate.update(sql, rollNo);

		System.out.println("No of record deleted is " + noOfRowDeleted);
		return noOfRowDeleted == 1;
	}

	@Override
	public int deleteRecordByStudentNameOrStudentAddress(String studentName, String studentAddress) {

		String sql = " DELETE FROM STUDENT WHERE STUDENT_NAME = ? OR STUDENT_ADDRESS = ?";
		Object[] args = { studentName, studentAddress };
		int noOfRowsDeleted = jdbcTemplate.update(sql, args);
		System.out.println("No of rows got deleted are " + noOfRowsDeleted);
		return noOfRowsDeleted;
	}

	public void cleanUp() {
		String sql = "TRUNCATE TABLE STUDENT";
		// jdbcTemplate.update(sql);//For DML commands
		jdbcTemplate.execute(sql);// For DDL commands
		System.out.println("Table cleaned up>>>>>>>>>");
	}

	@Override
	public void insert(List<Student> students) {

		String sql = "INSERT INTO STUDENT VALUES (?,?,?)";

		ArrayList<Object[]> sqlArgs = new ArrayList<Object[]>();
		for (Student tempStudent : students) {
			Object[] studentData = { tempStudent.getRollNo(), tempStudent.getName(), tempStudent.getAddress() };
			sqlArgs.add(studentData);
		}
		jdbcTemplate.batchUpdate(sql, sqlArgs);

		System.out.println("Batch update completed!!!");
	}

	@Override
	public List<Student> findAllStudents() {

		String sql = "SELECT * FROM STUDENT WHERE STUDENT";

//		String sql = "SELECT ROLL_NO as rollNo,"
//				+"STUDENT_NAME as name,"
//				+"STUDENT_ADDRESS as address"
//				+"FROM STUDENT";
		List<Student> studentList = jdbcTemplate.query(sql, new StudentRowMapper());
		return studentList;
	}

	@Override
	public Student findStudentByRollNo(int rollNo) {

		String selectSql = "SELECT ROLL_NO as rollNo," + "STUDENT_NAME as name," + "STUDENT_ADDRESS as address"
				+ "FROM STUDENT WHERE ROLL_NO = ?";
		Student student = jdbcTemplate.queryForObject(selectSql, new BeanPropertyRowMapper<Student>(Student.class),
				rollNo);

		return student;
	}

	@Override
	public List<Student> findStudentByName(String name) {

		String sql = "SELECT * FROM STUDENT WHERE STUDENT_NAME = ?";
		List<Student> studentList = jdbcTemplate.query(sql, new StudentResultSetExtractor(), name);
		return studentList;
	}

	@Override
	public Map<String, List<String>> groupStudentsByAddress() {

		String sql = "SELECT * FROM STUDENT";
		Map<String, List<String>> query = jdbcTemplate.query(sql, new StudentAddressResultSetExtractor());
		return query;
	}

	@Override
	public int updateStudent(Student student) {

		String sql = "UPDATE school.STUDENT set STUDENT_ADDRESS = ? where ROLL_NO = ?";
		Object[] args = { student.getAddress(), student.getRollNo() };
		int noOfRowsUpdated = jdbcTemplate.update(sql, args);
		return noOfRowsUpdated;
	}

	@Override
	@Transactional
	public int updateStudent(List<Student> studentList) {

		String sql = "UPDATE school.STUDENT set STUDENT_ADDRESS = ? where ROLL_NO = ?";

		int[] batchUpdate = jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps, int index) throws SQLException {

				// i need to set the args for the PrepareStatement
				ps.setString(1, studentList.get(index).getAddress());// blr
				ps.setInt(2, studentList.get(index).getRollNo());// 1
				System.out.println("inside setValues method");
			}

			@Override
			public int getBatchSize() {
				// We need to design how many times our query will execute
				// How many times the setValues() is going to execute?
				System.out.println("inside getBatchSize method >>>>> set value method will run for : "+studentList.size()+" times");

				return studentList.size();
			}
		});
		return 0;
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
