<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sucess</title>
</head>
<body>

	<h1 class="text-center mt-3">${Header }</h1>
	<p class="text-center">${Desc }</p>
	
	<h1 style="color: green">${msg }</h1>

	<hr>
	
	<h1>The User Name is: ${user.username}</h1>
	<h1>The User Email is: ${user.email}</h1>
	<h1>The User Password is: ${user.password}</h1>

</body>
</html>