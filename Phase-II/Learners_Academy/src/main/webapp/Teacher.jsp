<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Teacher"%>
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
	<h2>Class List</h2>
<table border="1">
	<tr>
		<th>Id</th>
		<th>Class</th>
	</tr>
	<%
	Object obj = session.getAttribute("obj");
		List<Teacher> listOfTcr = (List<Teacher>)obj;
		Iterator<Teacher> li = listOfTcr.iterator();
		while(li.hasNext()){
			
			Teacher tcr = li.next();
	%>
		<tr>
			<td><%=tcr.getId() %></td> 
			<td><%=tcr.getTeacher_name() %></td>
		</tr>
		<% 
	}
	%>
</table>
<br/>
	<a href="AddTeacher.jsp">Add Teacher</a><br>
	<a href="Index.jsp">Go to index page</a>
</body>
</html>