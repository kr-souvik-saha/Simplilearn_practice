<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Class_Subject"%>
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
	<h2>Class Subject Details</h2>
<table border="1">
	<tr>
		<th>Id</th>
		<th>Class Id</th>
		<th>Subject</th>
	</tr>
	<%
	Object obj = session.getAttribute("obj");
	List<Class_Subject> listOfClsub = (List<Class_Subject>)obj;
	Iterator<Class_Subject> li = listOfClsub.iterator();
	while(li.hasNext()){
		
		Class_Subject clsub = li.next();
		
		%>
		<tr>
			<td><%=clsub.getId() %></td>
			<td><%=clsub.getClass_id() %></td>
			<td><%=clsub.getSub_name() %></td>
		</tr>
		<% 
	}
	%>
</table>
<br/>
	<a href="AddClassSubjectController">Add Subject To Class</a><br>
	<a href="Index.jsp">Go to index page</a>
</body>
</html>