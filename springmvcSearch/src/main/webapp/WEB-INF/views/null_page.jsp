<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="en">

<head>
<!-- required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- bootstrap css -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
	integrity="sha384-ggoyr0ixcbmqv3xipma34md+dh/1fq784/j6cy/ijtquohcwr7x9jvorxt2mzw1t"
	crossorigin="anonymous">

<!-- now with the help of taglib tag we will map css in this page (as if we want to include link of javascript and css we need to use jstl tag format)-->



<title>home page</title>
</head>

<body>

	<section>
		<div class="container" style="text-align: center; line-height: 10px;">


			<div class="col-sm-1  ">
				<div class="col-sm-1  text-center">
					<div class="four_zero_four_bg">
						<h1 class="text-center  " style="font-size: 50px;">Oops!
							Sorry</h1>
							<h2>${msg}</h2>


					</div>

					<div class="contant_box_404">
						<h3 class="h2" style="font-size: 30px;">Something went
							wrong!!</h3>

						<p style="font-size: 20px;">Sorry an error page has occured,
							Requested page not found</p>

						<a href="" class="link_404" style="font-size: 20px;">Take me
							Home</a>&nbsp;&nbsp;&nbsp; <a href="" class="link_404"
							style="font-size: 20px;">Contact Support</a>
					</div>
				</div>
			</div>


		</div>
		</div>
	</section>



	<!-- optional javascript -->
	<!-- jquery first, then popper.js, then bootstrap js -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/x+965dzo0rt7abk41jstqiaqvgrvzpbzo5smxkp4yfrvh+8abtte1pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
		integrity="sha384-uo2et0cphqdsjq6hjty5kvphtphzwj9wo1clhtmga3jdzwrnqq4sf86dihndz0w1"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
		integrity="sha384-jjsmvgyd0p3pxb1rribzuayoiiy6orq6vrjieaff/njgzixfdsf4x0xim+b07jrm"
		crossorigin="anonymous"></script>
</body>

</html>