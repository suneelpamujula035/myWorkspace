<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Hi ${userInfo.userName}</h1>
<h2>Send Result to your Email</h2>


<form:form action="email-success" method="get" modelAttribute ="emailDTO">



<label for="ue">Enter your Email</label>

<input type="text" name="userEmail" id="ue">

<input type="submit" value="send">


</form:form>
</body>
</html>