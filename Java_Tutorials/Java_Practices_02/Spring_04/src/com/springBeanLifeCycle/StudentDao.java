package com.springBeanLifeCycle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StudentDao {

	@Value("${StudentDao.driver}")
	private String driver;
	@Value("${StudentDao.url}")
	private String url;
	@Value("${StudentDao.username}")
	private String username;
	@Value("${StudentDao.password}")
	private String password;
	Connection con;

	@PostConstruct
	public void init() throws ClassNotFoundException, SQLException
	{
		System.out.println("init method called");
		CreateConnection();
		System.out.println("Connection created");
	}
	
	
	public void CreateConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName(driver);
		con = DriverManager.getConnection(url,username,password);
	}
	
	public void selectAllStudents() throws SQLException, ClassNotFoundException
	{
		//CreateConnection();
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM database1.`student-hostel-info`");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getDouble(3)+"  "+rs.getString(4));
			
		}
	}
	public void deleteStudent(int studentid) throws SQLException, ClassNotFoundException
	{
		CreateConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("delete from `student-hostel-info` where student_id="+studentid);
		System.out.println("Student "+studentid+" record deleted");
	}
	
	public void closeConnection() throws SQLException
	{
		con.close();
		System.out.println("Connection closed");
	}
	
	@PreDestroy
	public void destroy() throws SQLException
	{
		System.out.println("Destroy method called");
		closeConnection();
	}
}
