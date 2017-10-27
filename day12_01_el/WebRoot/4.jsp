<%@ page language="java" import="java.util.*,com.heima.bean.*"
	pageEncoding="UTF-8"%>
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
	<form action="${pageContext.request.contextPath }/5.jsp" method = "post">
		姓名：<input type = "text" name = "username" ><br>
		密码：<input type = "text" name = "pass" ><br>
		确认密码：<input type = "text" name = "pass" ><br>
		<input type = "submit" value = "提交" >
	</form>
	<a href = "${pageContext.request.contextPath }/5.jsp?name=mmm">5.jsp</a>
	
	<%--<jsp:forward page="5.jsp?name=abc">
		<jsp:param value="30" name="age"/>
	</jsp:forward>
--%></body>
</html>
