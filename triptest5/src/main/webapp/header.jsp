<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- Header
    ================================================== -->
	<header id="nino-header">
		<div id="nino-headerInner">					
			<nav id="nino-navbar" class="navbar navbar-default" role="navigation">
				<div class="container">

					<!-- Brand and toggle get grouped for better mobile display -->
					<div class="navbar-header">
					<!-- 화면이 작아지면 헤더 메뉴 토글로 바뀐다. -->
						<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#nino-navbar-collapse">
							<span class="sr-only">Toggle navigation</span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
						<!-- 왼쪽 상단 로고부분 -->
						<a class="navbar-brand" href="homepage.html">HITRIP</a>
					</div>
  
					<!-- Collect the nav links, forms, and other content for toggling -->
					<div class="nino-menuItem pull-right">
						<div class="collapse navbar-collapse pull-left" id="nino-navbar-collapse">
							<ul class="nav navbar-nav">
								<li class="active"><a href="#nino-header">여행지 <span class="sr-only">(current)</span></a></li>
								<li><a href="#nino-story">여행지 추천</a></li>
								<li><a href="#nino-services">통계</a></li>
							</ul>
						</div><!-- /.navbar-collapse -->
						<ul class="nino-iconsGroup nav navbar-nav">
							<li><a href="#" onclick="location.href='member/loginMain.jsp'" style="font-size: small"><i class="mdi mdi-login nino-icon">로그인</i></a></li>
							<li><a href="#" onclick="location.href='member/rgstSelect.jsp'" style="font-size: small"><i class="mdi mdi-emoticon-outline nino-icon">회원가입</i></a></li>
						</ul>
					</div>
				</div><!-- /.container-fluid -->
			</nav>
			<section id="nino-slider" class="carousel slide container" data-ride="carousel">
				
				<!-- Wrapper for slides -->
				<!-- 슬라이더 글자 부분 -->
				<div class="carousel-inner" role="listbox">
					<div class="item active">
						<h2 class="nino-sectionHeading">
							<span class="nino-subHeading">여행지 랜덤</span>
							추찬 칸 <br>과연 ...
						</h2>
						<a href="#" class="nino-btn">이동하기</a>
					</div>
					<div class="item">
						<h2 class="nino-sectionHeading">
							<span class="nino-subHeading">여행지 랜덤</span>
							추찬 칸 <br>과연 ...
						</h2>
						<a href="#" class="nino-btn">이동하기</a>
					</div>
					<div class="item">
						<h2 class="nino-sectionHeading">
							<span class="nino-subHeading">여행지 랜덤</span>
							추찬 칸 <br>과연 ...
						</h2>
						<a href="#" class="nino-btn">이동하기</a>
					</div>
					<div class="item">
						<h2 class="nino-sectionHeading">
							<span class="nino-subHeading">여행지 랜덤</span>
							추찬 칸 <br>과연 ...
						</h2>
						<a href="#" class="nino-btn">이동하기</a>
					</div>
				</div>

				<!-- Indicators -->
				<!-- 슬라이더 아래 버튼 -->
				<ol class="carousel-indicators clearfix">
					<li data-target="#nino-slider" data-slide-to="0" class="active">
						<div class="inner">
							<span class="number">01</span> 여행지	?
						</div>
					</li>
					<li data-target="#nino-slider" data-slide-to="1">
						<div class="inner">
							<span class="number">02</span> 여행지 이름?
						</div>
					</li>
					<li data-target="#nino-slider" data-slide-to="2">
						<div class="inner">
							<span class="number">03</span> 뭘넣어야할까
						</div>
					</li>
					<li data-target="#nino-slider" data-slide-to="3">
						<div class="inner">
							<span class="number">04</span> 음...
						</div>
					</li>
				</ol>
			</section>
		</div>
	</header><!--/#header-->
</body>
</html>