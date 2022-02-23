<%@page import="com.hi.mvcProject.ProductVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/project.css">
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
			<h3 style="color: red; font-weight: bold;">장바구니 현재 목록</h3>
			<hr>
			<%
				ArrayList<ProductVO> list = (ArrayList<ProductVO>) session.getAttribute("basket");
				if(list != null){
			%>
			<span class="label label-default"><%=list.size()%></span>개의 물건이 장바구니에
			들어있습니다.

			<table>
				<tr>
					<td class="left">상품번호</td>
					<td class="left">상품이름</td>
					<td class="left">상품가격</td>
					<td class="left">주문</td>
					<td class="left">삭제</td>
				</tr>
				<%
					for (ProductVO one : list) {
				%>
				<tr>
					<td class="right"><%=one.getId()%></td>
					<td class="right"><%=one.getName()%></td>
					<td class="right"><%=one.getPrice()%></td>
					<td class="right">
						<button class="btn btn-danger">주문하기</button>
					</td>
					<td class="right">
						<button class="btn btn-success">삭제하기</button>
					</td>
				</tr>
				<%
					}
				%>
			</table>
			<%}else{ %>
			<span class="label label-default">0</span>개의 물건이 장바구니에
			들어있습니다.
			<%} %>
		</div>
	</div>
</body>
</html>