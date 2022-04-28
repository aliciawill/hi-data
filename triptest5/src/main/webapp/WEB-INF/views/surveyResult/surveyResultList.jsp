<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="text/javascript" src="../resources/js/jquery-3.6.0.min.js"></script>
<script type="text/javascript"
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
<script type="text/javascript">
	$(function(){
		$('[id^=deletebtn]').click(function(){
			var idx =  $(this).attr('id').substring(str.indexOf('_') + 1);
			if(confirm("정말로 삭제하시겠습니까?")){
				//controller의 mvDel요청 후, 삭제가 성공하면, mv.jsp로 화면을 넘김
				$.ajax({
					url: "surveyResultDelete",
					data: {
						surveyResult_idx: idx	
					},
					success : function(result) {
						if(result == '1'){
							alert("삭제되었습니다")
							location.href = "surveyResult.jsp"
						}
					}//success
				})//ajax
			}//confirm
		})//Btn
	})//$function
</script>

<style>
.accordion {
  background-color: #eee;
  color: #444;
  cursor: pointer;
  padding: 18px;
  width: 100%;
  border: none;
  text-align: left;
  outline: none;
  font-size: 15px;
  transition: 0.4s;
}

.active, .accordion:hover {
  background-color: #ccc;
}

.panel {
  padding: 0 18px;
  background-color: white;
  max-height: 0;
  overflow: hidden;
  transition: max-height 0.2s ease-out;
}
</style>
</head>
<body>
</head>
<body>

<button type="button" onclick="location.href='../survey/survey.jsp'">새 설문지 작성하기</button>
<input type="hidden" value="" name="midx" id="midx">
<pre>	No.		추천결과		작성날짜</pre>


<c:forEach items="${surveyResultList}" var="resultlist">
	<button class="deleteBtn" id="deleteBtn_${resultlist.surveyResult_idx}">삭제</button>
	<button class="accordion">
	<pre>${resultlist.surveyResult_idx}		${resultlist.surveyResult_recommendation}		${resultlist.surveyResult_date}</pre>
	</button>
	<div class="panel" id= "panel${resultlist.surveyResult_idx}">
		
		<c:forEach items="${surveyList}" var="surveylist" varStatus="status">
			<c:set var="answer" value="${fn:split(resultlist.surveyResult_answers, ',')}" />
			<p>${surveylist.survey_idx}. ${surveylist.survey_question} 답변: ${answer[status.index]}</p>
			<c:forTokens items="${surveylist.survey_choices}" var="choice" delims=",">
			<c:choose>
			<c:when test="${hoice eq '' || choice eq null}">
			<div class="input-group mb-3">
			<input type="text" class="form-control" placeholder="${choice}" aria-label="${choice}" aria-describedby="basic-addon1">
			</div>
			</c:when>
			<c:otherwise>
			
				<input class="form-check-input" type="radio" name="radio${resultlist.surveyResult_idx}${surveylist.survey_idx}" 
				id="radio${choice}" 
			<c:if test="${choice eq answer[status.index]}">checked="checked"
				</c:if> 
				/>
				<label class="form-check-label" for="radioExample1${choice}">
				<c:out value="${choice}"/>
				</label>
			
			</c:otherwise>
			</c:choose>
			
			</c:forTokens>
		</c:forEach>
	</div>
</c:forEach>


<script>
var acc = document.getElementsByClassName("accordion");
var i;

for (i = 0; i < acc.length; i++) {
  acc[i].addEventListener("click", function() {
    this.classList.toggle("active");
    var panel = this.nextElementSibling;
    if (panel.style.maxHeight) {
      panel.style.maxHeight = null;
    } else {
      panel.style.maxHeight = panel.scrollHeight + "px";
    } 
  });
}
</script>

</body>
</html>