<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>用户登录页面</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  <body>
    <form action="login" method="post">
    	用户名:<input type="text" name="username"><br>
    	密码:<input type="password" name="password"><br>
    	<input type="radio" name="autologin" value="on">自动登录<br>
    	<input type="submit" value="提交">
    </form>
    <span style="color:red;">${error_msg }</span>
  </body>
</html>
