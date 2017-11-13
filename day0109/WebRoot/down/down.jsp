<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>文件下载页面</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  <body>
    <!-- 这里提供显示给用户查看的文件下载列表 -->
    <h4><a href="${pageContext.request.contextPath }/down?filename=1.txt">1.txt</a></h4>
    <h4><a href="${pageContext.request.contextPath }/down?filename=2.xls">2.xls</a></h4>
    <h4><a href="${pageContext.request.contextPath }/down?filename=3.zip">3.zip</a></h4>
    <h4><a href="${pageContext.request.contextPath }/down?filename=柳岩.jpg">柳岩.jpg</a></h4>
  </body>
</html>
