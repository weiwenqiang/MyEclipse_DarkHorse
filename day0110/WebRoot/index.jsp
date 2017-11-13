<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>主页面</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  <body>
    <c:if test="${empty user }">
    	<h1><a href="login.jsp">请先去登录</a></h1>
    </c:if>
    <c:if test="${not empty user }">
    	<h1>欢迎您,${user.username }</h1>
    	
    	<h1>以下是功能列表</h1>
    	<h3><a href="book?operate=add">添加书籍</a></h3>
    	<h3><a href="book?operate=edit">修改书籍</a></h3>
    	<h3><a href="book?operate=look">查看书籍</a></h3>
    	<h3><a href="book?operate=delete">删除书籍</a></h3>
    	
    </c:if>
  </body>
</html>
