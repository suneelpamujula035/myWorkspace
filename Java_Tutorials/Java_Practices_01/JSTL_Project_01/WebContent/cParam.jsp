<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:url value="/index1.jsp" var="completeURL"/>  
 <c:param name="trackingId" value="786"/>  
 <c:param name="user" value="Nakul"/>  
<%-- </c:url>  
 --%>${completeURL}  

</body>
</html>