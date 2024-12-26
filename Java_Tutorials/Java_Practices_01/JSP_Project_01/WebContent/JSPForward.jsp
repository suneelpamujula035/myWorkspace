<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:forward page="abc.jsp">
<jsp:param value="Suneel" name="user"/>
</jsp:forward>
<h1>This is JSPForward</h1>
</body>
</html>