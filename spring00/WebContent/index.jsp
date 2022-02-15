<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	íìí©ëë¤....<br>
	<hr color='red'>
	<form action="create.jsp">
	ìì´ë : <input type="text" name="id"><br>
	í¨ì¤ìë : <input type="text" name="pw"><br>
	ì´ë¦ : <input type="text" name="name"><br>
	ì íë²í¸ : <input type="text" name="tel"><br>
	<button>íìê°ì ìì²­</button>
	</form>
	<br>
	<hr color="blue">
	<form action="login.jsp">
	ìì´ë : <input type="text" name="id" style=background:lime;><br>
	í¨ì¤ìë : <input type="text" name="pw"  style=background:lime;><br>
	<button style=background:yellow;color:red;width:100px;>íìë¡ê·¸ì¸ ìì²­</button>
	</form>
	<br>
	<hr color="blue">
	<form action="update.jsp">
	<input type="text" name="id" ><br>
	ì íë²í¸ : <input type="text" name="tel"><br>
	<button>íììì  ìì²­</button>
	</form>
	<br>
	<hr color="blue">
	<form action="one.jsp">
	아이디 : <input type="hidden" name="id" value="${user}"><br>
	<button>회원정보 검색 ­</button>
	</form>
	<a href="one.jsp?id=apple">apple검색</a>
	<br>
	<hr color="blue">
	<form action="delete.jsp">
	아이디 : <input type="text" name="id" value="${user}"><br>
	<button>회원탈퇴</button>
	</form>
	<a href="delete.jsp?id=${user}">
		<button>회원탈퇴</button>
	</a>
	<br>
	<hr color="blue">
	<a href="list.jsp">
		<button style=color:yellow;background:red;>ì ì²´ íì ëª©ë¡</button>
	</a>
	</body>
</html>






