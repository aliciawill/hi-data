<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/project.css">
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<!-- 부가적인 테마 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script>
<script type="text/javascript">
	
</script>
<style>
.left {
	background: pink;
	width: 50px;
}

.right {
	background: white;
	width: 150px;
}
</style>
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
			<span style="font-size: 25px;">게시물 상세 페이지</span>
			<hr color=red>

			<a href="bbs.jsp">
				<button style="width: 200px; height: 50px;" class="btn btn-success">게시물
					전체 목록으로!</button>
			</a><br>
			<table width="500px">
				<tr>
					<td class="left">번호</td>
					<td class="right">${one.id}</td>
					<!-- one.getId() -->
				</tr>
				<tr>
					<td class="left">제목</td>
					<td class="right">${one.title}</td>
				</tr>
				<tr>
					<td class="left">내용</td>
					<td class="right" style="height: 100px;">${one.content}</td>
				</tr>
				<tr>
					<td class="left">작성자</td>
					<td class="right">${one.writer}</td>
				</tr>
			</table>

		</div>
	</div>
</body>
</html>