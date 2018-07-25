<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="delete.do" method="post">
		<input type="hidden" name="no" value="${delReq.articleNumber}">
		<p>
			번호:<br>${delReq.articleNumber }
		</p>
		<p>
			제목:<br>${delReq.title }
		</p>
		<input type="submit" value="삭제">
	</form>
	<a href="read.do?no=${delReq.articleNumber }">[취소]</a>
</body>
</html>