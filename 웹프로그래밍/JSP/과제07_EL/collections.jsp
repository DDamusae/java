<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String[] arr = {"컴공,컴공", "정통,컴공", "경영,경영", "행정,행정"};
	request.setAttribute("a", arr);	

	ArrayList<String> l = new ArrayList<>();
	l.add(0, "SQL응용");
	l.add(1, "JSP/Servlet");
	l.add(2, "ERP정보 시스템");
	request.setAttribute("l", l);
	
	HashMap<String, String> map = new HashMap<>();
	map.put("학과", "컴퓨터공학과");
	map.put("성명", "강준상");
	map.put("직위", "교수");
	map.put("전화", "010-123-4567");
	request.setAttribute("m", map);
%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
1.학과배열출력<br>
0번째: ${a[0] }<br>
1번째: ${a[1] }<br>
2번째: ${a[2] }<br>
3번째: ${a[3] }<br>
<br>
2.과목 ArrayList출력<br>
First: ${l[0] }<br>
Second: ${l[1] }<br>
Third: ${l[2] }<br>
<br>
3.교수 Map출력<br>
학과: ${m['학과'] }<br>
성명: ${m['성명'] }<br>
직위: ${m['직위'] }<br>
전화: ${m['전화'] }<br>

</body>
</html>