<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link 	rel="stylesheet" 
		type="text/css" 
		href="resources/css/project.css" >
</head>
<body>
<div id="total">
	<div id="top">
		<jsp:include page="../../top.jsp"></jsp:include>
	</div>
	<div id="top2">
		<jsp:include page="../../top2.jsp"></jsp:include>
	</div>
	<div id="center">
	<h3>로그인 실패입니다. 다시 시작해주세요.</h3>
	<hr>
	<a href="member.jsp">
		<button>로그인 페이지로.</button>
	</a>
	</div>
</div>
</body>
</html>