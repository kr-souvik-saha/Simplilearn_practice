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
	<h2>Class List</h2>
<table border="1">
	<tr>
		<th>Id</th>
		<th>Class</th>
	</tr>
	<%
	Object obj = session.getAttribute("obj");
		List<Class> listOfCls = (List<Class>)obj;
		Iterator<Class> li = listOfCls.iterator();
		while(li.hasNext()){
			
			Class cls = li.next();
	%>
		<tr>
			<td><%=cls.getId() %></td> 
			<td><%=cls.getName() %></td>
		</tr>
		<% 
	}
	%>
</table>
<br/>
	<a href="AddClass.jsp">Add Class</a><br>
	<a href="Index.jsp">Go to index page</a>

</body>
</html>