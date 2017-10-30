<%@ page language="java" import="java.util.*,com.heima.bean.*" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/myjstl" prefix="my" %>
<%@ taglib uri = "http://java.sun.com/jstl/core_rt" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>jstl介绍</title>
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
  	   	   request.setAttribute("name", "张无忌") ;
  	   
  	   	   List<String> list = new ArrayList<String>() ;
  	   	   list.add("aaaaaaaaaa") ;
  	   	   list.add("bbbbbbbbbbbb") ;
  	   	   list.add("ccccccc") ;
  	   	   list.add("ddddddddddd") ;
  	   	   list.add("eeeeeeeeeee") ;
  	   	   
  	   	   request.setAttribute("list", list) ;
  	   %>
       <c:out value="<font color =red>${name}</font>" default="杨过" escapeXml="false"></c:out>
       <hr>
       <c:if test="${name=='张无忌' }">
       		<c:out value="真的"></c:out>
       </c:if>
       <hr>
       <c:choose>
       		<c:when test="${10>5 }">
       			  <c:out value="真的"></c:out>
       		</c:when>
       		<c:otherwise>
       			<c:out value="假的"></c:out>
       		</c:otherwise>
       </c:choose>
       <hr>
       <c:forEach items="${list }" var = "p" begin="1" end="3" step="2" varStatus="t">
       		${p } : ${t.count }:${t.index }<br>
       </c:forEach>
       <c:redirect url="7.jsp">
       	    <c:param name="name" value="abcde"></c:param>
       </c:redirect>
       <hr>
       	不要求掌握:<br>
       <c:forTokens items="1,2,3,4,5" delims="," var="p">
       		${p }<br>
       </c:forTokens>
       <c:set var="name" value="东方不败"></c:set>
       ${name }
       
       
  </body>	
</html>
