<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Enter Id: ${param.id}<br>
Id:<%= request.getParameter("id") %><br>
Enter Name: ${param.Name}<br>

<%
String number = request.getParameter("number");
session.setAttribute("user", number);
%>
<%-- <jsp:forward page="page4.jsp"></jsp:forward>
 --%>
</body>
</html>