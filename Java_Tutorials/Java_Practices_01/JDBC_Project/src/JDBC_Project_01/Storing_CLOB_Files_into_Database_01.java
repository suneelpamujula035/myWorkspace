package JDBC_Project_01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Storing_CLOB_Files_into_Database_01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database1","root","root");
		
		File file = new File("‪‪S:\\Thiru's\\KING\\resume\\MY RESUME NEW.B.TECH.docx");
        FileReader fr = new FileReader(file);		
		String query = "insert into uploadresume values(?,?,?)";
		PreparedStatement pst = con.prepareStatement(query);
		int size = (int) file.length();
		
		pst.setInt(1, 1);
		pst.setString(2, "pawan");
		pst.setCharacterStream(3, fr, size);
		
		int count = pst.executeUpdate();
		if(count>0)
		{
			System.out.println("Success");
		}
		else
		{
		    System.out.println("Not inserted");
		}
		con.close();
	}

}
