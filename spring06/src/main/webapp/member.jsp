<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<img src="resources/img/naver.png">
<h3>회원정보검색</h3>
<form action="one">
아이디 : <input type="text" name="id"><br>
<button type="submit">서버로 전송</button>
</form>
<hr>

<h3>회원전체검색</h3>
<a href="all">
	<button>전체 검색 요청</button>
</a>
<hr>
<h3>회원가입</h3>
<form action="create">
아이디 : <input type="text" name="id"><br>
패스워드 : <input type="text" name="pw"><br>
이름 : <input type="text" name="name"><br>
전화번호 : <input type="text" name="tel"><br>
<button type="submit">서버로 전송</button>
</form>
<hr>
<h3>회원수정</h3>
<form action="up">
아이디 : <input type="text" name="id"><br>
전화번호 : <input type="text" name="tel"><br>
<button type="submit">서버로 전송</button>
</form>
</body>
</html>