<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
	String id = (String) session.getAttribute("id");
	String pw = (String) session.getAttribute("pass");

	out.print("<h3>���̵� : " + id + "</h3>");
	out.print("<h3>��й�ȣ : " + pw + "</h3>");
	%>

</body>
</html>