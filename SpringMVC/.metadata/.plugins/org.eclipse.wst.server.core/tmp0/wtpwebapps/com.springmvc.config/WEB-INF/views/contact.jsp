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

<div class = "container mt-5">
   <h3 class = "text-center">Registration Form</h3>
   <h1>${Header}</h1>
   <p>${Desc}</p>

<form action="processform" method = "post">

<div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Email address</label>
    <input 
    type="email" 
    class="form-control" 
    id="exampleInputEmail1" 
    aria-describedby="emailHelp"
    name = "email">
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Password</label>
    <input 
    type="password"
    class="form-control" 
    id="exampleInputPassword1"
    name ="password">
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>

</div>

  </body>
</html>