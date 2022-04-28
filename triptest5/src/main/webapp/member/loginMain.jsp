<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="ko">
  <head>
  	<title>Login 07</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

	<link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,900&display=swap" rel="stylesheet">

	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
	
	<link rel="stylesheet" href="../resources/css/style.css">

	</head>
	
	<script type="text/javascript" src="../resources/js/jquery-3.6.0.min.js"></script>
	
	<script>
    $(function()
    {
        $('#loginHitrip').on('click', function()
        {
            login_submit();
        });


        function login_submit()
        {
            
                console.log($('#member_id').val());
                console.log($('#member_pw').val());
                
                if($('#member_id').val()=="")
                {
                    alert("아이디를 입력해주세요.");
                    $('#member_id').focus();
                    return;
                }
                else if($('#member_pw').val()=="")
                {
                    alert("패스워드를 입력해주세요.");
                    $('#member_pw').focus();
                    return;
                }
                else
                {                          
                	$("form").submit();
                }
                
        };

    });
    </script>
    
	<body>	
	
	<section class="ftco-section">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-md-6 text-center mb-5">
					<h2 class="heading-section">Hi-TRIP 로그인</h2>
				</div>
			</div>
			<div class="row justify-content-center">
				<div class="col-md-12 col-lg-10">
					<div class="wrap d-md-flex">
						<div class="text-wrap p-4 p-lg-5 text-center d-flex align-items-center order-md-last">
							<div class="text w-100">
								<h2>하이트립에 오신 것을</h2>
								<h2>환영합니다</h2>
								<a href="#" class="btn btn-white btn-outline-white">가입하기</a>
							</div>
			      </div>
						<div class="login-wrap p-4 p-lg-5">
			      	<div class="d-flex">
			      		<div class="w-100">
			      			<h3 class="mb-4">로그인</h3>
			      		</div>
								<div class="w-100">
									<p class="social-media d-flex justify-content-end">
										<a href="#" class="social-icon d-flex align-items-center justify-content-center"><span class="fa fa-facebook"></span></a>
										<a href="#" class="social-icon d-flex align-items-center justify-content-center"><span class="fa fa-twitter"></span></a>
									</p>
								</div>
			      	</div>
							<form action="loginHitrip" class="signin-form">
			      		<div class="form-group mb-3">
			      			<label class="label" for="name">ID</label>
			      			<input type="text" id="member_id" name="member_id" class="form-control" placeholder="아이디 입력" required>
			      		</div>
		            <div class="form-group mb-3">
		            	<label class="label" for="password">Password</label>
		              <input type="password" id="member_pw" name="member_pw" class="form-control" placeholder="패스워드 입력" required>
		            </div>
		            <div class="form-group">
		            	<button id="loginHitrip" type="button" class="form-control btn btn-primary submit px-3">Hi-TRIP 로그인</button>
		            </div>
		            <div class="form-group d-md-flex">
		            	<div class="w-50 text-left">
			            	<label class="checkbox-wrap checkbox-primary mb-0">로그인 정보 기억하기
									  <input type="checkbox">
									  <span class="checkmark"></span>
										</label>
									</div>
		            </div>
		          </form>
		        </div>
		      </div>
				</div>
			</div>
		</div>
	</section>

	<script src="js/jquery.min.js"></script>
  <script src="js/popper.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/main.js"></script>

	</body>
</html>

