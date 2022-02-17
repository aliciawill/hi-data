<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			$.ajax({
				url : "ajax1",
				data : {
					phone : $('#tel').val()
				},
				success: function(x) {
					alert('성공!!')
					alert('인증번호는 ' + x)
					$('#result').html('인증번호는 ' + x)
				},
				error: function() {
					alert('실패!!')
				} //error
			}) //ajax
		})//b1 click
		
	})//$
</script>
</head>
<body>
인증받을 전화번호 : 
<input type="text" id="tel">
<button id="b1">인증번호 받기</button>
<hr color="red">
<div id="result"></div>
</body>
</html>




