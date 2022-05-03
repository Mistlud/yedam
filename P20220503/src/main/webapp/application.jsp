<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>appjsp</title>
</head>
<body>

	<%
	String name = (String) application.getAttribute("name");
	out.print("<h3>" + name + "</h3>");
	%>

</body>
</html>