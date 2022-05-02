<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form name="frm" action="StudnetGetServlet" method="get">
		<input type="hidden" name="cmd" value="search">
		학생번호 : <input	type="text" name="user_id"> <br>
		학생이름 : <input type="text" name="user_name"> <br>
		영어점수 : <input type="number" name="eng_score" > <br>
		국어점수 : <input type="number" name="kor_score"> <br>
		<input type="submit" value="조회">
		<input id="addbtn" type="button" value="입력">
		<input id="modbtn" type="button" value="수정">
		<input id="delbtn" type="button" value="삭제">
	</form>
	<script>
	let btn = document.querySelector('#addbtn');
	btn.addEventListener('click', () => {
	  let frm = document.forms.frm;
	  
	  frm.action = "StudnetGetServlet";
	  frm.method = "post";
	  frm.cmd.value = "add";

	  frm.submit();
	});
	
	let delbtn = document.getElementById('delbtn');
	delbtn.addEventListener('click', ()=>{
	  let frm = document.forms.frm;

	  frm.action = "StudnetGetServlet";
	  frm.method = "post";
	  frm.cmd.value = "del";
	  
	  frm.submit();
	})
	
	</script>
	<a href="studentList.jsp"> 리스트로 </a>
</body>
</html>