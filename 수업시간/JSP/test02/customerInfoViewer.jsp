<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
request영역으로부터 자바빈 객체를 가져오기
<jsp:useBean id="pinfo" class="test02.PersonalInfo" scope="request"/><br>
이름: <jsp:getProperty property="name" name="pinfo"/><br>
성별: <jsp:getProperty property="gender" name="pinfo"/><br>
나이: <jsp:getProperty property="age" name="pinfo"/><br>
</body>
</html>