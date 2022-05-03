<%@page import="co.dev.vo.MemberVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>result/memberListOutput.jsp</title>

</head>
<body>

	<c:choose>
		<c:when test="${empty all}">
			<h3>정보가 없습니다.</h3>
		</c:when>
		<c:otherwise>
			<table border="1">
				<thead>
					<th>아이디</th>
					<th>이름</th>
					<th>이메일</th>
					<th>비밀번호</th>
				</thead>
				<tbody>
					<c:forEach items="${all}" var="element">
						<tr>
							<td>${element.id}</td>
							<td>${element.name}</td>
							<td>${element.email}</td>
							<td>${element.passwd}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:otherwise>
	</c:choose>
	<%@include file="home.jsp"%>
</body>
</html>