<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	Cookie c = new Cookie("MyCookie", "admin");
	response.addCookie(c);
	request.setAttribute("cookie", c);
%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
MyCookie 쿠키 값: ${cookie.MyCookie.value }<br>
MyCookie 쿠키 값: ${cookie.MyCookie.value }<br>
MyCookie 유지시간: ${cookie.MyCookie.getMaxAge() }<br>
MyCookie 쿠키: ${cookie.MyCookie }<br>
</body>
</html>