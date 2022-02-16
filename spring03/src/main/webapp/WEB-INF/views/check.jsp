<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="background:blue;">
회원 로그인 결과 >>> ${user}가 id인 <%= session.getAttribute("name") %>님이 로그인했습니다. <br>
<a href="index.jsp">첫 페이지로</a>
</body>x
</html>