<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script type="text/javascript" src="../resources/js/jquery-3.6.0.min.js"></script>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script>
$(function(){
	
	$('#find_addr').click(function(){
		new daum.Postcode({
	        oncomplete: function(data) {
	        	
	        	console.log(data);
	        	
	            // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.
	            // 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
	            // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
	            var roadAddr = data.roadAddress; // 도로명 주소 변수
	            var jibunAddr = data.jibunAddress; // 지번 주소 변수
	            // 우편번호와 주소 정보를 해당 필드에 넣는다.
	            if(roadAddr !== ''){
	                document.getElementById("addr_first").value = roadAddr;
	            } 
	            else if(jibunAddr !== ''){
	                document.getElementById("addr_first").value = jibunAddr;
	            }
	        }
	    }).open();
	})
	
	var idChecked=0;
	
	$('#idCheck').click(function(){
		console.log("중복확인 ajax 함수")
		console.log($('#member_id').val().length)
		if($('#member_id').val()=="")
		{
			alert("아이디를 먼저 입력해주세요.")
		}
		else if($('#member_id').val().length<5||$('#member_id').val().length>15)
		{
			alert("아이디 길이는 5~15자로 입력해주세요.")
			$('#member_id').val("")
		}
		else
		{
			$.ajax({
				url: "idCheck" ,
				data: {
					id : $('#member_id').val()
				},
				success: function(result){
					console.log(result)
					if(result=='false')
					{
						alert("사용 가능한 아이디입니다.")
						if(confirm("이 아이디를 사용하시겠습니까?"))
							{
								$('#member_id').attr('readonly', 'true')
								$('#member_id').attr('style', 'background-color:lightgreen;')
								idChecked=1;
							}
					}
					else
					{
						alert("사용할 수 없는 아이디입니다.")
						$('#member_id').val("")
					}
				} ,
				error: function(){
					alert('ajax 실패.@@')
				}
				
			})
		}
	})
	
	var nameChecked=0;
	
	$('#nameCheck').click(function(){
		console.log("중복확인 ajax 함수")
		if($('#member_name').val()=="")
		{
			alert("닉네임을 먼저 입력해주세요.")
		}
		else
		{
			$.ajax({
				url: "nameCheck" ,
				data: {
					name : $('#member_name').val()
				},
				success: function(result){
					console.log(result)
					if(result=='false')
					{
						alert("사용 가능한 닉네임입니다.")
						if(confirm("이 닉네임을 사용하시겠습니까?"))
							{
								$('#member_name').attr('readonly', 'true')
								$('#member_name').attr('style', 'background-color:lightgreen;')
								idChecked=1;
							}
					}
					else
					{
						alert("사용할 수 없는 닉네임입니다.")
						$('#member_name').val("")
					}
				} ,
				error: function(){
					alert('ajax 실패.@@')
				}
				
			})
		}
	})
	
	$('#formCheck').click(function(){
		
		 console.log($('#member_id').val());
         console.log($('#member_pw').val());
         
         if($('#member_id').val()=="")
         {
             alert("아이디를 입력해주세요.");
             $('#member_id').focus();
             return;
         }
         else if(idChecked==0)
         {
        	 alert("아이디를 중복 확인해주세요.");
             $('#member_id').focus();
             return;
         }
         else if($('#member_pw').val()=="")
         {
        	 alert("비밀번호를 입력해주세요.");
             $('#member_pw').focus();
             return;
         }
         else if($('#pwCheck').val()=="")
         {
        	 alert("비밀번호 확인을 입력해주세요.");
             $('#pwCheck').focus();
             return;
         }
         else if($('#member_pw').val()!=$('#pwCheck').val())
         {
        	 alert("동일한 비밀번호를 입력해주세요.");
             $('#pwCheck').focus();
             return;
         }
         else if($('#member_name').val()=="")
         {
        	 alert("닉네임을 입력해주세요.");
             $('#member_name').focus();
             return;
         }
         else if($('#member_gender').is(':checked')==false)
         {
        	 alert("성별 항목에 체크해주세요.");
             $('#member_gender').focus();
             return;
         }
         else if($('#member_birth').val()=="")
         {
        	 alert("생년 월일을 입력해주세요.");
             $('#member_birth').focus();
             return;
         }
         else if($('#addr_first').val()=="")
         {
        	 alert("주소를 입력해주세요.");
             $('#addr_first').focus();
             return;
         }
         else if($('#addr_last').val()=="")
         {
        	 alert("나머지 주소를 입력해주세요.");
             $('#addr_last').focus();
             return;
         }
         else
         {                          
             
         }
         
         $('#member_addr').val($('#addr_first').val()+' '+$('#addr_last').val());
         console.log($('#member_addr').val());
         $("form").submit();
         
	})
         
})
</script>
</head>
<body>
<h3>Hi TRIP으로 가입</h3>
	<form action="createMember">
		아이디: <input type="text" name="member_id" id="member_id"> <button type="button" id="idCheck" >아이디 확인</button><br>
		비밀번호: <input type="password" name="member_pw" id="member_pw"><br>
		비밀번호 확인: <input type="password" name="pwCheck" id="pwCheck"><br>
		닉네임 : <input type="text" name="member_name" id="member_name"> <button type="button" id="nameCheck" >닉네임 확인</button><br>
		성별 <label><input type="radio" name="member_gender" id="member_gender" value="1"> 남</label>
      		 <label><input type="radio" name="member_gender" id="member_gender" value="2"> 여</label><br>
		생년월일: <input type='date' name='member_birth' id='member_birth'><br>
		주소:<br>
  		<input name="addr_first" id="addr_first" type="text" placeholder="주소" readonly> <button id="find_addr" type="button">주소 찾기</button><br>
  		<input name="addr_last" id="addr_last" type="text" placeholder="상세 주소"><br>
  		<input name="member_addr" id="member_addr" type="hidden">
  		<input name="member_type" id="member_type" type="hidden" value="1">
		<button type="button" id="formCheck">가입</button>
	</form>
</body>
</html>