<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	String id = (String)session.getAttribute("id");
	boolean login = id == null?false:true;
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	사용자가 처음으로 접속하는 페이지
	<br>
	<%
		if (login) {
	%>		
			<a href="logout">로그아웃</a>
	<%
		}else{
	%>
			<a href="loginForm.html">로그인</a>
	<% 			
		}
	%>
	
</body>
</html>