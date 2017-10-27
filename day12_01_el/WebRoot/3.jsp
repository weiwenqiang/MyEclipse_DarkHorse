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

<title>My JSP 'index.jsp' starting page</title>
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
	<%
		pageContext.setAttribute("name", "张三丰") ;
		request.setAttribute("name", "张无忌") ;
		session.setAttribute("name", "张翠山") ;
		application.setAttribute("name", "张果老");
	%>

     	默认按从小到大的范围去找：${name }<br>
     	直接从request范围中去拿数据：${requestScope.name }<br>

</body>
</html>
