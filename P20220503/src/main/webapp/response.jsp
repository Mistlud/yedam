<%@page import="co.edu.Student"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>response.jsp</title>
</head>
<body>
	<%
	String id = (String) request.getAttribute("id");
	String name = (String) request.getAttribute("name");
	Student student = (Student) request.getAttribute("result");
	%>
	<h3>id <%=id %></h3>
	<h3>name <%=name %></h3>
	<h3>no <%=student.getStudentNo() %></h3>
	<h3>name <%=student.getStudentName() %></h3>
	

</body>
</html>