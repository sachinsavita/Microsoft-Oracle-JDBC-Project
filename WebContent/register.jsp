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

<form method="post" action="RegisterUser">

<h3>
<table>
<tr>
<th>User Id: </th>
<td><input type="text" name="user_id" placeholder="user_Id"></td>
</tr>
<tr>
<th>User Name: </th>
<td><input type="text" name="user_id" placeholder="user_name"/></td>
</tr>
<tr>
<th>Email: </th>
<td><input type="email" name="user_id" placeholder="user_email"> </td>
</tr> 
<tr>
<th>Mobile: </th>
<td><input type="text" name="user_id" placeholder="user_mobile"></td>
</tr>
<tr>
<th>Enter Password: </th>
<td><input type="password" name="password" placeholder="user_Password">  </td> 
</tr>
<tr>
<th>Confirm Password: </th>
<td><input type="password" name="password" placeholder="user_Password">  </td> 
</tr>
<tr>
<td><input type="submit" value="Register"></td>
</tr>
</table>
</h3> 

</form>

</body> 
</html>