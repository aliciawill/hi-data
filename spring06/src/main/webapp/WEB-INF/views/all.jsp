<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- JSTL(JavaStandard Tag Library -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	td{
		width: 150px;
		text-align: center;
	}
	.left {
		background: lime;
	}
	.right{
		background: lightblue;
	}
	hr{
		height: 30px;
		width: 300px;
		background: red;
		margin: 10px;
	}
	.text {
		font-family: "궁서"
	}
</style>
</head>
<body>

<c:forEach  items="${list}" var="one"  >
<table border=1>
	<tr>
		<td class="left">아이디</td>
		<td class="right">${one.id}</td> 
	</tr>
	<tr>
		<td class="left">패스워드</td>
		<td class="right">${one.pw}</td> <!-- one.getId()  -->
	</tr>
	<tr>
		<td class="left text">이름</td>
		<td class="right text" >${one.name}</td> 
	</tr>
	<tr>
		<td class="left">전화번호</td>
		<td class="right">${one.tel}</td> 
	</tr>
</table>
<hr>
</c:forEach>

</body>
</html>