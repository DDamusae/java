<%@page import="service.MessageListView"%>
<%@page import="service.GetMessageListService"%>
<%@page import="dto.Message" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	//파라미터값으로 읽어 올 페이지 번호 생성
	String pageNumberStr = request.getParameter("page");
	int pageNumber = 1;
	if(pageNumberStr != null){
		pageNumber = Integer.parseInt(pageNumberStr);
	}
	
	//지정한 페이지의 메시지 리스트를 viewData에 저장. 
	GetMessageListService messageListService = GetMessageListService.getInstance();
	MessageListView viewData = messageListService.getMessageList(pageNumber);
%>

<!-- view Data를 EL에서 사용할 수 있도록 변수로 지정 -->
<c:set var="viewData" value="<%= viewData %>"/>

<html>
<head>
<title>방명록 메시지 목록</title>
</head>
<body>
<!-- 	메시지 입력 -->
	<form action="writeMessage.jsp" method="post">
		이름:<input type="text" name="guestName"><br>
		암호:<input type="password" name="password"><br>
		메시지:<br><textarea name="message" rows="10" cols="30" ></textarea><br>
		<input type="submit" value="메시지 남기기">
	</form>
	<hr>
	
<!-- 	메시지가 없는 경우 -->
	<c:if test="${viewData.isEmpty() }">
		등록된 메시지가 없습니다.
	</c:if>
	
<!-- 	메시지가 존재하면 메시지 리스트  출력 -->
	<c:if test="${!viewData.isEmpty() }">
		<table border="1">
			<c:forEach var="message" items="${viewData.messageList }">
			<tr>
				<td>
				메시지 번호: ${message.id }<br>
				손님 이름: ${message.guestName }<br>
				메시지: ${message.message }<br>
				<a href="confirmDeletion.jsp?messageid=${message.id }">[삭제하기]</a> <!-- 메시지 삭제 위한 암호 입력 페이지 출력 -->
				</td>
			</tr>
			</c:forEach>
		</table>
		
<!-- 		페이지 목록 출력 -->
		<c:forEach var="pageNum" begin="1" end="${viewData.pageTotalCount }">
			<a href="list.jsp?page=${pageNum }">[ ${pageNum } ]</a>
		</c:forEach>
		
	</c:if>
</body>
</html>