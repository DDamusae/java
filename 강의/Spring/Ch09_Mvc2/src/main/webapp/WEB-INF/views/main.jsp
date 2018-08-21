<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Main</title>
</head>
<body>
	<c:if test="${empty authInfo }">
		<P>환영합니다.</P>
		<P>
			<a href="<c:url value="/register/step1"/>">[회원가입하기]</a> 
			<a href="<c:url value="/login"/>">[로그인하기]</a>
		</P>
	</c:if>
	<c:if test="${!empty authInfo }">
		<p> ${authInfo.name }님, 환영합니다.</p>
		<P>
			<a href='<c:url value="/edit/changePassword"/>'>[비밀번호변경]</a>
			<a href='<c:url value="/logout"/>'>[로그아웃]</a>
		</P>
	</c:if>
	
</body>
</html>