<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Love Calculator</h1>
<hr>
<h2>The Love Calculator Predicts :</h2><br/>

${userInfo.userName} and ${userInfo.crushName} are <br/>
${userInfo.result} <br/>








<!-- <a href="/spring-love-calculator/send-email-page">Send Result to Your Email</a>
 -->
 
 <a href="<c:url value = "/sendEmail"/>">Send Result to Your Email</a>
</body>
</html>