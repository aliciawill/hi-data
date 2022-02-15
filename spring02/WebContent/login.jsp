<%@page import="web.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="vo" class="web.MemberVO">
	<jsp:setProperty name="vo" property="*"/>
</jsp:useBean>
<!-- import web.MemberVO;
MemberVO vo = new MemberVO(); -->
<!-- 
String id = request.getParameter("id");
String pw = request.getParameter("pw");
vo.setId(id);
vo.setPw(pw);
 -->
 <% //스크립트릿
 	MemberDAO dao = new MemberDAO();
 	boolean result = dao.login(vo);
 	String text = "로그인 실패";
 	if(result){
 		session.setAttribute("user", vo.getId());
 		text = "로그인 성공";
 	}
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> <!-- 표현식 -- 표현언어(EL)-->
로그인 결과는 >>  <%= text %><br>
세션user값은 >> <%= session.getAttribute("user") %>, ${user}
</body>
</html>