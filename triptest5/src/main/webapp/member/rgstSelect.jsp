<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<script src="https://static.nid.naver.com/js/naveridlogin_js_sdk_2.0.2.js" charset="utf-8"></script>
<body>
	<button onclick="location.href='createMemberForm.jsp'" type="button">Hi-TRIP으로 가입</button>
	
	<div id = "naverIdLogin"></div>
	
	<form action="">
		<button type="submit">구글</button>
	</form>
</body>
<script type="text/javascript">
	
  const naverLogin = new naver.LoginWithNaverId(
   {
    clientId: "n0kdjXCYJdG3WwDKAvfR",
    callbackUrl: "http://localhost:8080/trip/member/rgstSelect.jsp",
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
        	 	var f = document.createElement('form');
        	    
        	    var obj1;
        	    obj1 = document.createElement('input');
        	    obj1.setAttribute('type', 'hidden');
        	    obj1.setAttribute('name', 'id');
        	    obj1.setAttribute('value', id);
        	    
        	    var obj2;
        	    obj2 = document.createElement('input');
        	    obj2.setAttribute('type', 'hidden');
        	    obj2.setAttribute('name', 'gender');
        	    obj2.setAttribute('value', gender);
        	    
        	    var obj3;
        	    obj3 = document.createElement('input');
        	    obj3.setAttribute('type', 'hidden');
        	    obj3.setAttribute('name', 'birthday');
        	    obj3.setAttribute('value', birthday);
        	    
        	    var obj4;
        	    obj4 = document.createElement('input');
        	    obj4.setAttribute('type', 'hidden');
        	    obj4.setAttribute('name', 'birthyear');
        	    obj4.setAttribute('value', birthyear);
        	    
        	    f.appendChild(obj1);
        	    f.appendChild(obj2);
        	    f.appendChild(obj3);
        	    f.appendChild(obj4);
        	    f.setAttribute('method', 'post');
        	    f.setAttribute('action', 'loginNaver');
        	    document.body.appendChild(f);
        	    f.submit();

         }
	}
    });
   
    
</script>
</html>