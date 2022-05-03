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

	out.print("<h3>아이디 : " + id + "</h3>");
	out.print("<h3>비밀번호 : " + pw + "</h3>");
	%>

</body>
</html>