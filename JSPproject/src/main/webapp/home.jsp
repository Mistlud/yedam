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
		�л���ȣ : <input	type="text" name="user_id"> <br>
		�л��̸� : <input type="text" name="user_name"> <br>
		�������� : <input type="number" name="eng_score" > <br>
		�������� : <input type="number" name="kor_score"> <br>
		<input type="submit" value="��ȸ">
		<input id="addbtn" type="button" value="�Է�">
		<input id="modbtn" type="button" value="����">
		<input id="delbtn" type="button" value="����">
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
	<a href="studentList.jsp"> ����Ʈ�� </a>
</body>
</html>