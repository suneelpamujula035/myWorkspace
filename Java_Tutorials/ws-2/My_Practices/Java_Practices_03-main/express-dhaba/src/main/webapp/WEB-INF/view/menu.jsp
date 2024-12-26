<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>menu</title>
</head>
<body>

	<h1 align="center">Express Dhaba</h1>
	<h2>Here is your menu</h2>

	<table border="1px" cellpadding="25">
		<tr>
			<th>Id</th>
			<th>Item Name</th>
			<th>Price</th>
		</tr>
		<c:forEach var="tempMenu" items="${menuItems}">
			<tr>
				<td>${tempMenu.id}</td>
				<td>${tempMenu.item}</td>
				<td>${tempMenu.price}</td>
			</tr>


		</c:forEach>
	</table>
</body>
</html>