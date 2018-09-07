<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입</title>
</head>
<body>
	<h2>
		<spring:message code="member.info" />
	</h2>
	<!-- 방법1 -->
	<%-- 	<form action="step3" method="post"> --%>
	<!-- 		<p> -->
	<%-- 			<label><spring:message code="email" /><br> <input --%>
	<!-- 				type="text" name="email" id="email" -->
	<%-- 				value="${registerRequest.email }"> </label> --%>
	<!-- 		</p> -->
	<!-- 		<p> -->
	<%-- 			<label><spring:message code="name" /><br> <input --%>
	<%-- 				type="text" name="name" id="name" value="${registerRequest.name }"> --%>
	<!-- 			</label> -->
	<!-- 		</p> -->
	<!-- 		<p> -->
	<%-- 			<label><spring:message code="password" /><br> <input --%>
	<!-- 				type="password" name="password" id="password"> </label> -->
	<!-- 		</p> -->
	<!-- 		<p> -->
	<!-- 			<label>비밀번호 확인:<br> <input type="password" -->
	<!-- 				name="confirmPassword" id="confirmPassword"> -->
	<!-- 			</label> -->
	<!-- 		</p> -->
	<!-- 		<input type="submit" value="가입완료"> -->
	<%-- 	</form> --%>

	<!-- 방법2: Custom tag를 간략한 표현방법 -->
	<!-- custom tag "form"을 사용시 반드시 Command 객체(RegisterRequest)존재해야 된다. -->
	<form:form action="step3" commandName="registerRequest" method="Post">
		<p>
			<label><spring:message code="email" />:<br>
				<form:input path="email" />
				<form:errors path="email" />
			</label>
		</p>
		<p>
			<label><spring:message code="name" />:<br> 
				<form:input path="name" />
				<form:errors path="name" />
			</label>
		</p>
		<p>
			<label><spring:message code="password" />:<br> 
				<form:password path="password" /> 
				<form:errors path="password" />
			</label>
		</p>
		<p>
			<label><spring:message code="password.confirm" />:<br>
				<form:password path="confirmPassword" />
				<form:errors path="confirmPassword" />
			</label>
		</p>
		<input type="submit" value='<spring:message code="register.btn"/>'>
	</form:form>
</body>
</html>











