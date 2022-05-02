<%@page import="co.edu.Student"%>
<%@page import="java.util.List"%>
<%@page import="co.edu.StudentDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>studentList.jsp</title>
</head>
<body>
	<table border="1">
		<thead>
			<tr>
				<th>학생번호</th>
				<th>학생이름</th>
				<th>영어</th>
				<th>국어</th>
			</tr>
		</thead>
		<tbody>
			<%
			StudentDAO dao = new StudentDAO();
			List<Student> list = dao.studentList();
			for (Student student : list) {
				out.print("<tr><td><a href = 'StudnetGetServlet?cmd=search&user_id="+student.getStudentNo()+"'>" + student.getStudentNo() + "</a></td><td>" + student.getStudentName() + "</td><td>"
				+ student.getEngScore() + "</td><td>" + student.getKorScore() + "</td></tr>");
			}
			%>
		</tbody>
	</table>
<hr>
<a href="home.jsp"> 폼 화면으로 </a>

</body>
</html>