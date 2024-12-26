<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <jsp:forward page="page2.jsp"></jsp:forward>
 --%>
<jsp:useBean id="user" class="test.Student" scope="request"></jsp:useBean>
<%-- <jsp:setProperty property="*" name="user"/>
 --%>
<jsp:setProperty property="id" name="user"/>
<jsp:setProperty property="name" name="user"/>
<jsp:setProperty property="address" name="user"/>

<h1>Records are Inserted</h1>
Id:     <jsp:getProperty property="id" name="user"/><br>
Name:   <jsp:getProperty property="name" name="user"/><br>
Address:<jsp:getProperty property="address" name="user"/><br>

</body>
</html>