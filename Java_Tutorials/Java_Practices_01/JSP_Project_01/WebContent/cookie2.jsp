<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name = request.getParameter("name");
String number = request.getParameter("number");

Cookie ck = new Cookie("name",name);
response.addCookie(ck);
out.println("Hello "+name+"<br>");
out.println("Your Number is "+number+"<br>");


application.setAttribute("number", number);
%>
<a href='cookie3.jsp'>Click</a>
</body>
</html>