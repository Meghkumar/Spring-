<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link href="css/mystyle.css" rel="stylesheet" type="text/css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

<style>
.banner-background {
	clip-path: polygon(30% 0%, 70% 0%, 100% 0, 100% 99%, 68% 80%, 31% 99%, 0 80%, 0 0)";
}
</style>

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">




<!-- 	font awesome -->

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">




<title>Register Page</title>
</head>
<body>

	<%@include file="normal_navbar.jsp"%>


	<main class="primary-background p-5 banner-background ">
		<div class="container">
			<div class="col-md-6 offset-md-3">

				<div class="card">

					<div class="card-header text-center primary-background text-white font-weight-bold"><h2>Register here<h2></h2></div>
					<div class="card-body">

						<form action="RegisterServlet" method="POST">
							<div class="mb-3">
								<label for="user_name" class="form-label">User Name</label> <input
									name="user_name" type="text" class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp">

							</div>

							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Email
									Address</label> <input name="user_email" type="email" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp">
								<div id="emailHelp" class="form-text">We'll never share
									your email with anyone else.</div>
							</div>

							<div class="mb-3">
								<label for="exampleInputPassword1" class="form-label">Password</label>
								<input name="user_password" type="password" class="form-control"
									id="exampleInputPassword1">
							</div>

							<div class="mb-3">
								<label for="gender">Select Gender</label>
								<br>
								<input type="radio" id="gender" name="gender">Male
								<input type="radio" id="gender" name="gender">Female
							</div>

											<div class="form-group">
											
											<textarea name="about" class="about" rows="5" cols="50" placeholder="Enter something about yourself"></textarea>
											
											</div>
	

							<div class="mb-3 form-check">
								<input name="check" type="checkbox" class="form-check-input"
									id="exampleCheck1"> <label class="form-check-label"
									for="exampleCheck1">agree terms and condition</label>
							</div>
							<br>
							<button type="submit" class="btn btn-primary">Submit</button>
						</form>


					</div>



				</div>
			</div>

		</div>

	</main>







	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>