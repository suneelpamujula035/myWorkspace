package JDBC_Project_01;

import java.sql.*;

public class Ex_01 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

//		Driver d = new com.mysql.cj.jdbc.Driver();
//		DriverManager.registerDriver(d);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database1","root","root");
		Statement st = con.createStatement();
		st.executeUpdate("insert into student1(sn,fname)values(2,'sandeep')");
		st.executeUpdate("insert into student1(sn,fname)values(3,'nikhil')");
		st.executeUpdate("insert into student1(sn,fname)values(4,'pawan')");
		st.executeUpdate("insert into student1(sn,fname)values(5,'tiru')");
		System.out.println("Records inserted");
		st.executeUpdate("alter table student1 add postalCode int(6)");
		st.executeUpdate("alter table student1 add country varchar(20)");

		System.out.println("Columns added");
		con.close();
	}

}
