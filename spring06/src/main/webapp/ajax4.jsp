<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
$(function() { //dom(document object model) tree)
	$('#b1').click(function() {
		$.ajax({
			url : 'resources/file/MOCK_DATA.json',
			success: function(result) {
				alert(result.length)
				$(result).each(function(i, one) {
					console.log(one.id)
					//div안에 1000명의 성과 이름/이메일을 프린트
				})
			},
			error: function() {
				alert('ajax 실패.@@')
			}
		})//ajax
	})//b1
	
})//$

</script>
</head>
<body>
	<button id="b1">MOCK_DATA(JSON)</button>
	<hr color=red>
	<div id="d1"></div>	
</body>
</html>



	