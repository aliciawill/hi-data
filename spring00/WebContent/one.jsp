<%@page import="web.MemberDAO"%>
<%@page import="web.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = request.getParameter("id");
    
    	MemberVO vo = new MemberVO();
    	vo.setId(id);
    	
    	MemberDAO dao = new MemberDAO();
    	dao.readOne(vo);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>