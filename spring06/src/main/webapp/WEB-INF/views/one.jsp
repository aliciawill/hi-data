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
회원정보 검색 결과입니다.
<br> ${one}
<hr color=yellow>
<table border=1>
	<tr>
		<td>아이디</td>
		<td>${one.id}</td> 
	</tr>
	<tr>
		<td>패스워드</td>
		<td>${one.pw}</td> <!-- one.getId()  -->
	</tr>
	<tr>
		<td>이름</td>
		<td>${one.name}</td> 
	</tr>
	<tr>
		<td>전화번호</td>
		<td>${one.tel}</td> 
	</tr>
</table>
</body>
</html>