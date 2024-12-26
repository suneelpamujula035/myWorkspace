<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	<div class="container-fluid">
		<h2>Update Invoice Info</h2>

		<form:form action="updatingInvoice" modelAttribute="invoice"
			method="POST">

			<form:hidden path="id" />

			<div class="form-group">
				<label class="control-label col-sm-2" for="bill">Bill To:</label>
				<div class="col-sm-4">
					<form:select path="billTo" class="form-control" id="bill"
						required="required">
						<optgroup label="Select Customer">
							<form:option value="suneel">suneel</form:option>
							<form:option value="naveen">naveen</form:option>
							<form:option value="ganesh">ganesh</form:option>
							<form:option value="mahesh">mahesh</form:option>
							<form:option value="vinod">vinod</form:option>
						</optgroup>
					</form:select>
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2" for="invnum">Invoice:</label>
				<div class="col-sm-4">
					<form:input path="invoiceNumber" class="form-control" id="invnum"
						required="required" />
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2" for="sta">Status:</label>
				<div class="col-sm-4">
					<form:select path="status" class="form-control" id="sta"
						required="required">
						<optgroup label="Select Status">
							<form:option value="Paid">Paid</form:option>
							<form:option value="Sent">Sent</form:option>
							<form:option value="Draft">Draft</form:option>
						</optgroup>
					</form:select>
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2" for="invdate">Invoice
					Date:</label>
				<div class="col-sm-4">
					<form:input type="date" path="date" class="form-control"
						id="invdate" required="required" />
				</div>
			</div>


			<div class="form-group">
				<label class="control-label col-sm-2" for="duedate">Due
					Date:</label>
				<div class="col-sm-4">
					<form:input type="date" path="dueDate" class="form-control"
						id="duedate" required="required" />
				</div>
			</div>
			<input type="submit" value="Save" class="btn btn-primary" />
			<input type="reset" value="Cancel" class="btn btn-danger">
	</div>
	</div>
	</form:form>
</body>
</html>