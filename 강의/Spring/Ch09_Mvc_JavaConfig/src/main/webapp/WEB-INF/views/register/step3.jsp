<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입</title>
</head>
<body>
<!-- RegisterRequest객체의 변수이름 - 소문자 시작: registerRequest<br> -->
<p><spring:message code="register.done" arguments="${registerRequest.name }"/></p>
<p><a href="<c:url value='/main'/>">[<spring:message code="go.main"/>]</a></p>
</body>
</html>