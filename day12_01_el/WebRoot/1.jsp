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
        <%
     	   //pageContext.setAttribute("name", "张三丰") ;
		   //request.setAttribute("name", "张无忌") ;
		   //session.setAttribute("name", "张翠山") ;
		   application.setAttribute("name", "张果老") ;
		   
		   User user = new User() ;
		   user.setUsername("郭靖") ;
		   user.setAge(20) ;
		   
		   Friend f = new Friend() ;
		   f.setName("令狐冲") ;
		   
		   Cat[] cs = new Cat[2] ;
		   cs[0] = new Cat("喵喵","白色") ;
		   cs[1] = new Cat("咪咪","黑色") ;
		   
		   f.setCats(cs) ;
		   
		   user.setFriend(f) ;
		   
		   //将数据放入某个域对象
		   session.setAttribute("user", user) ;
		   
		   List<String> list = new ArrayList<String>() ;
		   list.add("aaaaaaaaaa") ;
		   list.add("bbbbbbbb") ;
		   list.add("cccccccccc") ;
		   list.add("dddddddddd") ;
		   
		   request.setAttribute("list", list) ;
		   
		   List<User> list1 = new ArrayList<User>() ;
		   list1.add(user) ;
		   
		   request.setAttribute("list1", list1) ;
		   
		   Map<String,User> map = new HashMap<String,User>() ;
		   map.put("a", user) ;
		   
		   request.setAttribute("map", map) ;
        %>
        
        ${name }
        <hr>
        el表达式支持对象的导航:<br>
                         拿到郭靖的名字: ${user.username} || ${user["username"] }<br>
                         拿到郭靖的朋友的名字: ${user.friend.name} || ${user["friend"]["name"] }<br>
                         拿到郭靖的朋友的第一只猫的名字: ${user.friend.cats[0].name} || ${user["friend"]["cats"][0]["name"] }<br>
                         拿到郭靖的朋友的第二只猫的颜色: ${user.friend.cats[1].color} || ${user["friend"]["cats"][1]["color"] }<br>
        <hr>
                         拿到list集合中的所有数据:${list }  <br>
                         拿到list集合中的第一个数据:${list[0] }  <br>
                         集合数据的导航：${list1[0].friend.cats[0].color }<br>
        <hr>
                         拿到map中的所有的数据: ${map }<br>
                         拿到map中的第一个值： ${map["a"].friend.cats[1].color }<br>
                         
  </body>
</html>
