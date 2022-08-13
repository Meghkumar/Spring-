<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Name is. ${Student.name }</h1>
	<h1>Id is. ${Student.id }</h1>
	<h1>Date is. ${Student.date}</h1>


	<h1>
		Courses are.
		<c:forEach var="course" items="${courses }">
			<h1>${course}</h1>
		</c:forEach>
	</h1>


	<h1>Gender is. ${Student.gender }</h1>
	<h1>Type is. ${Student.type}</h1>
	<h1>Street is. ${Student.address.street}</h1>
	<h1>City is. ${Student.address.city}</h1>

</body>
</html>