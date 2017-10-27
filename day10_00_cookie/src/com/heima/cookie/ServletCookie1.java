package com.heima.cookie;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//演示记录上次访问的时间
public class ServletCookie1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8") ;
		response.setContentType("text/html;charset=UTF-8") ;
		PrintWriter out = response.getWriter() ;
		
		out.write("您上次访问的时间是： ") ;
		//拿到客户端携带的记录上次访问时间的Cookie : 假设Cookie的名字是lastaccesstime , 值是一个long类型的数字
		//拿到客户端携带的所有的Cookie
		Cookie[] cs = request.getCookies() ;
		//循环判断拿到我们需要的Cookie
		for (int i = 0; cs!=null && i < cs.length; i++) {
			Cookie c = cs[i] ;
			if(c.getName().equals("lastaccesstime")){
				//说明找到了需要的Cookie
				String time = c.getValue() ;
				//将time转换成long类型的值
				long t = Long.parseLong(time) ;
				//格式化为我们需要的格式
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss") ;
				//创建一个date对象
				Date d = new Date(t) ;
				//将数据输出到页面上
				out.write(sdf.format(d) + "&nbsp;&nbsp;<a href = '"+ request.getContextPath()+"/servlet/ServletCookie2'>清除Cookie</a>") ;
			}
		}
		
		//向客户端发送Cookie
		Cookie c = new Cookie("lastaccesstime",new Date().getTime() + "") ;
		
		//设置Cookie的存活时间（只要设置了存活时间，那么此Cookie就将存储到客户端的硬盘上，不会在缓存中存储）
		c.setMaxAge(Integer.MAX_VALUE) ;
		
		//设置浏览器携带Cookie的路径
		c.setPath(request.getContextPath()) ;
		
		//设置路径如果是/，那就意味着你访问服务器上的任意工程资源都会携带此Cookie
		//c.setPath("/") ;  //设置路径是服务器的根路径    协议 + 主机名 + 端口号
		
		//发送到客户端
		response.addCookie(c) ;
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
