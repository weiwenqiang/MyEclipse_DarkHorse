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
	<% request.setCharacterEncoding("UTF-8") ; %>
              用el表达式的内置对象param获取表单的数据: ${param.username }||${param["username"] }<br>
	<hr>
	 用el表达式的内置对象param获取超链传递的数据: ${param.name }||${param["name"] }<br>
	<hr>
	 用el表达式的内置对象param获取请求转发传递的数据: ${param.name }||${param["name"] } || ${param.age }||${param["age"] }<br>
	<hr>
	 用el表达式的内置对象paramValues获取表单中同名控件的数据: ${paramValues.pass[0] } || ${paramValues.pass[1] } <br>
	 <hr>
	 用el表达式的内置对象header获取请求头的数据: ${header["Accept-Encoding"] }<br>
	 <hr>
	 用el表达式的内置对象headerValues获取请求头的数据: ${headerValues["Accept-Encoding"][0] }<br>
	 <hr>
	 用el表达式的内置对象initParam获取全局配置的数据: ${initParam.name }<br>
	  <hr>
	 用el表达式的内置对象Cookie(map类型)获取浏览器携带的Cookie(拿到的是map类型): ${cookie}<br>
	 用el表达式的内置对象Cookie获取正真的cookie对象 ${cookie.JSESSIONID}<br>
	 用el表达式的内置对象Cookie获取正真的cookie对象的名字： ${cookie.JSESSIONID.name}<br>
	 用el表达式的内置对象Cookie获取正真的cookie对象 的value属性的值： ${cookie.JSESSIONID.value}<br>
	
	<%
		request.setAttribute("s", "abc") ;
	%>
	${s == "abc" }
</body>
</html>
