package JDBC_Project_01;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CallableStatement_01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database1","root","root");
		CallableStatement cst = con.prepareCall("call tst(?,?,?)");
		cst.setInt(1, 257);
		cst.setString(2, "mahi");
		cst.setString(3, "amirpet");
		int rs = cst.executeUpdate();
		if(rs==0)
		{
			System.out.println("Record not inseted");
		}
		else
		{
		    System.out.println("Records inserted");
		}
		con.close();
	}

}
