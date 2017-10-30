<%@ page language="java" import="java.util.*,com.heima.bean.*" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/myjstl" prefix="my" %>
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
    	循环输出list集合中的数据<br>
    <hr>
    	<%
    		List<User> list = new ArrayList<User>() ;
    		list.add(new User("郭靖",20)) ;
    		list.add(new User("令狐冲",18)) ;
    		list.add(new User("乔峰",24)) ;
    		list.add(new User("杨过",21)) ;
    		
    		request.setAttribute("list", list) ;
    		
    		List<String> list1 = new ArrayList<String>() ;
    		list1.add("aaaaaaaaa") ;
    		list1.add("bbbbbbbb") ;
    		list1.add("cccccccc") ;
    		list1.add("dddddddddddd") ;
    		list1.add("eeeeeeeeee") ;
    		
    		request.setAttribute("list1", list1) ;
    	%>
	    <my:simpleforeach items = "${list}" var = "t">
	    	 ${t.username } : ${t.age }<br>
	    </my:simpleforeach><br>
	     <my:simpleforeach items = "${list1}" var = "t">
	    	 ${t }<br>
	    </my:simpleforeach>
  </body>
</html>
