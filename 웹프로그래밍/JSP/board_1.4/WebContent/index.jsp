<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="u" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>회원제 게시판 예제</title>
</head>
<body>
	<u:isLogin>
		CT: ${authUser.name }님 안녕하세요<br>
		<a href="logout.do">[로그아웃하기]</a>
		<a href="changePwd.do">[암호변경하기]</a>
		<c:set var="ctxPath" value="${pageContext.request.contextPath }"/>
		<a href="${ctxPath }/article/list.do">[게시글 목록 보기]</a>
	</u:isLogin>
	<u:notLogin>
		CT: <a href="join.do">[회원가입하기]</a>
		<a href="login.do">[로그인하기]</a>
	</u:notLogin>
</body>
</html>