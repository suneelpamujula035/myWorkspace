<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RegistrationPage</title>
<style type="text/css">
.error {
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 30px;
}
</style>
</head>
<body>
	<h1 align="center">Please register here</h1>

	<div align="center">
		<form:form action="registation-success" method="get"
			modelAttribute="userReg">
			<table>
				<tr>
					<td><label>Name : </label></td>
					<td><form:input path="name" /></td>
					<td><form:errors path="name" cssClass="error" /></td>
				</tr>
				<tr>
					<td><label>UserName : </label></td>
					<td><form:input path="userName" /></td>
					<td><form:errors path="userName" cssClass="error" /></td>
				</tr>
				<tr>
					<td><label>Password : </label></td>
					<td><form:password path="password" /></td>
				</tr>
				<tr>
					<td><label>Country Name :</label></td>
					<td><form:select path="countryName">
							<form:option value="ind" label="India"></form:option>
							<form:option value="pak" label="Pakisthan"></form:option>
							<form:option value="usa" label="UnitedStates"></form:option>
							<form:option value="sri" label="Srilanka"></form:option>
							<form:option value="uk" label="UnitedKingdom"></form:option>
						</form:select></td>
				</tr>
				<tr>
					<td><label>Hobbies : </label></td>
					<td>Movies : <form:checkbox path="hobbies" value="Movies" /></td>
					<td>Reading : <form:checkbox path="hobbies" value="Reading" /></td>
					<td>Travel : <form:checkbox path="hobbies" value="Travel" /></td>
					<td>Coding : <form:checkbox path="hobbies" value="Coding" /></td>
					<td>Gardening : <form:checkbox path="hobbies"
							value="Gardening" /></td>
				</tr>
				<tr>
					<td><label>Gender : </label></td>
					<td>Male<form:radiobutton path="gender" value="male" /></td>
					<td>Female<form:radiobutton path="gender" value="female" /></td>
				</tr>
				<tr>
					<td><label>Age : </label></td>
					<td><form:input path="age" /></td>
					<td><form:errors path="age" cssClass="error" /></td>
				</tr>
				<tr>
					<td><h3 align="center">Communication</h3></td>
				</tr>
				<tr>
					<td><label>Email : </label></td>
					<td><form:input path="communicationDTO.email" /></td>
					<%-- <td><form:errors path="email" cssClass="error" /></td> --%>
				</tr>
				<tr>
					<td><label>Phone : </label></td>
					<td><form:input path="communicationDTO.phone.countryCode" /></td>
					<td><form:input path="communicationDTO.phone.userNumber" /></td>
				</tr>


				<tr>
					<td><input type="submit" value="Register" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>