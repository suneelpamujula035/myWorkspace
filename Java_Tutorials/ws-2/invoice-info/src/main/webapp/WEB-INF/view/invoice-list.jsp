<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
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
<body class="myFonts">
	<style>
a {
	text-decoration: none;
}
</style>
	<div class="container">
		<h1 align="center">Invoice List</h1>
		<div align="center">
			<form action="searchInvoice" method="GET">
				<input type="text" name="search"> <input type="submit"
					value="Search" class="btn btn-success">
			</form>
		</div>
		<form action="showAddInvoicePage">
			<input type="submit" value="Add Invoice" class="btn btn-success">
		</form>


		<br />
		<table border="1" class="table table-striped">
			<thead>
				<tr>
					<th>SNo</th>
					<th>Invoice No</th>
					<th>Bill To</th>
					<th>Date</th>
					<th>Due Date</th>
					<th>Status</th>
					<th>Amount(INR)</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:choose>
					<c:when test="${invoices.size() > 0 }">
						<c:forEach var="invoice" items="${invoices}">
							<tr>
								<td>${invoice.id}</td>
								<td>${invoice.invoiceNumber}</td>
								<td>${invoice.billTo}</td>
								<td>${invoice.date}</td>
								<td>${invoice.dueDate}</td>
								<td>${invoice.status}</td>
								<td>${invoice.amount}</td>
								<td><a
									href="http://localhost:8080/updateInvoice?invoiceId=${invoice.id}"><i
										class="fa fa-edit" style="font-size: 24px; color: black"></i></a>
									<a
									href="http://localhost:8080/deleteInvoice?invoiceId=${invoice.id}"
									onclick="if(!(confirm('Are you sure you want to delete this invoice?'))) return false"><i
										class='fa fa-trash' style="font-size: 24px; color: black"></i></a></td>
							</tr>
						</c:forEach>
						<div align="right">
							<a href="http://localhost:8080"><button
									class="btn btn-primary">Home</button></a>
						</div>
						<div align="right">
							<h6>Showing ${pageNo+1} of 3 of ${totalInvoicesCount}
								entries</h6>
							<c:forEach var="i" begin="0" end="${lastPageNo-1 }">
								<a href="/?pageNo=${i}"><button type="button"
										class="btn btn-secondary">${i+1}</button> </a>
							</c:forEach>
						</div>
					</c:when>
					<c:otherwise>
						<tr align="center">
							<td colspan="8">No Invoices available</td>
						</tr>
					</c:otherwise>
				</c:choose>

				<%-- <c:choose>
			<c:when test="${invoices.size() > 0 }">
			
			</c:when>
			<c:otherwise>
            <tr align="center">
                <td colspan="8">No Invoices available</td>
            </tr>
        </c:otherwise>
			</c:choose> --%>
			</tbody>

		</table>
	</div>
</body>
</html>