<%@page import="java.util.List"%>
<%@page import="springmvc.controller.HomeController"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>

<h1>Hello This is Home Page</h1>


<%

String name = (String)request.getAttribute("name");
Integer id =(Integer) request.getAttribute("id");
List<String> friends = (List<String>)request.getAttribute("friend");
%>

<h1>My name is <%=name %> and my age is <%=id %></h1>
<h1>My friends are 
<% 

for(String s:friends)
{
	out.println(s+",");
}

%></h1>

</body>
</html>