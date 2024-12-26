package JDBC_Project_01;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex_03 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database1","root","root");
		Statement st = con.createStatement();
//		st.executeUpdate("create table student2(sno int(3),fname varchar(40),lname varchar(40),age int(2),percentage int(2))");
//		System.out.println("Table created");
//		st.executeUpdate("insert into student2(sno,fname,lname,age,percentage)values(101,'suneel','kumar',22,79)");
//		st.executeUpdate("insert into student2(sno,fname,lname,age,percentage)values(102,'pawan','kalyan',25,95)");
//		st.executeUpdate("insert into student2(sno,fname,lname,age,percentage)values(103,'tiru','pala',22,87)");
//		st.executeUpdate("insert into student2(sno,fname,lname,age,percentage)values(104,'fahim','sheik',26,64)");
//		st.executeUpdate("insert into student2(sno,fname,lname,age,percentage)values(105,'guru','prasad',32,82)");
//		System.out.println("Records inserted");
//		st.executeUpdate("update student2 set lname='pamujula',age=20 where sno=101");
//		System.out.println("Record updated");
		
		ResultSet rs = st.executeQuery("select * from student2");
		System.out.println("sno"+"    "+"fname"+"    "+"lname"+"    "+"age"+"    "+"percentage");
		while(rs.next())
		{
		System.out.println(rs.getString("sno")+"    "+rs.getString("fname")+"    "+"    "+rs.getString("lname")+"    "+rs.getString("age")+"    "+rs.getString("percentage"));
		}
		con.close();
	}

}
