<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
	<style>
a {
	text-decoration: none;
}
</style>
	<div align="right">
		<a href="http://localhost:8080"><button class="btn btn-primary">Home</button></a>
	</div>


	<div class="container">
		<h2>Add Employee</h2>

		<form:form action="saveEmployee" modelAttribute="employee"
			method="POST">

			<form:hidden path="id" />

			<div class="form-group">
				<label class="control-label col-sm-2">First Name:</label>
				<div class="col-sm-4">
					<form:input path="firstName" class="form-control"
						required="required" />
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2">Last Name:</label>
				<div class="col-sm-4">
					<form:input path="lastName" class="form-control"
						required="required" />
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2">Email:</label>
				<div class="col-sm-4">
					<form:input path="email" class="form-control" required="required" />
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2">Phone:</label>
				<div class="col-sm-4">
					<form:input path="phone" class="form-control" required="required" />
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2">Designation:</label>
				<div class="col-sm-4">
					<form:select path="designation" class="form-control"
						required="required">
						<optgroup label="Select Designation">
							<form:option value="SE">SE</form:option>
							<form:option value="SSE">SSE</form:option>
							<form:option value="TL">TL</form:option>
							<form:option value="STL">STL</form:option>
							<form:option value="PM">PM</form:option>
							<form:option value="VP">VP</form:option>
						</optgroup>
					</form:select>
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2">Employeement Type:</label>
				<div class="col-sm-4">
					<form:select path="employmentType" class="form-control"
						required="required">
						<optgroup label="Select Employment Type">
							<form:option value="Full-Time">Full-Time</form:option>
							<form:option value="Part-Time">Part-Time</form:option>
							<form:option value="Contract">Contract</form:option>
						</optgroup>
					</form:select>
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2">Department:</label>
				<div class="col-sm-4">
					<form:select path="department" class="form-control"
						required="required">
						<optgroup label="Select Department">
							<form:option value="Engineering">Engineering</form:option>
							<form:option value="HR">HR</form:option>
							<form:option value="IT">IT</form:option>
							<form:option value="Cloud">Cloud</form:option>
						</optgroup>
					</form:select>
				</div>
			</div>



			<div align="center">
				<input type="submit" value="Save" class="btn btn-primary"/> 
				<input type="reset" value="Cancel" class="btn btn-danger">
			</div>
		</form:form>
	</div>


</body>
</html>