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
	<h2>Store Class Subject</h2>
	<form action="AddClassSubjectController" method="post">
		<label for="class_id">Class</label>
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
	<label>Subject Name</label>
	<input type="text" name="sub"><br/>
	<input type="submit" value="Submit">
	<input type="reset" value="reset">
	</form>
	
	<a href="Index.jsp">Go to index page</a>
</body>
</html>