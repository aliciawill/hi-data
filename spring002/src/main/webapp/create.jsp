<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="web.*" %>
    <!--
    1. 클라이언트가 입력해서 서버로 보낸 데이터를 받아주어야 함.
    2. vo만들어서 데이터들을 넣어준다.
    3. vo주면서 dao에게 create해달라고 요청한다.
    4. 결과화면을 만들어서 클라이언트에게 보내준다.
    -->
	<%
	//1.클라이언트가 전송해준 데이터를 받아주자.
	String id = request.getParameter("id"); //song
	String pw = request.getParameter("pw"); //1111
	String name = request.getParameter("name"); //song song
	String tel = request.getParameter("tel"); // 011
	
	//ctrl+shift+m
	MemberDAO dao=new MemberDAO();
	MemberVO vo=new MemberVO();
	vo.setId(id);
	vo.setPw(pw);
	vo.setName(name);
	vo.setTel(tel);
	dao.create(vo);
	
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	회원가입 요청이 완료되었습니다.
</body>
</html>