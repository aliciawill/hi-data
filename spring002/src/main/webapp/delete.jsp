<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="web.*" %>
	<%
	//1.클라이언트가 전송해준 데이터를 받아주자.
	String id = request.getParameter("id"); 
	
	//ctrl+shift+m
	MemberDAO dao=new MemberDAO();
	MemberVO vo=new MemberVO();
	vo.setId(id);
	dao.delete(vo);
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	회원삭제 요청이 완료되었습니다.
</body>
</html>