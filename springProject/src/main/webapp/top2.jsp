<%@page import="com.hi.mvcProject.ProductVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%
	ArrayList<ProductVO> list 
	= (ArrayList<ProductVO>) session.getAttribute("basket");
	int sum = 0;
	for(ProductVO vo : list){
		sum += vo.getPrice();
	}
%>
<center>
<br>
<span class="glyphicon glyphicon-user"></span>TOTAL: <%= sum %>원
<br>
<span class="label label-success">Basket: <span class="badge"><%=list.size()%></span></span>
<!-- 1. 장바구니를 개수를 예쁘게 넣어보세요. -->
<!-- 2. 장바구니에 넣은 물건들의 전체금액을 계산해서 넣어보세요. -->
</center>