<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script>
<script type="text/javascript">
$(function() { 
	$("#a1").click(function() {
		$.ajax({
			url: "jsonList",
			dataType: "json",
			success: function(result) {
				alert("ok")
				if(result.length>0){
					$(result).each(function(i, dto) {
						var id = dto.id;
						var title = dto.title;
						var content = dto.content;
						var writer = dto.writer;
						$("div").append(id + "<br>")
						$("div").append(title + "<br>")
						$("div").append(content + "<br>")
						$("div").append(writer + "<br><br>")
					})
				}				
			}
		})
		return false;
	}) //click
	
	$("#a2").click(function() {
		$.ajax({
			url: "jsonList",
			dataType: "json",
			success: function(result) {
				alert("ok")
				if(result.length>0){
					$(result).each(function(i, dto) {
						var id = dto.id;
						var title = dto.title;
						var content = dto.content;
						var writer = dto.writer;
						$("div").append("<font color='blue'>"+id+"</font>" )
						$("div").append("<font color='red'>"+title+"</font>" )
						$("div").append("<font color='green'>"+content+"</font>" )
						$("div").append("<font color='yellow'>"+writer+"</font><hr>" )
					})
				}				
			}
		})
		return false;
	}) //click
})//jquery
</script>
</head>
<body>
<a href="#" id="a1">게시판 정보 json받기</a>
<a href="#" id="a2">게시판 정보 json list받기</a>
<hr color="red">
<div>
</div>


</body>
</html>



