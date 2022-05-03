<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>main</title>
</head>
<body>

	<%
	String id = (String) session.getAttribute("id");
	if (id == null) {
		out.print("<button onclick=\"location.href='session.jsp'\">로그인</button>");

	} else {
		out.print("<h3>로그인한 아이디는 " + id + "</h3>");
		out.print("<button onclick=\"location.href='logout.do'\">로그아웃</button>");
	}
	%>

</body>
</html>