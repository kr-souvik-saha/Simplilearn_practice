<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Store Teacher</h2>
<form action="TeacherController" method="post">
	<label>Name</label>
	<input type="text" name="name"><br/>
	<input type="submit" value="Submit">
	<input type="reset" value="reset">
</form>
<a href="Index.jsp">Go to index page</a>
</body>
</html>