<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	td {
		width: 150px;
		height: 50px;
	}
	
	
</style>
</head>
<body bgcolor="lime">
회원정보 수정 화면입니다.
<br> ${one}
<hr color=yellow>
<form action="up">
<table border=1>
	<tr>
		<td>아이디</td>
		<td>
			<input value="${one.id}" name="id" readonly="readonly">
		</td> 
	</tr>
	<tr>
		<td>패스워드</td>
		<td>${one.pw}</td> 
	</tr>
	<tr>
		<td>이름</td>
		<td>${one.name}</td> 
	</tr>
	<tr>
		<td>전화번호</td>
		<td>
			<input value="${one.tel}" name="tel">
		</td> 
	</tr>
</table>
<button>서버로 전송.</button>
</form>
</body>
</html>