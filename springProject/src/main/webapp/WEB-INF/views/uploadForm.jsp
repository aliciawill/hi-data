<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
이미지 파일이 업로드 되었습니다.<br>
${name}님의 파일명: ${savedName}입니다.<br>
<img src="resources/upload/${savedName}" width="300" height="300">
</body>
</html>