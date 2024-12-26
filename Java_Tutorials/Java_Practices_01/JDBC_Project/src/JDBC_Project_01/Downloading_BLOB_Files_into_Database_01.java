package JDBC_Project_01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Downloading_BLOB_Files_into_Database_01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database1","root","root");
		
		String query = "select image from profile_photo";
	    PreparedStatement pst = con.prepareStatement(query);
	    
	    ResultSet rs = pst.executeQuery();
	    
	    FileOutputStream fout = new FileOutputStream("‪C:\\Users\\palat\\OneDrive\\Desktop\\suneel.jpg");
	    
	    if(rs.next())
	    {
	    	fout.write(rs.getBytes(1));
	    	System.out.println("Success");
	    }
	    else
	    {
	    	System.out.println("Unsucces");
	    }
	    fout.close();
	    con.close();
	}

}
