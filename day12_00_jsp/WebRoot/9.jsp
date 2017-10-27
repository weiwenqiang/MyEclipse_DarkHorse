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
    
    <title>动作标签forward</title>
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
	    &lt;jsp:forward&gt;请求转发<br>
	    <%
	    	 String name = (String) request.getAttribute("name") ;
	    	 String age = (String) request.getParameter("age") ;
	    	 String weight = (String) request.getParameter("weight") ;
	    	 String address = (String) request.getParameter("address") ;
	    	 
	    	 out.write(address) ;
	    	 //address = new String(address.getBytes("iso-8859-1"),"UTF-8") ;
	    	 //address = URLDecoder.decode(address) ;
	    	 out.write(name + ":" +age + ":" + weight + ":" + address) ;
	    %>
  </body>
</html>
