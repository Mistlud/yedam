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
		out.print("<button onclick=\"location.href='session.jsp'\">�α���</button>");

	} else {
		out.print("<h3>�α����� ���̵�� " + id + "</h3>");
		out.print("<button onclick=\"location.href='logout.do'\">�α׾ƿ�</button>");
	}
	%>

</body>
</html>