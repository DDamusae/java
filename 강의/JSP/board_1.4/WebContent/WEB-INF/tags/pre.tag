
<!-- 줄바꿈, 특수문자 출력을 위한 커스텀 태그 -->
<%@ tag body-content="empty" pageEncoding="UTF-8"%>
<%@ tag trimDirectiveWhitespaces="true"%>
<%@ attribute name="value" type="java.lang.String" required="true"%>
<%
	value = value.replace("\n", "\n<br>");
	value = value.replace("&", "&amp;");
	value = value.replace("<", "&lt;");
	value = value.replace(" ", "&nbsp;");
%>
<%= value %>