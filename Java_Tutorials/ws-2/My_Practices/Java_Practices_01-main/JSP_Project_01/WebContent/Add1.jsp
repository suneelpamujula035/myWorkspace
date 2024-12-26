<%@page import="java.util.Scanner"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="Error.jsp"%>
<%@ include file="Header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
	<h1>Welcome to JSP</h1>

	<%!int cof = 4;
	int data = 50;
	%>
	<%
		int x = Integer.parseInt(request.getParameter("fnum"));
	int y = Integer.parseInt(request.getParameter("snum"));
	int z = x / y;

	out.println("Result is : " + z);
	
	%>



	My favourate number is
	<%=cof%>
	<%= "My Header data is "+data %>
	<%= "Hello world" %>

</body>
</html>