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
			<a class="navbar-brand" href="/gocheeta-online/Vehicle">Vehicle
				</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="/gocheeta-online/Vehicle">View
							All</a></li>
					<li class="nav-item"><a class="nav-link"
						href="gocheeta-addvehicle.jsp">Add New</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<br />
	<p style="color: red;">${deletemessage}</p>
	<p style="color: red;">${errormsg}</p>

	<br />
	<br />
	<div class="container">
		<table class="table table-striped">
			<thead>
				<tr class="table-primary">
					<th scope="col">Number Plate</th>
					<th scope="col">Category ID</th>
				</tr>
			</thead>
			<tbody>
				<tag:forEach var="vehicle" items="${vehicleList}">
					<tr>
						<td>${vehicle.numberPlate}</td>
						<td>${vehicle.categoryID}</td>
						<td>
							<form action="Vehicle?type=delete" method="post">
								<button type="submit" class="btn btn-danger">Delete</button>
								<input type="hidden" name=numberPlate
									value="${vehicle.numberPlate}">
							</form>
						</td>
					</tr>
				</tag:forEach>
			</tbody>
		</table>
	</div>


</body>
</html>