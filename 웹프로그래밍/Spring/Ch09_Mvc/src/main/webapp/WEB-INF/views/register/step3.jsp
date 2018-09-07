<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입</title>
</head>
<body>
RegisterRequest객체의 변수이름 - 소문자 시작: registerRequest<br>
<p><strong> ${registerRequest.name }   님 회원 가입을 하셨습니다.</strong></p>
<p><a href="<c:url value='/index.jsp'/>">[첫 화면 이동]</a></p>
</body>
</html>