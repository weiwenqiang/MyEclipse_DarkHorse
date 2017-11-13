<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>多文件上传</title>

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
	<form action="${pageContext.request.contextPath }/upload" method="post"
		enctype="multipart/form-data">
		<input type="button" name="addFile" value="文件上传"
			onclick="addFileItem();"><br>
		<div id="showFile"></div>
		<input type="submit" value="上传">
	</form>
	<br>
</body>
<script type="text/javascript">
	function addFileItem() {
		document.getElementById("showFile").innerHTML += "<div><input type='file' name='upload'><input type='button' id='delFile' value='删除' onclick='delFileItem(this);' ><br></div>";
	}
	function delFileItem(button) {
		var parentDiv = button.parentNode;
		parentDiv.parentNode.removeChild(parentDiv);
	}
</script>
</html>
