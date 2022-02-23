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
	$(function() {
		$('#plus').click(function() {
			$.ajax({
				url : 'plus',
				data : {
					id : ${one.id},
					name : '${one.name}',
					price : ${one.price}
				},
				success: function(result) {
					alert(result)
					if(confirm("장바구니를 확인하시겠습니까?")){
						location.href="basket.jsp"
					}
				},
				error: function() {
					alert("ajax 에러발생.")
				}//error
			})//ajax
		})//click
	})//$
</script>
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
			<span style="font-size: 25px;">물건 상세 페이지</span>
			<hr color=red>

			<a href="product.jsp">
				<button style="width: 200px; height: 50px;" class="btn btn-success">물건
					전체 목록으로!</button>
			</a>
			<table>
				<tr>
					<td class="left">제품번호</td>
					<td class="right">${one.id}</td>
					<!-- one.getId() -->
				</tr>
				<tr>
					<td class="left">제품이름</td>
					<td class="right">${one.name}</td>
				</tr>
				<tr>
					<td class="left">제품설명</td>
					<td class="right">${one.content}</td>
				</tr>
				<tr>
					<td class="left">제품가격</td>
					<td class="right">${one.price}</td>
				</tr>
				<tr>
					<td class="left">제품회사</td>
					<td class="right">${one.company}</td>
				</tr>
				<tr>
					<td class="left">제품이미지</td>
					<td class="right"><img src="resources/img/${one.img}"></td>
					<!-- 이미지가 보이게 -->
				</tr>
				<tr>
					<td colspan="2">
						<button id="plus" style="width: 200px; height: 50px;"
							class="btn btn-danger">
							<img alt="" src="resources/img/bag.png" width="50" height="50">
						</button>
					</td>
				</tr>
			</table>

		</div>
	</div>
</body>
</html>