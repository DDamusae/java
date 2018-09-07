<%@page import="service.WriteMessageService"%>
<%@page import="dto.Message"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//post방식으로 받았으므로 설정.
	request.setCharacterEncoding("utf-8");
%>
<!-- Message객체를 생성하여 넘겨받은 정보를 담는다 -->
<jsp:useBean id="message" class="dto.Message">
	<jsp:setProperty name="message" property="*"/>
</jsp:useBean>

<%
	//테이블에 메시지 등록
	WriteMessageService writeService = WriteMessageService.getInstance();
	writeService.write(message);
%>

<html>
<head>
<title>방명록 메시지 남김</title>
</head>
<body>
방명록에 메시지를 남겼습니다.<br>
<a href="list.jsp">[목록보기]</a>
</body>
</html>