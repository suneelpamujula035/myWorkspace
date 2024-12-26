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
		<h2>Create Meeting</h2>

		<form:form action="saveMeeting" modelAttribute="employee"
			method="POST">

			
			<form:hidden path="id" />

			<div class="form-group">
				<label class="control-label col-sm-2">Meeting Title:</label>
				<div class="col-sm-4">
					<form:input path="meetings.meetingTitle" class="form-control"
						required="required" />
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2">Event Color:</label>
				<div class="col-sm-4">
					<form:input path="meetings.eventColor" class="form-control"
						required="required" />
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2">Start Date:</label>
				<div class="col-sm-4">
					<form:input path="meetings.startDate" class="form-control" required="required" />
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2">End Date:</label>
				<div class="col-sm-4">
					<form:input path="meetings.endDate" class="form-control" required="required" />
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2">Location:</label>
				<div class="col-sm-4">
					<form:select path="meetings.location" class="form-control"
						required="required">
						<optgroup label="Select Location">
							<form:option value="Ganga">Ganga</form:option>
							<form:option value="Jamuna">Jamuna</form:option>
							<form:option value="Sarasvati">Sarasvati</form:option>
						</optgroup>
					</form:select>
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2">Invitees:</label>
				<div class="col-sm-4">
					<form:select path="meetings.invitees" class="form-control"
						required="required">
						<optgroup label="Select Employee">
							<form:option value="Suneel">Suneel</form:option>
							<form:option value="Mahesh">Mahesh</form:option>
							<form:option value="Guru">Guru</form:option>
							<form:option value="Pawan">Pawan</form:option>
							<form:option value="Suresh">Suresh</form:option>
						</optgroup>
					</form:select>
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2">Meeting Link:</label>
				<div class="col-sm-4">
				<form:input path="meetings.meetingLink" class="form-control" required="required" />
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