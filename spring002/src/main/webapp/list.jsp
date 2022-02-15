<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="web.*" %>
    <%
    	MemberDAO dao=new MemberDAO();
    	//import: 클릭 후, 컨트롤+쉬프트+m
    	//java에서 import : 컨트롤+쉬프트+o
    	ArrayList<MemberVO> list=dao.readAll();
    %>
    <!--
    	한줄복사 : 컨트롤 + 알트 + 화살표 아래
    	한줄이동 : 알트 + 화살표 방향
    	한줄삭제 : 컨트롤 + d
    	새로만들기 : 컨트롤 + n
    	저장 : 컨트롤 + s
    	실행 : 컨트롤 + f11
    	자동 포맷팅 : 컨트롤 + 쉬프트 + f
    	자동 주석 : 컨트롤 + /
     -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	for(MemberVO vo:list)
	{
%>
		검색한 id는 <%= vo.getId() %><br>
		검색한 name는 <a href="one.jsp?id=<%= vo.getId() %>"><%= vo.getName() %></a><br>
		
		<hr>
<%
	}
%>
</body>
</html>