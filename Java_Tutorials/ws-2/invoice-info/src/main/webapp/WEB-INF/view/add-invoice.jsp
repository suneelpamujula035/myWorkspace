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
	<div class="container-fluid">
		<h2>Invoice Info</h2>

		<form:form action="saveInvoice" modelAttribute="myModel" method="POST">

			<form:hidden path="invoiceDto.id" />

			<div class="form-group">
				<label class="control-label col-sm-2" for="bill">Bill To:</label>
				<div class="col-sm-4">
					<form:select path="invoiceDto.billTo" class="form-control"
						id="bill" required="required">
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
					<form:input path="invoiceDto.invoiceNumber" class="form-control"
						id="invnum" />
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2" for="sta">Status:</label>
				<div class="col-sm-4">
					<form:select path="invoiceDto.status" class="form-control" id="sta"
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
					<form:input type="date" path="invoiceDto.date" class="form-control"
						id="invdate" required="required" />
				</div>


				<div class="form-group">
					<label class="control-label col-sm-2" for="duedate">Due
						Date:</label>
					<div class="col-sm-4">
						<form:input type="date" path="invoiceDto.dueDate"
							class="form-control" id="duedate" required="required" />
					</div>
				</div>
				<!-- <div>
					<p id="output"></p>
				</div> -->
			</div>


			<div class="form-row">
				<h2>Invoice Details:</h2>
				<table border="1" class="table table-striped" id="myTable">
					<thead>
						<tr>
							<th>SNo</th>
							<th>Product</th>
							<th>Description</th>
							<th>Price(INR)</th>
							<th>Quantity</th>
							<th>Tax(%)</th>
							<th>Total</th>
							<th>Action</th>
						</tr>
					</thead>


					<tbody id="tableBody">

						<tr>

							<td><form:hidden path="productDto[0].id" id="productId"
									value="1" name="id" class="form-control" /></td>
							<td><form:select path="productDto[0].productName"
									id="product" name="product" class="form-control">
									<optgroup label="Select Product">
										<form:option value="laptop">laptop</form:option>
										<form:option value="mobile">mobile</form:option>
										<form:option value="book">book</form:option>
										<form:option value="shirt">shirt</form:option>
										<form:option value="shoes">shoes</form:option>
										<form:option value="earphones">earphones</form:option>
									</optgroup>
								</form:select></td>
							<td><form:textarea path="productDto[0].description"
									id="description" name="description" class="form-control" rows="2" cols="2" maxlength="500"/></td>
							<td><form:input path="productDto[0].price" id="price"
									name="price1" class="form-control" /></td>
							<td><form:input path="productDto[0].quantity" id="quantity"
									name="qty" class="form-control" /></td>
							<td><form:input path="productDto[0].tax" id="tax" name="tax"
									class="form-control" /></td>
							<td><form:input path="productDto[0].total" id="total"
									name="total" class="form-control" /></td>
						</tr>
					</tbody>

					<tr>
						<td colspan="7"></td>
						<td><input type="button" class="add btn btn-success"
							onclick="addNewRow();" value="Add New"></td>
					</tr>
					<tr>
						<td colspan="6"
							style="border-left: hidden; border-bottom: hidden;"></td>
						<td>Sub Total :</td>
						<td><span id="subTotal">0</span></td>
					</tr>
					<tr>
						<td colspan="6"
							style="border-left: hidden; border-bottom: hidden;"></td>
						<td>Total Tax :</td>
						<td><span id="totalTax">0</span></td>
					</tr>
					<tr>
						<td colspan="6"
							style="border-left: hidden; border-bottom: hidden;"></td>
						<td>Grand Total:</td>
						<td><form:input path="invoiceDto.amount" id="grandTotal" readonly="readonly"/></td>
					</tr>
				</table>
			</div>
	</div>
	<div class="form-row">
		<div class="form-group col-md-2">
			<label>Invoice Note :</label>
		</div>
		<div class="form-group col-md-4">
			<textarea class="form-control" id="invoiceNote" rows="3" maxlength="500"></textarea>
		</div>

		<div class="form-group col-md-2">
			<label>Attachment :</label>
		</div>
		<div class="form-group col-md-4">
			<input type="file" class="form-control" id="attachment"
				placeholder="Attachment">
		</div>
	</div>
	<div align="center">
				<input type="submit" value="Save" class="btn btn-primary" onclick="return compareDates()" />
					 <input type="reset" value="Cancel"
					class="btn btn-danger">
			</div>
	</form:form>

	<script>
		function addNewRow() {
			var productId = document.getElementById("productId").value;
			var product = document.getElementById("product").value;
			var description = document.getElementById("description").value;
			var price = document.getElementById("price").value;
			var quantity = document.getElementById("quantity").value;
			var tax = document.getElementById("tax").value;
			var total = parseInt(price) * parseInt(quantity);
			var subTotal = 0;
			var totalTax = 0;
			var grandTotal = 0;
			if (product == "") {
				alert("Product must be entered");
			} else if (description == "") {
				alert("Description must be entered");
			} else if (price == "") {
				alert("Price must be entered");
			} else if (quantity == "") {
				alert("Quantity must be entered");
			} else {
				var table = document.getElementById("tableBody");
				var tableLength = (table.rows.length);
				var row = table.insertRow(tableLength).outerHTML = "<tr id='row" + tableLength + "'> "
						+ "<td id='productId"+tableLength+"'><input type='text' id='productId' name='productDto["+tableLength+"].id' value='"+productId+"' class='form-control'></td> "
						+ "<td id='product"+tableLength+"'><input type='text' id='product'  name='productDto["+tableLength+"].productName' value='"+product+"' class='form-control'></td> "
						+ "<td id='description"+tableLength+"' ><input type='text' id='description' name='productDto["+tableLength+"].description' value='"+description+"' class='form-control'></td> "
						+ "<td id='price"+tableLength+"' ><input type='text' id='price' name='productDto["+tableLength+"].price' value='"+price+"' class='form-control'></td> "
						+ "<td id='quantity"+tableLength+"' ><input type='text' id='quantity' name='productDto["+tableLength+"].quantity' value='"+quantity+"' class='form-control'></td> "
						+ "<td id='tax"+tableLength+"' ><input type='text' name='productDto["+tableLength+"].tax' value='"+tax+"' id='tax1"+tableLength+"' class='form-control'></td> "
						+ "<td id='total"+tableLength+"' ><input type='text' name='productDto["+tableLength+"].total' value='"+total+"' id='total1"+tableLength+"' class='form-control'></td> "
						+ "<td><i class='fa fa-trash' style='font-size:24px' onclick='deleteRow("
						+ tableLength + ")'> </i></td> " + "</tr>";

				for (var i = 1; i <= tableLength; i++) {
					subTotal = subTotal + parseInt(document.getElementById("total1" + i).value);
					totalTax = totalTax + parseInt(document.getElementById("tax1" + i).value);
				}
				
				grandTotal = subTotal + totalTax;
				
				document.getElementById("productId").value = parseInt(productId) + 1;
				document.getElementById("product").value;
				document.getElementById("description").value = "";
				document.getElementById("price").value = "";
				document.getElementById("quantity").value = "";
				document.getElementById("tax").value = "";
				document.getElementById("total").value = "";
				document.getElementById("subTotal").innerHTML = subTotal;
				document.getElementById("totalTax").innerHTML = totalTax;
				document.getElementById("grandTotal").value = grandTotal;
			}
		}

		function deleteRow(no) {
			document.getElementById("row" + no + "").outerHTML = "";
			document.getElementById("subTotal").innerHTML = "";
			document.getElementById("totalTax").innerHTML = "";
			document.getElementById("grandTotal").innerHTML = "";
		}

		function compareDates() {
		var inv_date = new Date(document.getElementById("invdate").value);
			var due_date = new Date(document.getElementById("duedate").value);

			var invoiceDate = new Date(inv_date);
			var dueDate = new Date(due_date);

			if (invoiceDate > dueDate) {
				alert("Due Date should be greater than Invoice Date");
				return false;
			}

		}
	</script>
</body>
</html>