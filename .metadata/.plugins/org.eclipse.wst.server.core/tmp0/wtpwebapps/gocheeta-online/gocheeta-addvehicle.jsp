<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib prefix="tag" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<!-- Latest compiled and minified CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
<meta charset="ISO-8859-1">
<title>GoCheeta</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
		<div class="container-fluid">
			<a class="navbar-brand" href="/gocheeta-online/Vehicle">Vehicle </a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link" aria-current="page"
						href="/gocheeta-online/Vehicle">View All</a></li>
					<li class="nav-item"><a class="nav-link active"
						href="/gocheeta-online/AddVehicle">Add New</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="container">
		<p style="color: red;">${message}</p>

		<br />
		<form action="Vehicle?type=add" method="post">

			<table style="width: 50%">
				<tr>
					<td><label for="txtnumberPlate">Number Plate</label></td>
					<td><input type="text" class="form-control" id="numberPlate"
						name="numberPlate"></td>

				</tr>
				<tr>
					<td></td>
				</tr>
				<tr>
					<td><label for="txtcategoryID">Category ID</label></td>
					<td><input type="text" class="form-control" id="txtcategoryID"
						name="categoryID"></td>
				</tr>
				<tr>
					<td></td>
					<td>

						<button class="btn btn-info">Add New Vehicle</button>
					</td>
				</tr>
			</table>

			<br /> <br />


		</form>
	</div>
</body>
</html>