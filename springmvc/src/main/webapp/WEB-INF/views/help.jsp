<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@ page isELIgnored="false" %> 
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>


	<%
	//First way of getting the data 	

	/* String name = (String)request.getAttribute("name");
	Integer rollNo= (Integer)request.getAttribute("roll No");
	LocalDateTime time = (LocalDateTime )request.getAttribute("time"); */
	%>


	<h1>
		My name is
		<%-- <%=name %> --%>
		${name }
	</h1>
	<h1>
		This is a help page
		<%-- <%=rollNo %> --%>
		${rollNo }
	</h1>
	<h1>
		Current Date and Time is
		<%-- <%=time.toString() %> --%>
		${time }
	</h1>
	
	<hr>
	
	<h1>My Marks are 
	
	<c:forEach var="item" items="${marks }">
		
		<h1>${item}</h1>
	
	</c:forEach>
	
	
	</h1>	



</body>
</html>
