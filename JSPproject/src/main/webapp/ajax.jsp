<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<script>
let url = 'StudnetGetServlet';
fetch(url)
    .then(result =>{
	    return result.json();
})
    .then(result =>{
    	console.log(result);
    })
    .catch(error =>{
    	console.log(error);
    });
	</script>

</body>
</html>