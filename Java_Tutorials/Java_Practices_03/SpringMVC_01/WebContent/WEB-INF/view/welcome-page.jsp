<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1 align="center">${myWebsiteTitle}</h1>
		<hr>

		<form action="processOrder">
			<label for="ItemName">ItemName :</label> <input type="text"
				name="foodType" placeholder="food type??" id="ItemName"> <input
				type="submit" value="order now">
		</form>
	</div>
</body>
</html>