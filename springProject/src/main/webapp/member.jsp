<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/project.css">
</head>
<body>
	<div id="total">
		<div id="top">
			<jsp:include page="top.jsp"></jsp:include>
		</div>
		<div id="top2">
			<jsp:include page="top2.jsp"></jsp:include>
		</div>
		<div id="center">
			<h3>회원가입</h3>
			<form action="create">
				<table>
					<tr>
						<td class="left">아이디</td>
						<td class="right"><input type="text" name="id"></td>
					</tr>
					<tr>
						<td class="left">패스워드</td>
						<td class="right"><input type="text" name="pw"></td>
					</tr>
					<tr>
						<td class="left">이름</td>
						<td class="right"><input type="text" name="name"></td>
					</tr>
					<tr>
						<td class="left">전화번호</td>
						<td class="right"><input type="text" name="tel"></td>
					</tr>
					<tr>
						<td colspan="2">
						<button type="submit">서버로 전송</button>
						</td>
					</tr>
				</table>
			</form>
			<hr>
			<h3>로그인</h3>
			<form action="check">
					<table>
					<tr>
						<td class="left">아이디</td>
						<td class="right"><input type="text" name="id"></td>
					</tr>
					<tr>
						<td class="left">패스워드</td>
						<td class="right"><input type="text" name="pw"></td>
					</tr>
					<tr>
						<td colspan="2">
						<button type="submit">서버로 전송</button>
						</td>
					</tr>
				</table>
			</form>
		</div>
	</div>
</body>
</html>