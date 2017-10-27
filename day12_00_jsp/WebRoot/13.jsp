<%@ page language="java" import="java.util.*,com.heima.bean.*" pageEncoding="UTF-8" buffer="8kb"%>
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
	  封装转发标签的数据：<br>
	   
	      <%
	      	  User user = (User) session.getAttribute("user2") ;
	      
	      out.write(user.getName() + ":" + user.getAddress() + ":" + user.getAge()) ;
	      %>
  </body>
</html>
