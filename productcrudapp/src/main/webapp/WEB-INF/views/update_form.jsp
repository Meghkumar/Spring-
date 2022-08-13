<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<title>Update Form</title>

<%@ include file="./base.jsp"%>
</head>

<body>


	<div class="container mt-4" style="width: 40%;">

		<h1 class="text-center">Change Product Details</h1>

		<form action="${pageContext.request.contextPath }/handle-product" method="post">
			
			<input type="hidden" value="${product.id }" name="id">
			
			<div class="form-group">
				<label for="exampleFormControlInput1">Product Name</label> <input
					type="text" class="form-control" id="exampleFormControlInput1"
					placeholder="Enter your Product name here" name="name" value="${product.name }">
			</div>


			<div class="form-group">
				<label for="exampleFormControlTextarea1">Product Description</label>
				<textarea class="form-control" id="exampleFormControlTextarea1"
					rows="5" placeholder="Enter the Product Description here"
					name="description" ${product.description }></textarea>
			</div>

			<div class="form-group">
				<label for="exampleFormControlTextarea1">Product Price</label> <input
					type="text" name="price" placeholder="Enter your product price"
					class="form-control" value="${product.price }">
			</div>
			<div class="container text-center">
				<a href="${pageContext.request.contextPath }/"
					class="btn btn-outline-danger">Back</a>
				<button class="btn btn-info " type="submit">Update</button>
			</div>
		</form>
	</div>




	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
</body>

</html>