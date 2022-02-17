<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>jQuery UI Effects - removeClass Demo</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css">
  <script src="../../external/jquery/jquery.js"></script>
  <script src="../../ui/effect.js"></script>
  <link rel="stylesheet" href="/resources/demos/style.css">
  <style>
  .toggler { width: 500px; height: 200px; position: relative; }
  #button { padding: .5em 1em; text-decoration: none; }
  #effect { position: relative;  width: 240px;  padding: 1em;  letter-spacing: 0; font-size: 1.2em; border: 1px solid #000; background: #eee; color: #333; }
  .newClass { 
  	width: 100px;
  	height: 50px;
  	background: red;
  	border: 10px dotted lime;
  }
  </style>
  <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
  <script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>
  <script>
  $( function() {
	  flag = false
    $( "#button" ).click(function() {
		if(flag){
			$('.b').removeClass("newClass");
			$('.r').attr('checked', false)
			flag = false
		}else{
			$('.b').addClass("newClass");
			$('.r').attr('checked', true)
			flag = true
		}
	})
  } );
  </script>
</head>
<body>
<button class="b">확인버튼1</button>
<button class="b">확인버튼2</button>
<button class="b">확인버튼3</button>
<button class="b">확인버튼4</button>
 
<input type="radio" class = "r">등산
<input type="radio" class = "r">독서
<input type="radio" class = "r">노래
<hr>
<button id="button" class="ui-state-default ui-corner-all">Run Effect</button>
 
 
</body>
</html>