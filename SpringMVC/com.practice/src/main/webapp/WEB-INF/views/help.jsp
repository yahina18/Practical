<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
/* String name = (String)request.getAttribute("Name");
Integer id = (Integer)request.getAttribute("ID");
LocalDateTime time = (LocalDateTime)request.getAttribute("time"); */
%>

<h1>Name is :- ${Name }</h1>
<h1>ID is :- ${ID }</h1>
<h1>Date is :- ${time }</h1>
</body>
</html>