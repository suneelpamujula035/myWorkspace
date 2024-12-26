package JDBC_Project_01;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Storing_BLOB_Files_into_Database_01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database1","root","root");
		
		File file = new File("‪C:\\Users\\palat\\OneDrive\\Desktop\\IMG_20190104_144829.jpg");
		FileInputStream fin = new FileInputStream(file);//image is converted into binary stream (read bytes)
		
		String query = "insert into profile_photo values(?,?,?)";
		PreparedStatement pst = con.prepareStatement(query);
		int size = (int) file.length();
		pst.setInt(1, 1);
		pst.setString(2, "tiru");
		pst.setBinaryStream(3, fin, size);
		
		int rs = pst.executeUpdate();
		if(rs==0)
		{
			System.out.println("Record not inserted");
		}
		else
		{
		    System.out.println("Success");
		}
		con.close();
	}

}
