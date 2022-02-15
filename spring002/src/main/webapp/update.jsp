<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="web.*" %>
	<%
	//1.클라이언트가 전송해준 데이터를 받아주자.
	String id = request.getParameter("id"); 
	String tel = request.getParameter("tel"); 
	
	//ctrl+shift+m
	MemberDAO dao=new MemberDAO();
	MemberVO vo=new MemberVO();
	vo.setId(id);
	vo.setTel(tel);
	dao.update(vo);
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	정보수정 요청이 완료되었습니다.
</body>
</html>