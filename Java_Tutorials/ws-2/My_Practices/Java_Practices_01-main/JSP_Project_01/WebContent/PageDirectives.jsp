<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="Header.jsp"%>
<%@page import="java.util.Scanner"%>
<%@page contentType="text/html; charset=ISO-8859-1"%>
<%@page isELIgnored="true" %>
<%@page info="This is the login page info" %>
<%@page buffer="8kb" %>
<%@page isThreadSafe="true" %>
<%@page errorPage="Error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
out.println("This is my msword demo");
out.println("buffer demo");
out.println("isThreadSafe demo");

int x=12;
int y=0;
int z = x+y;
out.println(z);
%>
<%= getServletInfo()%>
</body>
</html>