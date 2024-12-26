<%@page import="test.Demo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Class Example of JSP</h1>
<%
Demo d = new Demo();
int z = d.sum(50, 40);
out.println(z);
%>
</body>
</html>