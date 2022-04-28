<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="../resources/js/jquery-3.6.0.min.js"></script>
<body>
	<div class="container">
		<h1>Naver Login API 사용하기</h1>
		<div class="login-area">
			<div id="message">로그인 버튼을 눌러 로그인 해주세요.</div>
			<div id="button_area">
				<div id="naverIdLogin"></div>
			</div>
		</div>
	</div>
	<script
		src="https://static.nid.naver.com/js/naveridlogin_js_sdk_2.0.2.js"
		charset="utf-8"></script>
	<script type="text/javascript">
  
  const naverLogin = new naver.LoginWithNaverId(
   {
    clientId: "n0kdjXCYJdG3WwDKAvfR",
    callbackUrl: "http://localhost:8080/trip/member/naverTest.jsp",
    loginButton: {color: "green", type: 2, height: 40}
    }
   );
  

    naverLogin.init();
    naverLogin.getLoginStatus(function (status) {
      if (status) {
    	  const id=naverLogin.user.getId();
          const gender=naverLogin.user.getGender();
          const birthday=naverLogin.user.getBirthday();
          const birthyear = naverLogin.user.getBirthyear();
          console.log(gender+" "+birthday+" "+birthyear+" "+id)

         if(gender===null||gender===undefined )
         {
            alert("필수 정보 제공에 동의해주세요.");
            naverLogin.reprompt();
            return ;  
         }
         else if(birthday===null||birthday===undefined )
         {
        	 alert("필수 정보 제공에 동의해주세요.");
             naverLogin.reprompt();
             return ; 
         }
         else if(birthyear===null||birthyear===undefined )
         {
        	 alert("필수 정보 제공에 동의해주세요.");
             naverLogin.reprompt();
             return ; 
         }
         else
         {
          setLoginStatus();
         }
	}
    });
    console.log(naverLogin);

    function setLoginStatus(){
    
      const message_area=document.getElementById('message');
      message_area.innerHTML=`
      <h3> Login 성공 </h3>
      <div>user gender : ${naverLogin.user.gender}</div>
      <div>user birthyear : ${naverLogin.user.birthyear}</div>
      <div>user Birthday : ${naverLogin.user.birthday}</div>
      `;
     
      const button_area=document.getElementById('button_area');
      button_area.innerHTML="<button id='btn_logout'>로그아웃</button>";

      const logout=document.getElementById('btn_logout');
      logout.addEventListener('click',(e)=>{
        naverLogin.logout();
	location.replace("http://localhost:8080/trip/member/naverTest.jsp");
      })
    }
   

  </script>
</html>