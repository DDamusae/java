<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입</title>
</head>
<body>
<h2>회원정보 입력</h2>
<!-- 방법1 -->
<form action="step3" method="post">
 <p>
 	<label>이메일:<br>
 		<input type="text" name="email" id="email" value="${registerRequest.email }">
 	</label>
 </p>
 <p>
 	<label>이름:<br>
 		<input type="text" name="name" id="name" value="${registerRequest.name }">
 	</label>
 </p>
 <p>
 	<label>비밀번호:<br>
 		<input type="password" name="password" id="password">
 	</label>
 </p>
 <p>
 	<label>비밀번호 확인:<br>
 		<input type="password" name="confirmPassword" id="confirmPassword">
 	</label>
 </p>
 <input type="submit" value="가입완료">
</form>

<!-- 방법2: Custom tag를 간략한 표현방법 -->
<!-- custom tag "form"을 사용시 반드시 Command 객체(RegisterRequest)존재해야 된다. -->
<%-- <form:form action="step3" commandName="registerRequest" method="Post"> --%>
<!--  <p> -->
<!--  	<label>이메일:<br> -->
<%--  		<form:input path="email"/> --%>
<!--  	</label> -->
<!--  </p> -->
<!--  <p> -->
<!--  	<label>이름:<br> -->
<%--  		<form:input path="name" /> --%>
<!--  	</label> -->
<!--  </p> -->
<!--  <p> -->
<!--  	<label>비밀번호:<br> -->
<%--  		<form:password path="password"/> --%>
<!--  	</label> -->
<!--  </p> -->
<!--  <p> -->
<!--  	<label>비밀번호 확인:<br> -->
<%--  		<form:password path="confirmPassword"/> --%>
<!--  	</label> -->
<!--  </p> -->
<!--  <input type="submit" value="가입완료"> -->
<%-- </form:form> --%>
</body>
</html>











