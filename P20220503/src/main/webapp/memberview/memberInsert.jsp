<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 화면</title>
</head>
<body>

<form action="../memberInsert.do" method="post">
<!-- web.xml에 *.do요청 들어오면 프론트컨트롤러 돌리라고 시킴 -->
ID : <input type="text" name="id"><br>
PW : <input type="password" name="passwd"><br>
이름 : <input type="text" name="name"><br>
메일 : <input type="email" name="email"><br>
<input type="submit" value="추가">
</form>


</body>
</html>