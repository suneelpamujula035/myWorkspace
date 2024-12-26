package JDBC_Project_01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Downloading_CLOB_Files_into_Database_01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database1","root","root");
		
		String query = "select resume from uploadresume where name=?";
	    PreparedStatement pst = con.prepareStatement(query);
	    pst.setString(1, "suneel");
	    
	    ResultSet rs = pst.executeQuery();
	    	    
	    if(rs.next())
	    {
	    	Reader r = rs.getCharacterStream(1);
	    	FileWriter writer = new FileWriter("C:\\Users\\palat\\OneDrive\\Desktop\\suneel.txt");
	    	int i;
	    	while((i=r.read())!=-1)
	    	{
	    		writer.write(i);
	    	}
	    	System.out.println("Success");
	    }
	    else
	    {
	    	System.out.println("Unsucces");
	    }
	    con.close();
	}

}
