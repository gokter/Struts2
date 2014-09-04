<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="name" value="Flyingh" scope="session"></c:set>
	<s:property value="#session.name" />
	<s:property value="name" />
	<h1>${name }</h1>
	<s:set var="list" value="{'A','B','C'}"></s:set>
	<s:iterator value="#list">
		<h2>
			<s:property />
		</h2>
	</s:iterator>
	<s:set var="map" value="#{'a':1,'b':2,'c':3 }"></s:set>
	<s:iterator value="#map">
		<h1>
			<s:property value="key" />
			-->
			<s:property value="value" />
		</h1>	
	</s:iterator>
	<s:if test="'foo' not in {'foo','bar'}">
		IN
	</s:if>
	<s:else>
		NOT IN
	</s:else>
	<s:iterator value="books.{?#this.price>85 }">
		<s:property value="name" />----><s:property value="price" />
	</s:iterator>
	<br/>
	<s:set name="url" value="'http://www.baidu.com'"></s:set>
	<s:url value="%{#url}"></s:url>
	<s:checkboxlist list="{'Java','C++','Android'}" name="list" value="{'Java','Android'}"></s:checkboxlist>
</body>
</html>