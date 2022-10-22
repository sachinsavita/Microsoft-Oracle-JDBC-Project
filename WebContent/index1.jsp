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
<form action="Validate" method="post">
<h3>Name: <input type="text" name="name" placeholder="enter....">   
<input type="checkbox" name="skill" value="C"> C 
<input type="checkbox" name="skill" value="Java"> Java 
<input type="checkbox" name="skill" value="Python"> Python
<input type="submit">
</h3> 
</form>
</body>
</html>