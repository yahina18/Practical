<%@page import="java.util.List"%>
<html>
<body>
<h2>Home Page</h2>
<%
 String name = (String)request.getAttribute("Name");
 Integer id =  (Integer)request.getAttribute("ID");
 List<String> list = (List<String>) request.getAttribute("friend"); 
%>

<h1>Name is <%=name%> </h1>
<h2>ID is<%=id %></h2>
<h2>List Object<%=list %> </h2>


</body>
</html>
