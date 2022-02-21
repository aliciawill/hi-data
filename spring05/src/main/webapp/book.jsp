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
<h3>북마크정보검색</h3>
<form action="one2">
아이디 : <input type="text" name="id"><br>
<button type="submit">서버로 전송</button>
</form>
<hr>

<h3>북마크전체검색</h3>
<a href="all2">
	<button>전체 검색 요청</button>
</a>
<hr>
<h3>북마크 추가</h3>
<form action="create2">
아이디 : <input type="text" name="id"><br>
이름 : <input type="text" name="name"><br>
URL : <input type="text" name="url"><br>
IMG : <input type="text" name="img"><br>
<button type="submit">서버로 전송</button>
</form>
<hr>
<h3>북마크 수정</h3>
<form action="up2">
아이디 : <input type="text" name="id"><br>
이름 : <input type="text" name="name"><br>
<button type="submit">서버로 전송</button>
</form>
</body>
</html>