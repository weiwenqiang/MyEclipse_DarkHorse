<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" buffer="8kb"%>
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
  	pageContext对象的第二个作用： 获取其他8个对象
      	两种写法没有任何差别
      
      <%
		    HttpServletRequest req = (HttpServletRequest) pageContext.getRequest() ;
  			req.setAttribute("name", "东方不败") ;
  			
  			request.setAttribute("name", "张三丰") ;
  	
      %>
      
      <%
      	   String name = (String) pageContext.findAttribute("name") ;
      	   out.write(name) ;
      %>
  </body>
</html>
