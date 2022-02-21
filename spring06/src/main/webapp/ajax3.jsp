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
			url : 'resources/file/MOCK_DATA.json'
			//url: "http://rss.hankooki.com/sports/sp_culture.xml",
			url: "https://api.rss2json.com/v1/api.json?rss_url=https%3A%2F%2Fwww.chosun.com%2Farc%2Foutboundfeeds%2Frss%2Fcategory%2Fentertainments%2F%3FoutputType%3Dxml&api_key=rooa9cfdnkctmsnpiftxnozlzfyaunxvudzwajoq", 
			data : {
				url : "https://www.chosun.com/arc/outboundfeeds/rss/category/entertainments/?outputType=xml",
				api_key : "rooa9cfdnkctmsnpiftxnozlzfyaunxvudzwajoq",
				count : 20
			},
			success: function(result) {
				//alert('신문사 연결 성공.@@')
				//alert(result)
				list = result.items //[{}, {}, {}, ...]
				//alert(list.length) //20
				$(list).each(function(index , news) {
					//console.log(index + "   " + news.author)
					img = news.thumbnail
					console.log(img)
					//title
					title = news.title
					link = news.link
					//title을 클릭했을 때, link연결(a태그)
					pubDate = news.pubDate
					//날짜를 title옆에 보이도록 해주세요.
					str = "<a href='" + link + "'>" + title + "-" + pubDate +  "</a>"
					$('#d1').append('<img src="' + img + '" width=100 height=100>'+ str + '<br>')
					
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
	<button id="b1">조선일보(문화 기사 받아오기)</button>
	<hr color=red>
	<div id="d1"></div>	
</body>
</html>



	