<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

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

<title>Home Page</title>
</head>

<body>


	<div class="container mt-5" style="width: 35%;">
		<div class="card">

			<div class="card-body">
				<h2 class="text-center">Complex Form</h2>

				<div class="alert alert-warning" role="alert">
				
				<form:errors path="Student.*"/>
				
				</div>
				<form action="handleform" method="post">
					<div class="form-group">
						<label for="exampleInputEmail1">Your Name</label><br> <input
							type="text" class="form-control" name="name"
							placeholder="Enter your Name"> <small id="emailhelp"
							class="form-text text-muted">We will never share your
							name.</small>
					</div>

					<div class="form-group">
						<label for="exampleInputEmail1">Your Id</label><br> <input
							type="text" class="form-control" name="id"
							placeholder="Enter your Id">

					</div>

					<div class="form-group">
						<label for="exampleInputEmail1">Your DOB</label><br> <input
							type="date" class="form-control" name="date"
							placeholder="DD/MM/YYYY">

					</div>

					<div class="form-group">
						<label for="exampleInputEmail1">Select Course</label><br> <select
							name="courses" class="form-control" multiple="multiple">
							<option value="java">Java</option>
							<option value="Python">Python</option>
							<option value="C++">C++</option>
							<option value="Django">Django</option>
							<option value="Spring Framework">Spring Framework</option>
						</select>
					</div>

					<div class="form-group">

						<span class="mr-3">Select Gender</span>

						<div class="form-check form-check-inline">
							<input type="radio" class="form-chechk-label" name="gender">Male
						</div>

						<div class="form-check form-check-inline">
							<input type="radio" class="form-chechk-label" name="gender">Female
						</div>
					</div>

					<div class="form-group">
						<label for="exampleInputEmail1">Select Type</label><br> <select
							name="type" class="form-control">
							<option value="oldstudent">Old Student</option>
							<option value="normalstudent">Normal Student</option>
						</select>

						<div class="card mt-4">
							<div class="card-body">
								<p>Your Address</p>
								<input type="text" class="form-control" name="address.street"
									placeholder="Enter your Street"> <input type="text"
									class="form-control mt-4" name="address.city"
									placeholder="Enter your City">

							</div>
						</div>

						<div class="container text-center mt-4">
							<button type="submit" class="btn btn-info">Submit</button>

						</div>


					</div>

				</form>

			</div>

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