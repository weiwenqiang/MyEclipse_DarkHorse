<%@page import="java.net.URLDecoder"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" buffer="8kb"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>jsp:usebean</title>
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
	   <form action= "/day12_00_jsp/12.jsp" method="post">
	   		姓名：<input type = "text" name = "name"><br>
	   		年龄： <input type = "text" name = "age"><br>
	   		性别:<input type = "radio" name = "sex" value = "男">男<input type = "radio" name = "sex"  value = "女">女<br>
	   		地址：<input type = "text" name = "address">
	   		<input type = "submit" value = "提交">
	   </form>
	   
	   <a href = "/day12_00_jsp/12.jsp?name=abc&age=30">封装数据</a>
	   
	   <jsp:forward page="/12.jsp?name=abc">
	   		 <jsp:param value="15" name="age"/>
	   		 <jsp:param value="beijing" name="address"/>
	   </jsp:forward>
	   
  </body>
</html>
