package filesUploading;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class Upload_01
 */
@WebServlet("/Upload_01")
@MultipartConfig(maxFileSize = 1000000000)//Upto 1GB   1GB=1000000000 Bytes
public class Upload_01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Upload_01() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null; 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		Part filepart = request.getPart("file");
		
		InputStream inputfile = null;
		if(filepart != null)
		{
			inputfile = filepart.getInputStream();     
		}
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database1","root","root");
			String Query = "insert into upload1 values(?,?)";
			PreparedStatement pst = con.prepareStatement(Query);
			pst.setString(1, name);
			if(filepart != null)
			{
				int size = (int) filepart.getSize();
				pst.setBinaryStream(2, inputfile, size);
			}
			int num = pst.executeUpdate();
			PrintWriter pw = response.getWriter();

			if(num>0)
			{
				response.setContentType("text/html");
				pw.println("File upload successfully");		
			}
			else
			{
				pw.println("File uploaded successfully");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
