<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Class"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="ClassesController">Classs List</a><br>
<a href="Class_SubjectController">Classs Subject List</a><br>
<a href="StudentController">Student List</a><br>
<a href="TeacherController">Teacher List</a><br>
<a href="Teacher_AssignController">teacher Assigned To Class List</a><br>
<h3>Find Class details</h3>
<form action="ClassDetailsController" method="post">
		<label for="class_id">Select Class</label>
		<select id="class_id" name="class_id">
		<%
		Object obj = session.getAttribute("obj");
		List<Class> listOfCls = (List<Class>)obj;
		Iterator<Class> li = listOfCls.iterator();
		while(li.hasNext()){
			
			Class cls = li.next();
		%>
  			<option value="<%=cls.getId() %>"><%=cls.getName() %></option>
  				<% 
	}
	%>
		</select>
	<input type="text" name="sub"><br/>
	<input type="submit" value="Submit">
	<input type="reset" value="reset">
	</form>
	
</body>
</html>