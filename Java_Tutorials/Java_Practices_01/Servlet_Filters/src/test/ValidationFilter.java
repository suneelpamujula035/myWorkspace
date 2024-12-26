package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class ValidationFilter
 */
@WebFilter("./reg")
public class ValidationFilter implements Filter {
    public ValidationFilter() {

    	
    }
	public void destroy() {

		
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		String sid_Error="", sname_Error="", sage_Error="", semail_Error="", smobile_Error="";
		
		try
		{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String sid = request.getParameter("sid");
		String sname = request.getParameter("sname");
		String sage = request.getParameter("sage");
		String semail = request.getParameter("semail");
		String smobile = request.getParameter("smobile");
	
		
		boolean flag = true;
		if(sid == null || sid.equals(""))
		{
			sid_Error = "SID is required";
			flag = false;
		}
		else
		{
			if(!sid.startsWith("DSS-"))
			{
				sid_Error = "SID is Invalid.... SID must be started with DSS-NUMBER";
				flag = false;
			}
		}
		if(sname == null || sname.equals(""))
		{
			sname_Error = "SNAME is required";
			flag = false;
		}
		if(sage == null || sage.equals(""))
		{
			sage_Error = "SAGE is required";
			flag = false;
		}
		else
		{
			int age = Integer.parseInt(sage);
			if(age < 18)
			{
				sage_Error = "SAGE is must not be less than 18 Years";
				flag = false;
			}
			if(age > 30)
			{
				sage_Error = "SAGE is must not be greater than 30 Years";
				flag = false;
			}
		}
		if(semail == null || semail.equals(""))
		{
			semail_Error = "SEMAIL is required";
			flag = false;
		}
		else
		{
			if(!semail.endsWith("@durgasoft.com"))
			{
				semail_Error = "SEMAIL is invalid Email ID";
				flag = false;
			}
		}
		if(smobile == null || smobile.equals(""))
		{
			smobile_Error = "SMOBILE is required";
			flag = false;
		}
		else
		{
			if(!smobile.startsWith("91-"))
			{
				smobile_Error = "SMOBILE is invalid mobile number";
				flag = false;
			}
		}
		
		if(flag == true)
		{
			chain.doFilter(request, response);
		}
		else
		{
			out.println("<html>");
			out.println("<body>");
			out.println("<h2>Durga Software Solutions</h2>");
			out.println("<h3>Student registration form</h3>");
			out.println("<form action=\"/RegisterServlet\" method=\"post\">");
			out.println("<table>");
			
			out.println("<tr>");
			out.println("<td>Student Id</td>");
			out.println("<td><input type=\"text\" name=\"sid\" value='"+sid+"'></td>");
			out.println("<td><font color='red' size='5'></font><b>"+sid_Error+"</b></td>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("<td>Student Name</td>");
			out.println("<td><input type=\"text\" name=\"sname\" value='"+sname+"'></td>");
			out.println("<td><font color='red' size='5'></font><b>"+sname_Error+"</b></td>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("<td>Student Age</td>");
			out.println("<td><input type=\"text\" name=\"sage\" value='"+sage+"'></td>");
			out.println("<td><font color='red' size='5'></font><b>"+sage_Error+"</b></td>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("<td>Student Email</td>");
			out.println("<td><input type=\"text\" name=\"semail\" value='"+semail+"'></td>");
			out.println("<td><font color='red' size='5'></font><b>"+semail_Error+"</b></td>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("<td>Student Mobile</td>");
			out.println("<td><input type=\"text\" name=\"smobile\" value='"+smobile+"'></td>");
			out.println("<td><font color='red' size='5'></font><b>"+smobile_Error+"</b></td>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("<td><input type=\"submit\" value=\"Register\"></td>");
			out.println("</tr>");


			out.println("</table>");
			out.println("</form>");
			out.println("</body>");
			out.println("</html>");
		}
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		//chain.doFilter(request, response);
	}
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
