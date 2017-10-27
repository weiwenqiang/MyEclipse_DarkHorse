<%@ page language="java" import="java.util.*,com.heima.bean.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
	   2.el表达式对运算符的支持<br>
	      <%
	      	  request.setAttribute("n", 10) ;
	          List<String> list = new ArrayList<String>() ;
	          list.add("aaaaaaa") ;
	          
	          request.setAttribute("list", list) ;
	          
	          User user = null ;
	          request.setAttribute("user", user) ;
	      %>
	   <hr>
	   对一元运算符的支持：${-n }<br>
	   对二元运算符的支持：${3+4 } || ${n + 10} || ${n/4 }  || ${5 / n }<br>
	   对比较运算符的支持： ${n>10 } || ${n gt 10} || ${n == 10 }<br>
	   对逻辑运算符的支持： ${n > 5 && n < 10  } || ${n > 5 and n < 10  }<br>
	   对 三元运算符的支持： ${n>5?"真的":"假的" } <br>
	 对empty运算符的支持: ${empty list } || ${not empty list } <br>
	 判断对象是否为null: ${empty user} || ${not empty user}<br>
	 ${user }  ${pageContext.request.contextPath }
	 
  </body>
</html>
