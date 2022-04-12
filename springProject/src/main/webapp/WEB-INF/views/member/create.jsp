<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<link 	rel="stylesheet" 
		type="text/css" 
		href="resources/css/project.css" >
</head>
<body>
<div id="total">
	<div id="top">
		<jsp:include page="../../../top.jsp"></jsp:include>
	</div>
	<div id="top2">
		<jsp:include page="../../../top2.jsp"></jsp:include>
	</div>
	<div id="center">
	<br>
	<div class="alert alert-danger">
 	 <strong>오류!</strong> 회원가입에 문제가 생겼습니다. 다시 시작해주세요.
	</div>
	<hr><span class="glyphicon glyphicon-search"></span>
	<a href="member.jsp">
		<button class="btn btn-info">로그인 페이지로.</button>
	</a>
	</div>
</div>
</body>
</html>