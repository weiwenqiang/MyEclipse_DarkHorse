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
    	<h1><a href="${pageContext.request.contextPath}/demo3/login.jsp">请先去登录</a></h1>
    </c:if>
    <c:if test="${not empty user }">
    	<h1>欢迎你,${user.username }!</h1>
    	<h4>以下是功能列表</h4>
    	<h5><a href="test?url=user/look.jsp">查询商品</a></h5>
    	<h5><a href="test?url=user/buy.jsp">购买商品</a></h5>
    	<h5><a href="test?url=user/cart.jsp">查看购物车</a></h5>
    	<h5><a href="test?url=user/order.jsp">提交订单</a></h5>
    	<h5><a href="test?url=admin/add.jsp">添加商品</a></h5>
    	<h5><a href="test?url=admin/delete.jsp">删除商品</a></h5>
    </c:if>
  </body>
</html>