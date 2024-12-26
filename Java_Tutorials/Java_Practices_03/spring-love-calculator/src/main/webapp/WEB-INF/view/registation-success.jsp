<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 align="center">Registration Successfull</h1>

Name : ${userReg.name }<br/>
userName : ${userReg.userName }<br/>
password : ${userReg.password }<br/>
countryName : ${userReg.countryName }<br/>
hobbies :

<c:forEach var="temp" items="${userReg.hobbies}">
${temp}
</c:forEach>
 <br/>
gender : ${userReg.gender }<br/>
Age : ${userReg.age }<br/>


Email : ${userReg.communicationDTO.email}<br/>
Phone : ${userReg.communicationDTO.phone.countryCode}-${userReg.communicationDTO.phone.userNumber}<br/>

</body>
</html>