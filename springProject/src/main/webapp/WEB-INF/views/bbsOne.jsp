<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	$(function() {
		$('#insertBtn').click(function() {
			$.ajax({
				url : "replyInsert",
				data : {
					bbsId : ${one.id},
					content : $('#reply').val(),
					writer : '${userId}'
				},
				success: function(result) {
					$('#reply').val('')
					//성공하면, 현재 목록 아래에 붙여넣자.!
					//alert('성공>> ' + result)
					$('#replyTable').append(result + "<br>")
				},
				error: function() {
					alert("ERROR!!")
				}
				
			})
		})
		
		$('#del').click(function() {
			if(confirm("정말로 삭제하시겠습니까?")){
				//controller의 bbsDel요청 후,
				//삭제가 성공하면, 
				//bbs.jsp로 화면을 넘기면 됨
				$.ajax({
					url: "bbsDel",
					data: {
						id: ${one.id}	
					},
					success : function(result) {
						/* 
						int x = 100;
						String y = "100";
						== : 기본 데이터형만 가능 
						*/
						//js: 타입이 달라도 기본형과 String까지 비교 가능
						/* 
						x = 100
						y = '100'
						x == y 타입이 달라도 비교 가능 
						x === y 타입이 동일해야 같다고 판단하는 비교 가능. */
						
						if(result == '1'){
							location.href = "bbs.jsp"
						}
					}
				})
			}
		})
	})
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
			</a>
			<!-- 로그인한 사람과 작성자가 동일하면
				수정, 삭제 버튼을 나타나게 해주자.
				세션값과 one.writer가 동일하면!!
			 -->
			<c:if test="${userId eq one.writer}">
				<a href="bbsUpdate.jsp">
					<button style="width: 200px; height: 50px;" class="btn btn-success">수정하기</button>
				</a> 
				<button id="del" style="width: 200px; height: 50px;" class="btn btn-success">삭제하기</button>
				
			</c:if>
			
			<hr color=red>
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
	<hr color=green>
	<table id="replyTable">
	<% if(session.getAttribute("userId") != null) { %>
	<tr>
		<td>
		Reply : <input id="reply" style="width: 300px;">
		<button id="insertBtn" style="width: 50px;">OK</button>		
		</td>
	</tr>
	<%} %>
	<c:forEach var="one" items="${list}">
		<tr>
			<td style='background: green; width: 450px; text-align: left; padding-left: 10px;'>
				<img src="resources/img/re.png" width=30 height=30>${one.content} - ${one.writer}
			</td>
			<td style="background: green; width: 50px; text-align: right;">
			<c:if test="${userId eq one.writer}">
				<button id="deleteBtn" style="width: 50px;">X</button>
			</c:if>
			</td>
		</tr>
	</c:forEach>
	</table>

		</div>
	</div>
</body>
</html>