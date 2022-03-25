<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Teacher_Assign"%>
<%@page import="java.util.List"%>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Teacher Assigned List</h2>
<table border="1">
	<tr>
		<th>Id</th>
		<th>Class_subject_id</th>
		<th>Teacher Id</th>
	</tr>
	<%
	Object obj = session.getAttribute("obj");
		List<Teacher_Assign> listOfTcrasg = (List<Teacher_Assign>)obj;
		Iterator<Teacher_Assign> li = listOfTcrasg.iterator();
		while(li.hasNext()){
			
			Teacher_Assign tcr = li.next();
	%>
		<tr>
			<td><%=tcr.getId() %></td> 
			<td><%=tcr.getClass_subject_id() %></td>
			<td><%=tcr.getTeacher_id() %></td>
		</tr>
		<% 
	}
	%>
</table>
<br/>
	<a href="Teacqprr">Assign Teacher to a class</a><br>
	<a href="Index.jsp">Go to index page</a>
</body>
</html>