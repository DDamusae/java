<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<fmt:bundle basename="resource.Intro_ko">

<fmt:message key="TITLE" var="title"></fmt:message>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${title }</title>
</head>
<body>
	<fmt:message key="GREETING"/><br>
	<fmt:message key="BODY"/><br>
	<fmt:message key="COMPANY_NAME"/><br>
</body>
</html>

</fmt:bundle>