<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Bootstrap CDN Inserted here -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

</head>
<body style="padding-left: 20px">
<h1>Welcome</h1>
<form action="ValidateLogin" method="post">
<h3>
<input type="text" name="user_id" placeholder="User Id">  
<input type="password" name="password" placeholder="Password">   
<input type="submit" value="LogIn">
</h3> 
</form>
</body> 
</html>