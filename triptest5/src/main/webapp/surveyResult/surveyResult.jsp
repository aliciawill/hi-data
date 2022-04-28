<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<script type="text/javascript" src="../resources/js/jquery-3.6.0.min.js"></script>
<script type="text/javascript">

$(function() {
	$.ajax({
		url : "surveyResultList", //views/surveyList.jsp가 결과
		success : function(result) { //결과가 담겨진 table부분코드
			$('#d1').html(result)
			//alert('ajax성공')
		},
		error : function() {
			alert('ajax실패')
		}
	})
})
</script>
<title>설문지 결과</title>
</head>
<body>
	<div id="total">
<%-- 		<div id="menu">
			<jsp:include page="top.jsp"></jsp:include>
		</div>
		<div id="memberTop">
			<jsp:include page="top2.jsp"></jsp:include>
		</div> --%>
		<div id="center">
			<h3>
				설문지
				<%
				if (session.getAttribute("member_idx") == "1") {
			%> 
				(관리자모드)
				<a href="surveyInsert.jsp"><button id="insertBtn">새 설문지 질문 추가</button></a>
				<a href="surveyUpdate1.jsp"><button id="updateBtn">설문지 수정/삭제</button></a>
			</h3>

 			<%
				}
			%> 
			<hr color="red">
			<div id="d1"></div>
		</div>
	</div>
</body>
</html>