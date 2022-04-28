<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>설문지</title>
<script type="text/javascript" src="../resources/js/jquery-3.6.0.min.js"></script>
<script type="tex/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"><</script>
<script type="text/javascript"
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"></script>
<script type="text/javascript"
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>



</head>
<body>
	<%-- 	<c:forEach items="${surveyList}" var="one">
		<c:forTokens items="${one.survey_choices}" var="choice" delims=",">
			<p>
				<c:out value="${choice}" />
			</p>
		</c:forTokens>
==============
</c:forEach> --%>


	<div class="survey">
		<div id="surveyform"
			style="float: left; width: 50%; text-align: left;">
			<form class=" bg-white px-4" action="">
				<table>
					<c:forEach items="${surveyList}" var="one" varStatus="status">
						<tr>
							<td style="text-align: left">
								<h4 class="fw-bold text-center mt-3"></h4>
								<p class="fw-bold">${one.survey_idx}.${one.survey_question}</p>
								<div class="form-check mb-2">
									<c:choose>
 										<c:when test="${one.survey_choices eq '' || one.survey_choices eq null}">
											<div class="input-group mb-3">
												<input type="text" class="form-control" placeholder="${one.survey_question}" aria-label="${one.survey_question}" aria-describedby="basic-addon1">
											</div>
										</c:when>

										<c:otherwise>
										<c:forTokens items="${one.survey_choices}" var="choice" delims=",">
											<input class="form-check-input${status.count}" type="radio" name="exampleForm${status.count}" id="radioExample1${status.count}" />
											<label class="form-check-label${status.count}" for="radioExample1${status.count}">
												<c:out value="${choice}" />
											</label>
										</c:forTokens>
										</c:otherwise>
									</c:choose>
								</div>
							</td>
						</tr>
					</c:forEach>
				</table>
				<button type="button" class="btn btn-primary">Submit</button>
			</form>
		</div>
	</div>


</body>
</html>