<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Result/insertOutput</title>
</head>
<body>
	<h3><%=(String) request.getAttribute("name")%>
		님의 가입이 완료됐습니다.
	</h3>
	<%@include file="home.jsp"%>



</body>
</html>