<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script type="text/javascript">
var no = ""
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
					no = x
				},
				error: function() {
					alert('실패!!')
				} //error
			}) //ajax
		})//b1 click
		$('#b2').click(function() {
				tel2Value = $('#tel2').val()
				alert(no)
				noResult = "인증실패"
				if(tel2Value == no){
					noResult = "인증성공"
				}
				$('#result').html(noResult)
		})//b2 click
	})//$
</script>
</head>
<body>
인증받을 전화번호 : 
<input type="text" id="tel">
<button id="b1">인증번호 받기</button>
도착한 인증번호 입력 :
<input type="text" id="tel2">
<button id="b2">인증번호 확인</button>
<hr color="red">
<div id="result"></div>
</body>
</html>




