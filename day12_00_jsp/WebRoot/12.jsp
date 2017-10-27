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
	  用user对象封装数据:
	   <% request.setCharacterEncoding("UTF-8"); %>
	    <jsp:useBean id="user" class="com.heima.bean.User"></jsp:useBean>
	    <jsp:setProperty property="name" name="user" param="name"/>
	    <jsp:setProperty property="age" name="user" param="age"/>
	    <jsp:setProperty property="sex" name="user" param="sex"/>
	    <jsp:setProperty property="address" name="user" param="address"/>
	    
	    <jsp:getProperty property="name" name="user"/>:
	    <jsp:getProperty property="age" name="user"/>:
	    <jsp:getProperty property="sex" name="user"/>:
	    <jsp:getProperty property="address" name="user"/><br>
	  <hr>
	  采用内省机制进行封装:<br>
		<jsp:setProperty property="*" name="user"/>	  
		 <jsp:getProperty property="name" name="user"/>:
	    <jsp:getProperty property="age" name="user"/>:
	    <jsp:getProperty property="sex" name="user"/>:
	    <jsp:getProperty property="address" name="user"/><br>
	  <hr>
	  封装超链的数据：<br>
	    <jsp:useBean id="user1"  class="com.heima.bean.User" ></jsp:useBean>
	    <jsp:setProperty property="*" name="user1"/>
	    <jsp:getProperty property="name" name="user1"/>
	    <jsp:getProperty property="age" name="user1"/>
	      <hr>
	  封装转发标签的数据：<br>
	    <jsp:useBean id="user2"  class="com.heima.bean.User" scope="session"></jsp:useBean>
	    <jsp:setProperty property="*" name="user2"/>
	    <jsp:getProperty property="name" name="user2"/>
	    <jsp:getProperty property="age" name="user2"/>
	    <jsp:getProperty property="address" name="user2"/>
	  
	 <a href = "/day12_00_jsp/13.jsp">13.jsp</a>
  </body>
</html>
