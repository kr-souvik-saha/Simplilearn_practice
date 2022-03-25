<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Student"%>
<%@page import="java.util.List"%>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Class List</h2>
<table border="1">
	<tr>
		<th>Id</th>
		<th>Student Name</th>
		<th>Class Id</th>
	</tr>
	<%
	Object obj = session.getAttribute("obj");
		List<Student> listOfStd = (List<Student>)obj;
		Iterator<Student> li = listOfStd.iterator();
		while(li.hasNext()){
			
			Student std = li.next();
	%>
		<tr>
			<td><%=std.getId() %></td> 
			<td><%=std.getStudent_name() %></td>
			<td><%=std.getClass_id() %></td>
		</tr>
		<% 
	}
	%>
</table>
<br/>
	<a href="Index.jsp">Go to index</a>
</body>
</html>