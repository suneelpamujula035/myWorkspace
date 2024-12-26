<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error {
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 30px;
}
</style>
<script type="text/javascript">
	function validateUserName() {
		var userName = document.getElementById('yn').value;
		if (userName.length < 3) {
			alert("Your name have atleast 3 character")
			return false;
		} else {
			return true;
		}
	}
</script>
</head>
<body>
	<h1 align="center">Love Calculator</h1>
	<hr>

	<%-- <form action="process-homepage" method="get" >
		<table>
			<div align="center">
				<tr>
					<td><label for="yn">Your Name : </label></td>
					<td><input type="text" name="userName" id="yn"></td>
				</tr>
				<tr>
					<td><label for="cn">Crush Name : </label></td>
					<td><input type="text" name="crushName" id="cn"></td>
				</tr>
				<tr>
					<td><input type="submit" value="calculate"></td>
				</tr>
			</div>
		</table>
	</form> --%>

	<form:form action="result-page" method="get"
		modelAttribute="userInfo" onsubmit="return validateUserName()">

		<table>
			<div align="center">
				<tr>
					<td><label for="yn">Your Name : </label></td>
					<td><form:input path="userName" id="yn" /></td>
					<td><form:errors path="userName" cssClass="error" /></td>
				</tr>
				<tr>
					<td><label for="cn">Crush Name : </label></td>
					<td><form:input path="crushName" id="cn" /></td>
				</tr>
				<tr>
					<td><form:checkbox path="termAndCondition" id="check" /></td>
					<td><label>I am agreeing that this is for fun</label></td>
					<td><form:errors path="termAndCondition" cssClass="error"/></td>

				</tr>
				<tr>
					<td><input type="submit" value="calculate"></td>
				</tr>
			</div>
		</table>
	</form:form>
</body>
</html>