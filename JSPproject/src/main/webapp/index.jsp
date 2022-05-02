<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3>반갑습니다</h3>
	<%
	String name = "Hong";
	out.println("<h3>" + name + "</h3>");

	String id = request.getParameter("user_id");
	String uname = request.getParameter("user_name");
	if (id != null && uname != null) {
		out.print(id + uname);
	}
	%>
	<a href="./student.do"> student servlet</a>
</body>
</html>