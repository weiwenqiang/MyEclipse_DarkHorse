<%@ page language="java" import="java.util.*,com.heima.bean.*"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/myfunction" prefix="fun" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>el表达式的内置对象param</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body>
	4.el表达式支持自定义函数<br>
	<hr>
	${"abcde"}
	${fun:upper("abc") }
	${fn:contains("abcde","abc") }
	
</body>
</html>
