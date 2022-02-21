<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function idCheck() {
		//id에 입력한 값을 가지고 와서
		//글자수가 5 미만이면 다시 작성하세요. 메시지 프린트 
		//Document document = new Document();//body
		//String idValue = docu~~~
		//미리 객체를 생성해놨음.==> 내장된 객체
		//window: 브라우저 전체 
		//document: body태그 부분
		//console: 개발할 때 확인하는 창(f12)
		//location:  주소부분, location.href = ""
		//history: 탐색 리스트
		idValue = document.getElementById("id").value //<input name="id" id="id" value="test">
		text = ""
		if (idValue.length < 5) {
			console.log("5미만 입니다. 다시 입력해주세요.")
			text = "5미만 입니다. 다시 입력해주세요."
			document.getElementById("id").value = ""
		} else {
			console.log("5이상 입니다. 확인완료.")
			text = "5이상 입니다. 확인완료."
		}
		document.getElementById("result").innerHTML = text
	}
	function pwCheck() {
		pw1Value = document.getElementById("pw1").value
		pw2Value = document.getElementById("pw2").value
		text = ""
		img = ""
		if (pw1Value == pw2Value) {
			console.log("동일합니다.")
			text = "<span style='color:blue;'>동일합니다.</span>"
			img = "<img src='resources/img/ok.gif' width=200 height=200>"
		} else {
			console.log("동일하지 않습니다. 다시 입력해주세요.")
			document.getElementById("pw1").value = ""
			document.getElementById("pw2").value = ""
			text = "<span style='color:red;'>동일하지 않습니다. 다시 입력해주세요.</span>"
			img = "<img src='resources/img/no.jpeg' width=200 height=200>"
		}
		document.getElementById("result").innerHTML = text + img

	}
</script>
</head>
<body>
	<h3>자바 스크립트 테스트</h3>
	<hr>
	아이디 :
	<input name="id" id="id" value="test">
	<br>
	<button onclick="idCheck()">입력 글자수 확인</button>
	<br> 패스워드1 :
	<input name="pw1" id="pw1" value="1234">
	<br> 패스워드2 :
	<input name="pw2" id="pw2" value="1234">
	<br>
	<button onclick="pwCheck()">입력 패스워드 일치 확인</button>
	<br>
	<hr>
	<div id="result"></div>
</body>
</html>






