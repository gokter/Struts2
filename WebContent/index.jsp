<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:text name="welcome">
		<s:param>Flyingh</s:param>
		<s:param>BJ</s:param>
	</s:text><br/>
	===================<br/>
	<s:i18n name="flyingh">
		<s:text name="welcome">
			<s:param>AAA</s:param>
			<s:param>BBB</s:param>
		</s:text>
	</s:i18n>
	<br/>
	===================<br/>
	<s:i18n name="com/flyingh/action/package">
		<s:text name="welcome">
			<s:param>package:AAA</s:param>
			<s:param>package:BBB</s:param>
		</s:text>
	</s:i18n>
	<br/>
	===================<br/>
	<s:i18n name="com/flyingh/action/I18nAction">
		<s:text name="welcome">
			<s:param>action:AAA</s:param>
			<s:param>action:BBB</s:param>
		</s:text>
	</s:i18n>
	<br/>
	<%=new Date() %>中国
	<form action="${pageContext.request.contextPath }/person/" method="post">
		<input type="text" name="person.name"><br/>
		<input type="text" name="person.age"><br/>
		<input type="submit">
	</form>
</body>
</html>