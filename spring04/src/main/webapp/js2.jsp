<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	
</script>
</head>
<body>
	<h3>자바 스크립트 테스트</h3>
	<hr>
	아이디 :
	<input name="id" id="id" value="test">
	<br>
	<button onclick="idCheck()">입력 글자수 확인</button>
	<br> 패스워드1 :
	<input name="pw1" id="pw1" value="1234">
	<br> 패스워드2 :
	<input name="pw2" id="pw2" value="1234">
	<br>
	<button onclick="pwCheck()">입력 패스워드 일치 확인</button>
	<br>
	<hr>
	<div id="result"></div>
</body>
</html>






