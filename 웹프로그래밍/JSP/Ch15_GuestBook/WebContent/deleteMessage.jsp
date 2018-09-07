<%@page import="service.InvalidPasswordException"%>
<%@page import="service.DeleteMessageService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	int messageid = Integer.parseInt(request.getParameter("messageid"));
	String password = request.getParameter("password");
	boolean invalidPassword = false;
	try{
		DeleteMessageService deleteService = DeleteMessageService.getInstance();
		deleteService.deleteMessage(messageid, password);
	}catch(InvalidPasswordException ex){
		invalidPassword = true;
	}
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>방명록 메시지 삭제함</title>
</head>
<body>
<% if(!invalidPassword){%>
		메시지를 삭제했습니다.
<%}else{ %>
		입력한 암호가 올바르지 않습니다. 암호를 확인하세요.
<%} %>
<br>
<a href="list.jsp">[목록보기]</a>
</body>
</html>