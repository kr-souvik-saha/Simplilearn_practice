<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Class_Subject"%>
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


<h2>Assign Teacher To Class</h2>
	<form action="Teacqprr" method="post">
		<label for="class_subject_id">Class Subject</label>
		<select id="class_subject_id" name="class_subject_id">
		<%
		Object cls = session.getAttribute("cls");
		List<Class_Subject> listOfCls = (List<Class_Subject>)cls;
		Iterator<Class_Subject> li = listOfCls.iterator();
		while(li.hasNext()){
			
			Class_Subject clss = li.next();
		%>
  			<option value="<%=clss.getId() %>"><%=clss.getClass_id() %>  <%=clss.getSub_name() %></option>
  				<% 
	}
	%>
		</select><br>
	<label for="teacher_id">Teacher Name</label>
		<select id="teacher_id" name="teacher_id">
		<%
		Object tcr = session.getAttribute("tcr");
		List<Teacher> listOftcr = (List<Teacher>)tcr;
		Iterator<Teacher> lii = listOftcr.iterator();
		while(lii.hasNext()){
			
			Teacher tchr = lii.next();
		%>
  			<option value="<%=tchr.getId() %>"><%=tchr.getTeacher_name() %></option>
  				<% 
	}
	%>
		</select><br>
	<input type="submit" value="Submit">
	<input type="reset" value="reset">
	</form>
<a href="Index.jsp">Go to index page</a>
</body>
</html>