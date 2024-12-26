<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<style>
a {
	text-decoration: none;
}
</style>
<body>

	<div class="container">
		<h3 align="left">Searching Employee by First Name :
			${firstName}</h3>
		<table border="1" class="table table-striped">
			<thead>
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Email</th>
					<th>Phone</th>
					<th>Designation</th>
					<th>Type</th>
					<th>Department</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:choose>
					<c:when test="${employees.size() > 0 }">
						<c:forEach var="employee" items="${employees}">
							<tr>
								<td>${employee.id}</td>
								<td>${employee.firstName}</td>
								<td>${employee.email}</td>
								<td>${employee.phone}</td>
								<td>${employee.designation}</td>
								<td>${employee.employmentType}</td>
								<td>${employee.department}</td>
								<td><a
									href="http://localhost:8080/updateEmployee?employeeId=${employee.id}"><i
										class="fa fa-edit" style="font-size: 24px; color: black"></i></a>
									<a
									href="http://localhost:8080/deleteEmployee?employeeId=${employee.id}"
									onclick="if(!(confirm('Are you sure you want to delete this employee?'))) return false"><i
										class='fa fa-trash' style="font-size: 24px; color: black"></i></a>
										<a href="#"><i class='fa fa-calendar' style="font-size: 24px; color: black"></i></a></td>
							</tr>
						</c:forEach>
					</c:when>
					<c:otherwise>
						<tr align="center">
							<td colspan="8">Employee Records not available</td>
						</tr>
					</c:otherwise>
				</c:choose>
			</tbody>
		</table>
		<a href="http://localhost:8080"><button class="btn btn-primary">Home</button></a>
	</div>
</body>
</html>