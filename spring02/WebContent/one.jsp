<%@page import="web.MemberDAO"%>
<%@page import="web.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = request.getParameter("id");
    
    	MemberVO vo = new MemberVO();
    	vo.setId(id);
    	
    	MemberDAO dao = new MemberDAO();
    	MemberVO vo2 = dao.readOne(vo); //MemberVO
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% if(vo2.getId() != null) {%>
	검색한 id는 <%= vo2.getId() %><br>
	검색한 pw는 <%= vo2.getPw() %><br>
	검색한 name는 <%= vo2.getName() %><br>
	검색한 tel는 <%= vo2.getTel() %><br>
<%}else{ %>
	<h1 style=color:red>검색 정보 없음.</h1>
<%} %>
</body>
</html>



