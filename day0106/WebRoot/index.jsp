<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	//HttpSession mysession = request.getSession();
	//mysession.invalidate();
	
	request.setAttribute("yttlj", "zhouzhiruo");
	request.removeAttribute("yttlj");
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'filter.jsp' starting page</title>
  </head>
  <body>
    <c:if test="${empty user }">
    	<h1><a href="login.jsp">去登录</a></h1>
    </c:if>
    <c:if test="${not empty user }">
    	<h1>欢迎你,${user }!</h1>
    </c:if>
    <form action="test" method="post">
    	用户名:<input type="text" name="username"><br>
    	密码:<input type="password" name="password"><br>
    	<input type="submit" value="提交">
    </form>
    <a href="test?username=张无忌&password=123">GET方式发送的请求</a>
  </body>
</html>