<%@page import="bean.LoginBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	LoginBean l = new LoginBean();
	l.setUserid(request.getParameter("id"));
	l.setPasswd(request.getParameter("passwd"));
	request.setAttribute("l", l);
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>ID, PW를 EL형태로 입력받기</h4>
	사용자 아이디:${l.getUserid() }<br>
	사용자 비밀번호:${l.getPasswd() }<br>
</body>
</html>