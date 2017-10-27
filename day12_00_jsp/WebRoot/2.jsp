<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>pageContext对象</title>
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
  	<!-- pageContext对象的第一个作用：  1.  作为域对象
  	  							  a.存储数据 
  	  							  
  	 -->
      <%
      	 pageContext.setAttribute("name", "张无忌") ;
      	 pageContext.setAttribute("name1", "张三丰",PageContext.SESSION_SCOPE) ;
      %>
      
      <%
      	String name = (String) pageContext.getAttribute("name") ;
        out.write(name) ;
        
        String name1 = (String) session.getAttribute("name1") ;
        out.write(name1) ;
      %>
  </body>
</html>
