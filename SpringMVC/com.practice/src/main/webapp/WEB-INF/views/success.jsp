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

<h1> ${Header}</h1>
<p>  ${title}</p>
</hr> 

<h1> Name , ${user.name} </h1>
<h1> Email , ${user.email} </h1>
<h1> Password,  ${user.password} </h1>

</body>
</html>